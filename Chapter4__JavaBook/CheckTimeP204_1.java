// # CheckTime P204 
class Human {
    public String name;
    public int age;
    public double height;
    public double weight;

    public Human() {
        name = null;
    }

    public Human(String name) {
        this.name = name;
    }
}

public class CheckTimeP204_1 {
    public static void main(String[] args) {
        Human aHuman = new Human();

        aHuman.name = "홍길동";
        aHuman.age = 21;
        aHuman.height = 180.5;
        aHuman.weight = 73.2;

        Human[] aHumans = new Human[5];
        for (int i = 0; i < aHumans.length; i++)
            aHumans[i] = new Human();
    }

}
