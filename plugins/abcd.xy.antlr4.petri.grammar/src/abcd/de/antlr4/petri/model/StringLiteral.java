package abcd.xy.antlr4.petri.model;

class StringLiteral {
	private String value;
	
	public StringLiteral(String s) {
		this.value = s;	
	}
	
	public String getValue(){
		return this.value;
	}
}