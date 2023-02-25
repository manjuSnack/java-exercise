import static java.lang.System.out;

public class Ex9_15 {

	public static void main(String[] args) {
		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		Integer i3 = Integer.valueOf("100");
		int i4 = Integer.parseInt("100", 2);
		int i5 = Integer.parseInt("100", 8);
		int i6 = Integer.parseInt("100", 16);
		int i7 = Integer.parseInt("FF", 16);
		int i8 = Integer.parseInt("FF");
		Integer i9 = Integer.valueOf("100", 2);
		Integer i10 = Integer.valueOf("100", 8);
		Integer i11 = Integer.valueOf("100", 16);
		Integer i12 = Integer.valueOf("FF", 16);
		Integer i13 = Integer.valueOf("FF");
		
		out.println(i);
		out.println(i2);
		out.println(i3);
		out.println("100(2) -> "+i4);
		out.println("100(8) -> "+i5);
		out.println("100(16)-> "+i6);
		out.println("100(FF)-> "+i7);
		out.println("100(2) -> "+i9);
		out.println("100(8) -> "+i10);
		out.println("100(16)-> "+i11);
		out.println("100(FF)-> "+i12);
	}

}
