
// # 14.29 스트림의 중간연산 - Comparator의 메서드
import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("김자바", 3, 180));

        studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()))
                .forEach(out::println); // (반별정렬 . 기본정렬) . 결과

    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getTotalScore() {
        return totalScore;
    }

    // 내림차순인 총점을 기본정렬로 한다.
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
