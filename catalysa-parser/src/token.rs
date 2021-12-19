#[derive(Clone, Copy, Debug, PartialEq)]
pub enum TokenKind {
    RESERVED,
    NUMBER,
    IDENT,
    TEXT,
}

#[derive(Clone, Debug)]
pub struct Token {
    pub kind: TokenKind,
    pub num: usize,
    pub str: String
}
