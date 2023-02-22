import static java.lang.System.out;

public class Ex8_11 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			
			out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException e) {
			out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.gc(); // Garbage Collection을 수행하여 메모리를 늘려준다.
			out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles(); // 임시파일 삭제
		} // try 끝
	} // main 끝
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if (!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles() { /* 파일 복사 */}
	static void deleteTempFiles() { /* 임시파일 삭제 */}
	
	static boolean enoughSpace() {
		// 설치에 필요한 공간을 확인
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치에 필요한 메모리공간 확인
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg){
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg){
		super(msg);
	}
}
