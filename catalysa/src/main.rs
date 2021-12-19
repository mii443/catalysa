use catalysa_parser::tokenizer::Tokenizer;

fn main() {
    let mut tokenizer = Tokenizer {
        code: "1 + 2;".to_string()
    };

    println!("{:?}", tokenizer.tokenize());
}
