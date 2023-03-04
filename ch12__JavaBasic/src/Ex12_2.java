import static java.lang.System.*;
import java.util.*;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            // Student s = (Student) it.next(); // Generics를 사용하지 않으면 형변환이 필요하다
            Student s = it.next();
            out.println(s.name);
        }
    }// main
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

}
