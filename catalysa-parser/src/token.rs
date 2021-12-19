#[derive(Clone, Debug, PartialEq)]
pub enum Token {
    Reserved {
        text: String
    },
    Number {
        number: usize
    },
    Ident {
        text: String
    },
    Text {
        text: String
    },
}
