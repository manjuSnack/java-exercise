import static java.lang.System.out;

public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2))
			out.printf("%s과 %s는 같습니다.%n", v1, v2);
		else
			out.printf("%s과 %s는 다릅니다.%n", v1, v2);
	} // main
}

class Value {
	int value;
	
	Value(int value){
		this.value = value;
	}
	
//	Object의 equals( )를 overriding하여 주소가 아닌 value를 비교
	public boolean equals(Object obj) {
//		return this==obj; 주소 비교 시 서로 다른 객체는 항상 거짓
		if (!(obj instanceof Value)) return false; // 참조변수의 형변환 전에는 반드시 instanceof로 확인할 것!
		
		Value v = (Value)obj; // obj를 value로 형변환
		
		return this.value==v.value;
	}
}
