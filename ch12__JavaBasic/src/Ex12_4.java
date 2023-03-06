import static java.lang.System.*;
import java.util.ArrayList;

class Fruit2 {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class FruitBox2<T extends Fruit2> extends Box2<T> {
}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    // static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
    // String tmp = "";

    // for (Fruit2 f : box.getList())
    // tmp += f + " ";
    // return new Juice(tmp);
    // }

    // #12-14 지네릭 메서드
    // 지네릭 클래스가 아닌 클래스에서도 선언이 가능. 반환타입 앞에 지네릭 타입을 선언한다.
    static <T extends Fruit2> Juice makeJuice(FruitBox2<T> box) {
        String tmp = "";
        for (Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);

    }
}

public class Ex12_4 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        // FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();
        // FruitBox<Apple> → FruitBox<? extends Fruit> 형변환 가능

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        out.println(Juicer.makeJuice(fruitBox));
        out.println(Juicer.makeJuice(appleBox));

        // #12-14 지네릭 메서드
        out.println(Juicer.<Fruit2>makeJuice(fruitBox)); // Compiler가 대입된 타입을 추정할 수 있기에 생략이 가능
        out.println(Juicer.<Apple2>makeJuice(appleBox));
        // out.println(<Fruit2>makeJuice(fruitBox)); // 참조변수나 클래스 이름을 생략할 수 없다.

        // #12-15 지네릭타입의 형변환
        Box2 box2 = null;
        Box2<Object> objBox2 = null;

        box2 = (Box2) objBox2; // 지네릭타입(generic type) → 원시타입(primitive type). 경고발생
        objBox2 = (Box2<Object>) box2; // 원시타입 → 지네릭타입

        Box2<Object> objBox3 = null;
        Box2<String> strBox3 = null;
        // objBox3 = (Box2<Object>) strBox3; // 에러. Box<String> → Box<Object> 형변환 불가능
        // strBox3 = (Box2<String>) objBox3; // 에러. Box<Object> → Box<String> 형변환 불가능

        Box2<? extends Object> wBox = new Box2<String>(); // Box<String> → Box<? extends Object> 형변환 가능

    } // main
}
