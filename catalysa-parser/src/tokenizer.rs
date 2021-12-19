use nom::{IResult, branch::alt, bytes::complete::tag};

use crate::token::Token;

pub struct Tokenizer {
    pub code: str
}

impl Tokenizer {
    pub fn tokenize(&mut self) -> Vec<Token> {
        let mut tokens: Vec<Token> = vec![];
        let mut code = &self.code;
        while code != "" {

        }
        vec![]
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
    fn reserved_test() {
        assert_eq!(Tokenizer::reserved("+"), Ok(("", "+")));
        assert_eq!(Tokenizer::reserved("=="), Ok(("", "==")));
        assert_eq!(Tokenizer::reserved("="), Ok(("", "=")));
        assert_eq!(Tokenizer::reserved("for"), Ok(("", "for")));
    }
}