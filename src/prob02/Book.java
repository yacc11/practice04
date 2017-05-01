package prob02;

public class Book {
	//생성자 생성
	//책 번호 검색
	//번호 비교 
	//책.lent
	private int bookno;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookno,String title,String author){
		
		this.bookno=bookno;
		this.title=title;
		this.author=author;
		this.stateCode=1;
	}
	
	

	public void rent(){
		this.stateCode=0;
		System.out.println(this.title+"이/(가) 대여 됐습니다. "); //입력받은 변수에 따라 대여 진행.
	}
	public void print(){
		System.out.print("책 제목 :"+this.title+", 작가:"+this.author+", 대여 유무:"); //출력문 
		if(this.stateCode==0){ //현재 대여중이면 출력을 다르게 함
			System.out.println("대여중");
		}
		else{
			System.out.println("재고있음");
		}
	}
	
}
