/**
 * 
 * @author manjuSnack
 *
 *
 * 8장, 첫 번째 자바 프로그램 작성하기.
 * 
 * 예제 1-1. Ex1_1
 * 
 * 
 */

public class Ex1_1 {

	public static void main(String[] args) {
		System.out.println("Hell, world."); // 화면에 글자를 출력한다.
		System.out.println("/*주석 아님*/"); // " "안에는 //(한줄주석)와 /**/(여러줄 주석)은 사용되지 못 한다.
		System.out.println("//Hell, world.");
		
	}
 
}   

/*

🍘 Ch01. 13~16장, Eclipse의 단축키, Eclipse의 자동완성 기능, Eclipse의 주석(Comment), 자주 발생하는 에러와 해결방법

ctrl+shift+L : 단축키 전체 목록보기
ctrl+ '+, -' : Font 크기 증가/감소
ctrl+D : 한줄 삭제
ctrl+alt+down : 행단위 복사

🍘 단축키 재설정 방법
: Windows - Preferences - General - Appearance - Keys - copy line 검색(행단위 복사일 경우) - Binding 에서 단축키 설정 - Apply and Close

alt+shift+A : 멀티컬럼 편집(토글:같은 단축키로 On, Off)
alt+up, down : 선택한 행단위 이동
tab : 들여쓰기
shift+tab : 내어쓰기
ctrl+i : 들여쓰기, 내어쓰기 자동맞춤
ctrl+/ : 주석(토글) 
ctrl+space : 자동완성

🍘 자동완성 재설정 방법
Windows - Preferences - Java - Editor - Templates - sysout(바꾸고 싶은 자동완성 이름 찾아 선택) - Edit - Name 변경(sysout를 sop로 바꿈) - Rename - Apply Close

🍘 자동완성 확장 방법
Windows - Preferences - Java - Editor - Content Assist - Auto Activation treggers for Java에서 . 를 .abcdefghijklmnopqrstuvwxyz로 바꾸고 저장

----

🍘 17~19장 책의 소스와 강의자료 다운로드, Eclipse 소스파일 가져오기, 내보내기

🍘 소스파일 불러오기
Eclipse 좌측 View에 Package Workspace에서 빈공간 우클릭 import - General - Existing Projects into Workspace - Select root directory로 Directory 찾기, Copy projects into workspace 체크(복사본으로 불러오기)

🍘 소스파일 내보내기
Eclipse 좌측 View에 Package Workspace에서 빈공간 우클릭 export - General - Archive file - Export할 Project 선택, to archive file 경로 선택 

*/

