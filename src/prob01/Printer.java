package prob01;

public class Printer {
//	private int number;
//	private String statement;
//	private boolean bool;
//	
//	public Printer(int number,boolean bool,String statement){
//		this.number=number;
//		this.bool=bool;
//		this.statement=statement;
//	}
//	
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public String getStatement() {
//		return statement;
//	}
//	public void setStatement(String statement) {
//		this.statement = statement;
//	}
//	public boolean isBool() {
//		return bool;
//	}
//	public void setBool(boolean bool) {
//		this.bool = bool;
//	}

	public void println(int number){ //생성자 오버로딩
		System.out.println(number);
	}

	public void println(boolean b) { //생성자 오버로딩
		// TODO Auto-generated method stub
		System.out.println(b);
	}

	public void println(double d) { //생성자 오버로딩 
		// TODO Auto-generated method stub
		System.out.println(d);
	}

	public void println(String string) { //생성자 오버로딩
		// TODO Auto-generated method stub
		System.out.println(string);
	}
	
}
