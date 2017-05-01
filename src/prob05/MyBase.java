package prob05;

public class MyBase extends Base {
	public void service(String string){ //오버라이딩
		if(string=="낮"){
			day();
		}
		else if(string=="밤"){
			night();
		}
		else{
			afternoon();
		}
	}
	
	public void day(){ //오버라이딩 
		System.out.println("낮에는 열심히 일하자");
	}
	
	public void night(){ //오버라이딩 
		System.out.println("night");
	}
	public void afternoon(){ //오버라이딩
		System.out.println("오후에도 낮과 마찬가지로 일해야 합니다.");
	}
}
