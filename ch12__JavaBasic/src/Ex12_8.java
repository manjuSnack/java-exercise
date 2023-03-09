
// Java의정석 3판에서는 이 예제가 AnnotationEx5.java 이다.
import static java.lang.System.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface TestInfo {
    int count() default 1;

    String testedBy();

    String[] testTools() default "JUnit";

    TestType testType() default TestType.FIRST;

    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface DateTime {
    String yymmdd();

    String hhmmss();
}

enum TestType {
    FIRST, FINAL
}

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testTools = { "JUnit",
        "JUnit5" }, testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class Ex12_8 {
    public static void main(String[] args) {
        // Ex12_8의 Class객체 얻기
        Class<Ex12_8> cls = Ex12_8.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        out.println("anno.testedBy()=" + anno.testedBy());
        out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());

        for (String str : anno.testTools())
            out.println("testTools=" + str);

        out.println();

        // Ex12_8에 적용된 모든 애너테이션을 가져오기
        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr)
            out.println(a);
    }
}

/*
 * 결과
 * anno.testedBy()=aaa
 * anno.testDate().yymmdd()=160101
 * anno.testDate().hhmmss()=235959
 * testTools=JUnit
 * 
 * @java.lang.Deprecated(forRemoval=false, since="")
 * 
 * @TestInfo(count=1, testType=FIRST, testTools={"JUnit"}, testedBy="aaa",
 * testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
 * PS D:\Coding\tutorial\java-exercise>
 */