// #14.45~14.46 collect()와 Collectors, 스트림을 컬렉션, 배열로 변환
// #14.47~49 스트림의 통계 - counting(), summingInt() /스트림을 리듀싱 - reducing() / 스트림을 문자열로 결합 - joining()
// #자바의정석3 - StreamEx6.java 참고

import static java.lang.System.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class toLearn47_ {
    public static void main(String[] args) {
        // # Ex14_5 참고. 책에는 아래 몇몇 내용이 생략되어 있었다.
        Student[] stuArr = {
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                // new Student("김자바", 3, 180),
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        // 학생 이름만으로 List<String>에 저장
        List<String> names = stuStream.map(Student::getName)
                .collect(Collectors.toList());
        out.println(names);

        // List, Set이 아닌 특정 컬렉션은 toCollection( ) 사용
        ArrayList<String> list = names.stream().collect(Collectors.toCollection(ArrayList::new));
        out.println(list);

        // 스트림 → 배열

        // stuStream은 예외발생. Stream.of(stuArr)로 작성할 것
        // Map<String, Student> stuMap = Stream.of(stuArr)
        // .collect(Collectors.toMap(s -> s.getName(), s -> s));
        // s-> s 대신 Function.identity()로 대신할 수 있다.
        Map<String, Student> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s -> s.getName(), Function.identity()));
        for (String name : stuMap.keySet())
            out.println(name + "-" + stuMap.get(name));

        // # 14.47 스트림의 통계 - counting(), summingInt()
        // long count = Stream.of(stuArr).count();
        long count = Stream.of(stuArr).collect(counting());
        out.println("count=" + count);

        // mapToInt()와 collect(summingIng)의 비교
        // long totalScore = Stream.of(stuArr).mapToInt(Student::getTotalScore).sum();
        long totalScore = Stream.of(stuArr).collect(summingInt(Student::getTotalScore)); // summingInt

        totalScore = Stream.of(stuArr).collect(reducing(0, Student::getTotalScore, Integer::sum)); // reducing
        out.println("totalScore=" + totalScore);

        // Optional<Student> topStudent =
        // Stream.of(stuArr).max(Comparator.comparingInt(Student::getTotalScore)); //
        // 최고점수 비교
        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(maxBy(Comparator.comparingInt(Student::getTotalScore)));
        out.println(topStudent);

        IntSummaryStatistics stat = Stream.of(stuArr).collect(summarizingInt(Student::getTotalScore));
        out.println(stat); // count, min, max, sum, and average의 결과를 보여줌

        // # 14.48 스트림을 리듀싱 - reducing()
        IntStream intStream = new Random().ints(1, 46).distinct().limit(6); // 로또번호

        // OptionalInt max = intStream.reduce(Integer::max);
        // boxed()로 IntStream을 Stream<Integer>로 변환해야 매개변수 3개 → 1개인 collect를 사용할 수 있다.
        Optional<Integer> max = intStream.boxed().collect(reducing(Integer::max));
        out.println(max);

        // #14.49 스트림을 문자열로 결합
        // String studentNames =
        // Stream.of(stuArr).map(Student::getName).collect(joining()); //
        // 이자바김자바안자바박자바소자바나자바

        // String studentNames =
        // Stream.of(stuArr).map(Student::getName).collect(joining(",")); //
        // 이자바,김자바,안자바,박자바,소자바,나자바

        String studentNames = Stream.of(stuArr).map(Student::getName).collect(joining(",", "[", "]")); // [이자바,김자바,안자바,박자바,소자바,나자바]
        out.println(studentNames);
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
        return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
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

    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}