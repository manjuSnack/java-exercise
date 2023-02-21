import static java.lang.System.out;

public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };
		
		for (int i=0; i<group.length; i++)
			group[i].move(100, 200);
	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		out.printf("marint[x=%d, y=%d]%n", x, y);
	}
	void stimPack() { /* 스팀팩을 사용한다 */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		out.printf("Tank[x=%d, y=%d]%n", x, y);
	}
	void changeMode() { /* 시즈모드로 변환한다 */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		out.printf("Dropship[x=%d, y=%d]%n", x, y);
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}
