public class Ex8_13 {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main의 끝


static void install() throws InstallException {
	try {
		startInstall();
		copyFiles();
	} catch (SpaceException2 e) {
		InstallException ie = new InstallException("설치 중 예외발생");
		ie.initCause(e); // e가 ie의 원인 예외
		throw ie;
	} catch (MemoryException2 me) {
		InstallException ie = new InstallException("설치 중 예외발생");
		ie.initCause(me); // me가 ie의 원인 예외
		throw ie;
	} finally {
		deleteTempFiles(); // 임시파일 삭제
	} // try 끝
}

static void startInstall() throws SpaceException2, MemoryException2 {
	if(!enoughSpace()) {
		throw new SpaceException2("설치할 공간이 부족합니다.");
	}
	
	if(!enoughMemory()) {
		throw new MemoryException2("메모리가 부족합니다.");
	}
}// startInstall메서드의 끝

static void copyFiles() { /* 파일 복사 */};
static void deleteTempFiles() { /* 임시파일 삭제 */};

static boolean enoughSpace() {
	return false;
}

static boolean enoughMemory() {
	return true;
}
} 

class InstallException extends Exception {
	InstallException(String msg){
		super(msg);
	}
}
class SpaceException2 extends Exception {
	SpaceException2(String msg){
		super(msg);
	}
}
class MemoryException2 extends Exception {
	MemoryException2(String msg){
		super(msg);
	}
}


