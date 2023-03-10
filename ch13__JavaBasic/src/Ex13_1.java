
// #13.4 쓰레드의 구현과 실행 예제
import static java.lang.System.*;

class ThreadEx1_1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			// 조상인 Thread의 getName()을 호출
			out.println("ThreadEx1_1 : " + getName());
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++)
			// Thread.currentThread() : 현재 실행중인 Thread를 반환
			out.println("ThreadEx1_2 : " + Thread.currentThread().getName());
	}
}

public class Ex13_1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		// Runnable r = new ThreadEx1_2();
		// Thread t2 = new Thread(r); // 생성자 Thread(java.lang.Runnable arg0)

		Thread t2 = new Thread(new ThreadEx1_2()); // 위의 2줄을 1줄로 간단히

		t1.start();
		t2.start();
	}

}
