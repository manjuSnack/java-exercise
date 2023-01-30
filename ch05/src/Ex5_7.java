/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-16~17, Command line 입력받기
 */ 
public class Ex5_7 {
//	Run -> Run Configurations -> Arguments 에서 매개변수(Argument)를 main()로 보낼 수 있다.
	public static void main(String[] args) {
		System.out.println("매개변수의 개수:"+args.length);
		for (int i=0; i<args.length; i++) System.out.println("args["+i+"] = \"" + args[i] + "\""); // 매개변수의 개수:0
	} // main
}