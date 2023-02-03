/**
 * 
 * @author manjuSnack
 *
 * 예제 4-4. 생성자 선언 및 활용 연습
 * 
 * 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화하라.
 * 
 * 예제 4-5. this()로 다른 생성자 호출
 * 
 * 예제 4-4에서 작성한 Book 클래스의 생성자를 this()를 이용하여 수정하라.
 */
public class Book {
	String title;
	String author;
	
	void show() { System.out.println(title + " " + author); }
	
	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book(String title) {
		this(title, "작자미상"); // this로 Book(String title, String author) method로 옮겨간다.
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전"); 
		Book emptyBook = new Book();
		loveStory.show();
	}
}
