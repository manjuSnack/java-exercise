import java.util.*;
import static java.lang.System.*;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
        // ArrayList<Product> tvList = new ArrayList<Tv>();
        // Error. generics의 type variable은 참조변수와 생성자에서 타입이 일치해야 한다.
        // List<Tv> tvList = new ArrayList<Tv>(); // OK. 다형성

        productList.add(new Tv()); // public boolean add(Pruduct e)
        productList.add(new Audio());

        tvList.add(new Tv()); // public boolean add(Tv e)
        // tvList.add(new Audio()); // Error.

        printAll(productList);
        // printAll(tvList); Error. PrintAll의 type variable와 다른 type vaiable이다.
    } // main

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            out.println(p);
    }
}
