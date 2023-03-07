import static java.lang.System.*;

enum Direction2 {
    // name( )
    EAST(1, "→"), SOUTH(2, "↓"), WEST(3, "←"), NORTH(4, "↑");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) { // 접근 제어자 private가 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction2 of(int dir) {
        if (1 > dir || dir > 4)
            throw new IllegalArgumentException("Invalid value :" + dir);
        return DIR_ARR[dir - 1];
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전
    public Direction2 rotate(int num) {
        num = num % 4; // 1~4
        out.println("num % 4 :" + num); // num이 -1일 때 몫은 0, 나머지는 -1

        if (num < 0) {
            out.printf("num < 0 : %d%n", num);
            num += 4; // num이 음수일 때는 시계반대방향으로 1칸 회전. 따라서 시계방향으로 돌때에는 3칸 회전하여 움직인다.
            out.printf("num += 4 : %d%n", num);
        }

        out.printf("value - 1 : %d%n", (value - 1));
        out.printf("value - 1 + num : %d%n", (value - 1 + num));
        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }

} // enum Direction2

public class Ex12_6 {
    public static void main(String[] args) {
        for (Direction2 d : Direction2.values())
            out.printf("%s=%d%n", d.name(), d.getValue());

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        out.println(Direction2.EAST.rotate(1));
        out.println(Direction2.EAST.rotate(2));
        out.println(Direction2.EAST.rotate(3));
        out.println(Direction2.EAST.rotate(4));
        out.println(Direction2.EAST.rotate(-1));
        out.println(Direction2.EAST.rotate(-2));

    }
}
