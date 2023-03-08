
// #12-26 @Deprecated / #자바의정석 3판 참고
import static java.lang.System.*;

class NewClass {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class AnnotationEx2 {
    public static void main(String[] args) {
        NewClass nc = new NewClass();

        nc.oldField = 10; // @Deprecated가 붙은 대상 사용
        out.println(nc.getOldField()); // @Deprecated가 붙은 대상 사용
    }
}
