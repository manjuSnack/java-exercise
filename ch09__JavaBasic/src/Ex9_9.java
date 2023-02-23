import java.util.StringJoiner;
import static java.lang.System.out;

public class Ex9_9 {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[ ] arr = animals.split(",");
		
		out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) // arr에 각 값을 참조변수 s에 저장
			sj.add(s);
		
		out.println(sj.toString());
	}

}
