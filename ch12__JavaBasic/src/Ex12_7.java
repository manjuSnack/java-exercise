class Parent {
    void parentMethod() {
    }
}

class Child extends Parent {
    @Override
    // void parentmethod() { // 조상 메서드의 이름을 잘못 적었다. @Override annotation이 이를 체크해준다.
    void parentMethod() {
    }
}

public class Ex12_7 {
}
