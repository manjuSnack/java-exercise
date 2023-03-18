// #14.6 스트림의 중간연산 - map( )

import static java.lang.System.*;
import java.io.*;
import java.util.stream.*;

public class Ex14_6 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1"),
                new File("Ex1.txt") };

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(out::println); // 모든 파일의 이름을 출력

        fileStream = Stream.of(fileArr); // 스트림을 다시 생성

        fileStream.map(File::getName) // Stream<File> → Stream<String>
                .filter(s -> s.indexOf('.') != 1) // 확장자가 없는 것은 제외
                .peek(s -> out.printf("filename=%s%n", s)) // 파일명을 출력한다.
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출. ' .java '에서 확장자 .을 기준으로 다음 첫번째( 1 )부터
                .peek(s -> out.printf("extension=%s%n", s)) // 확장자를 출력한다.
                .map(String::toUpperCase) // 모두 대문자로 변환
                .distinct() // 중복제거
                .forEach(out::print); // JAVABAKTXT

        out.println();
    }
}
