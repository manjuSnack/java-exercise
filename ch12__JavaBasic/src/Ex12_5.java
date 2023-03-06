import static java.lang.System.*;

enum Direction {
    EAST, SOUTH, WEST, NORTH
}

class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        out.println("d1=" + d1);
        out.println("d2=" + d2);
        out.println("d3=" + d3);

        out.println("d1==d2 ? " + (d1 == d2));
        out.println("d1==d3 ? " + (d1 == d3));
        out.println("d1.equals(d3) ? " + d1.equals(d3));
        // out.println("d1 > d3 ? " + (d1 > d3)); // Error
        out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
        out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));

        switch (d1) {
            // case Direction.EAST: // 사용 불가
            case EAST:
                out.println("The direction is EAST.");
                break;
            case SOUTH:
                out.println("The direction is SOUTH.");
                break;
            case WEST:
                out.println("The direction is WEST.");
                break;
            case NORTH:
                out.println("The direction is NORTH.");
                break;
            default:
                out.println("Invalid direction.");
                break;
        }

        Direction[] dArr = Direction.values();

        for (Direction d : dArr) // for (Direction d : Direction.values())
            out.printf("%s=%d%n", d.name(), d.ordinal());
    }
}
