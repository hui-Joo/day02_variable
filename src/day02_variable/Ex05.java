package day02_variable;

public class Ex05 {
	
	public static void main(String[] args) {
		
		final int i = 100;	//상수화 (final : 값을 변경 못 하도록 함)
		// i = 200;
		System.out.println(i);
		
		final String KOREA = "대한민국"; // 상수화할땐 모든 문자의 값은 대문자로 작성한다.
		// KOREA = "미국";	문자열은 " " 로 묶어준다.
		System.out.println(KOREA);
	}

}
