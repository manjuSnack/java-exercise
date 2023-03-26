// #15.38 직렬화와 역직렬화 예제 1 ( Ex15-19 )
// 예제2번에 대한 UserInfo Class 작성

public class UserInfo implements java.io.Serializable { // 직렬화가 가능하도록 Serializable인터페이스 구현
    String name;
    String password;
    int age;

    public UserInfo() {
        this("Unknown", "1111", 0);
    }

    public UserInfo(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String toString() {
        return "(" + name + "," + password + "," + age + ")";
    }
}
