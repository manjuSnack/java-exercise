
// #13.32 synchronized를 이용한 동기화
import static java.lang.System.*;

public class Ex13_12 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
            // balance = balance - money;
        }
    } // withdraw
}

class RunnableEx12 implements Runnable {
    Account acc = new Account();

    public void run() {
        while (acc.getBalance() > 0) {
            // 100, 200, 300중 한 값을 임의로 선택해서 출금(withdraw)
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            out.println("balance:" + acc.getBalance());
        }
    } // run( )
}