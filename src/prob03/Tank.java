package prob03;

public class Tank extends Unit{
	
	// 현재 위치
	private int x;
	private int y; 
	
	void move( int x, int y ) {  //부모클래스의 메소드를 오버라이딩
		/* 지정된 위치로 이동 */ 
	}
	
	void stop() {  //부모클래스의 메소드를 오버라이딩
		/* 현재 위치에 정지 */ 
	}
	
	void changeMode() {
		/* 공격모드를 변환한다. */
	}	
}
