/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-15~16, 논리 연산자, 논리 부정연산자
 */
public class Ex3_16 {

	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!( 'a' <= ch && ch <='z' )=%b%n", !( 'a'<=ch && ch <='z' ));
		System.out.printf(" 'a'<=ch && ch <='z' =%b%n",  'a'<=ch && ch <='z' );
	} // main

}
