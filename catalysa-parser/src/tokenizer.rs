use nom::{IResult, branch::alt, bytes::complete::{tag, take_while, take_while1}, character::{complete::digit1, is_alphabetic, is_alphanumeric}};

use crate::token::*;

pub struct Tokenizer {
    pub code: String
}

impl Tokenizer {
    pub fn tokenize(&mut self) -> Vec<Token> {
        let mut tokens: Vec<Token> = vec![];
        let mut code = self.code.as_str();
        while code != "" {
            {
                if Tokenizer::is_whitespace(code.chars().next().unwrap()) {
                    code = &code[1..];
                }
            }

            match Tokenizer::reserved(code) {
                Ok((input, reserved)) => {
                    code = input;
                    tokens.push(Token::Reserved {
                        text: reserved.to_string()
                    });

                    continue;
                },
                Err(_) => {},
            }

            match Tokenizer::number(code) {
                Ok((input, number)) => {
                    code = input;
                    tokens.push(Token::Number { 
                        number: number
                    });
                    continue;
                },
                Err(_) => {},
            }

            match Tokenizer::ident(code) {
                Ok((input, ident)) => {
                    code = input;
                    tokens.push(Token::Ident {
                        text: ident.to_string()
                    });

                    continue;
                },
                Err(_) => {},
            }

            break;
        }
        tokens
    }

    fn is_whitespace(ch: char) -> bool {
        ch == '\t' || ch == '\n' || ch == ' ' || ch == '\r'
    }

    fn is_ident(ch: char) -> bool {
        is_alphabetic(ch as u8)
    }

    fn ident(input: &str) -> IResult<&str, &str> {
        take_while1(Tokenizer::is_ident)(input)
    }

    fn number(input: &str) -> IResult<&str, usize> {
        let (input, digit) = digit1(input)?;
        Ok((input, digit.parse::<usize>().unwrap()))
    }

    fn reserved(input: &str) -> IResult<&str, &str> {
        alt((
            alt((
                tag("+="),
                tag("-="),
                tag("*="),
                tag("/="),
                tag("&&"),
                tag("||"),
                tag("&"),
                tag("=="),
                tag("="),
                tag("!="),
                tag(">="),
                tag("<="),
                tag(">"),
                tag("<"),
                tag(";"),
                tag(":"),
                tag(","),
                tag("."),
                tag("\""),
            )),
            alt((
                tag("+"),
                tag("-"),
                tag("*"),
                tag("/"),
                tag("("),
                tag(")"),
                tag("{"),
                tag("}"),
                tag("->"),
                tag("for"),
                tag("f"),
                tag("while"),
                tag("if"),
                tag("else"),
                tag("let"),
                tag("return")
            ))
        ))(input)
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn tokenize_test() {
        let mut tokenizer = Tokenizer {
            code: "1 + 2 abc".to_string()
        };
        assert_eq!(
            tokenizer.tokenize(), 
            vec![
                Token::Number { number: 1 },
                Token::Reserved { text: "+".to_string() },
                Token::Number { number: 2 },
                Token::Ident { text: "abc".to_string() }
                ]
            )
    }

    #[test]
    fn reserved_test() {
        assert_eq!(Tokenizer::reserved("+"), Ok(("", "+")));
        assert_eq!(Tokenizer::reserved("=="), Ok(("", "==")));
        assert_eq!(Tokenizer::reserved("="), Ok(("", "=")));
        assert_eq!(Tokenizer::reserved("for"), Ok(("", "for")));
    }
}
