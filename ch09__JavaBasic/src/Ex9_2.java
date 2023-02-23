import static java.lang.System.out;

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if (obj instanceof Person) 
			return id==((Person)obj).id; // obj가 Object 타입이므로 id값을 참조하기 위해 Person 타입으로 형변환
		else 
			return false;
	}
	
	Person(long id){
		this.id = id;
	}
}

public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2))
			out.println("p1과 p2는 같은 사람입니다.");
		else
			out.println("p1과 p2는 다른 사람입니다.");
	}

}
