package prob04;

public class Depart extends Employee {
	private String department;
	
	public Depart(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
		super(string,i); //부모클래스의 생성자를 가져다씀 
		this.department=string2;
	}
	public void getInformation(){ //오버라이딩
		System.out.print( "이름:" + getName() + " 연봉:" + getSalary()+" 부서:"+this.department );
	}

}
