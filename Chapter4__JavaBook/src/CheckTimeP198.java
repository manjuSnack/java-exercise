/**
 * 
 * @author manjuSnack
 *
 * CheckTime P198.
 * 
 * (1) 다음 코드에서 잘못된 부분이 3군데 있다. 모두 수정하라.
 * (2) 다음 코드에서 오류를 포함하고 잇다. 이유를 설명하고 올바르게 수정하라.
 * (3) this와 this()의 차이를 설명하라. 
 */
// (1) field(멤버 변수)를 private로, 생성자(Constructor) method는 void를 쓰지 않는다. this()는 첫 문장으로 작성한다.
class Samp {
	private int id;
	
	public Samp(int x) {
		this.id = x;
	}
	
	public Samp() {
		this(0);
		System.out.println("생성자 호출");
	}
}

// (2) 기본 생성자(default Constructor)를 호출하므로 작성해야 한다.
class ConstructorExample{
	int x;
	public void setX(int x) { this.x = x; }
	public int getX() { return x;}
	public ConstructorExample(int x) {
		this.x = x;
	}
	
	// 다음의 기본 생성자를 추가해야 한다.
	public ConstructorExample() {
		this.x = 0;
	}
}

public class CheckTimeP198 {

	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample();
		int n = a.getX();

	}
}

// (3) this는 현재 실행되는 method가 속한 객체(Object)에 대한 Reference이고,
// this()는 클래스의 생성자(Constructor)에서 다른 생성자를 호출할 때 사용한다.
