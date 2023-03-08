
// #12-28 @SuppressWarnings / #자바의정석 3판 참고
import static java.lang.System.*;
import java.util.ArrayList;

class newClass {
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

public class AnnotationEx3 {
    public static void main(String[] args) {

        NewClass nc = new NewClass();

        nc.oldField = 10;
        out.println(nc.getOldField());

        @SuppressWarnings("unchecked") // 지네릭스 관련 경고를 억제
        ArrayList<NewClass> list = new ArrayList(); // 타입을 지정하지 않음.
        list.add(nc);
    }
}
