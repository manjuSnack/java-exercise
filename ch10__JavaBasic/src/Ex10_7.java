import static java.lang.System.out;
import java.text.*;

public class Ex10_7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");

		try {
			Number num = df.parse("1,234,567.89");
			out.print("1,234,567.89" + " -> ");

			double d = num.doubleValue();
			out.print(d + " -> ");

			out.println(df.format(num));
		} catch (Exception e) {
		}
	}

}

/*
 * 결과
 * 1,234,567.89 -> 1234567.89 -> 1,234,567.89
 */