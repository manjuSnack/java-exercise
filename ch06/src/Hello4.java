/**
 * 
 * @author manjuSnack
 * 🍘 #ch6-5 한 파일 여러 클래스 작성하기
 */

// 가능한 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직

class Hello1 {}
class Hello2 {}

// -- 소스파일의 이름은 public class이름과 일치
//public class Hello2 {}

// -- 하나의 소스파일에는 하나의 public class만 허용
//public class Hello1 {}
//public class Hello2 {}

// -- 에러는 없지만 소스파일(Hello4.java)과 클래스 이름(hello4.java)과 일치하지 않은 경우 다른 main()를 호출한다. 
// -- 이 경우에는 수동으로 main()를 지정하면 해결된다. Run --> Run Configurations --> Main class --> hello4
class Hello3 {} 
class hello4 { public static void main(String[] args) {
	System.out.println("hello");
	}
}
class Hello5 {}