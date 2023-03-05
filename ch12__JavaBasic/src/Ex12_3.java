import static java.lang.System.*;
import java.util.ArrayList;

interface Eatable {
}

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

public class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
        // FruitBox<Grape> grapeBox = new FruitBox<Apple>(); // Error. 타입 불일치
        // FruitBox<Toy> toyBox new FruitBox<Toy>(); // Error. Fruit과 Toy 타입은 전혀 다른
        // 타입(클래스)이다

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        // appleBox.add(new Grape()); // Error. Grape는 Apple의 자손이 아니다
        grapeBox.add(new Grape());

        out.println("fruitBox-" + fruitBox);
        out.println("appleBox-" + appleBox);
        out.println("grapeBox-" + grapeBox);
    } // main
}
