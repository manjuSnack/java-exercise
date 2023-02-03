/**
 * 
 * @author manjuSnack
 *
 * 예제 6-2. Point 클래스에 toString() 작성
 * 
 * Point 클래스에 Point 객체를 문자열로 return하는 toString() method를 작성하라.
 */
class PointOther {
	int x, y;
	public PointOther(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() { // Point 객체를 문자열로 return하는 toString() 작성
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		PointOther p = new PointOther(2, 3);
		System.out.println(p.toString()); // 객체(Constructor)가 따로 있기 때문에 default인 Object의 toString 값으로는 나오지 않는다.
		System.out.println(p); // p는 p.toString()으로 변환. 
		System.out.println(p + "입니다.");
		System.out.println(p + "입니다.");
		
		// 🍨 String()의 기본값은 'Class명@hashCode'이다. 이 결과값은 'PointOther@1694819250'이 default인 Object의 toString 값이다.
		System.out.println(p.getClass().getName()); 
		System.out.println(p.hashCode()); 		
	}

}
