package utils;

public class Token {
	public enum TokenType{PLU, MIN, MUL, DIV, MOD, LPA, RPA, NUM, CEL}
	
	private TokenType _type;
	private double _value;
	private String _col;
	private int _row;
	private int _precedence;
	
	public Token(TokenType type, int precedence){
		_type = type;
		_precedence = precedence;
	}
	
	public Token(TokenType type, double value){
		_type = type;
		_value = value;
	}
	
	public Token(TokenType type, String col, int row){
		_type = type;
		_col = col;
		_row = row;
	}
	
	public TokenType getType(){return _type;}
	public double getValue(){return _value;}
	public int getRow(){return _row;}
	public String getCol(){return _col;}
	public int getPrecedence(){return _precedence;}
	
}
