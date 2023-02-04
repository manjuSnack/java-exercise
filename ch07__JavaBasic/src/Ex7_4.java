/**
 * 
 * @author manjuSnack
 * 🍭 #ch7-10~11 참조변수 super, 생성자 super()
 */
public class Ex7_4 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.printf("x=%d, y=%d, z=%d%n", p.x, p.y, p.z);
	}

}

class Point {
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z){
		super(x, y); // Point(int x, int y)를 호출
		this.z = z;
	}
}