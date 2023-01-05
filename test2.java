package homework2;

import java.util.Scanner;

public class StringExam2 {
	/*
	 * 사용자의 이메일을 입력 받아서 아래의 조건에 맞게 출력해보세요
	 * 1. ID(Email) 입력하세요
	 * 2. 입력 후 빈 문자열인지 검사 하세요.isempty
	 * 3. 빈 문자열이 아닌 경우 아래처럼 검사하세요 
	 * 3_1 ID와 서버로 분리하여 ID를 검증(idValidate())하시는데 substring indexof
	 * 길이는 8 ~ 12 자 사이어야 하고, 반드시 첫자는 대문자 여야 합니다.
	 * 또한 ID 중에는 반드시 숫자가 하나 이상 있어야 합니다.
	 * 만약 위의 조건이 틀린경우, 뭐가 트렸는지 메세지를 띄우고, 모두 정상이면
	 * 사용자에게 로그인 되었습니다. 라고 출력시키세요.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이메일을 입력하세요");
		String email = sc.nextLine();
		
		try {
		String id = email.substring(0,email.indexOf(('@')));
		String server = email.substring(email.indexOf('@')+1);
		if(id.length()>=8 && id.length()<=12 ) {
			if(Character.isUpperCase(id.charAt(0))){
				if (id.matches(".*[0-9].*")) {
					System.out.println("로그인이 되었습니다.");
				}
			}
		}if(id.length()<8 || id.length()>12) {
			System.out.println("아이디를 8 ~ 12자 사이로 입력해주세요.");
		}if(Character.isLowerCase(id.charAt(0))) {
			System.out.println("첫자를 대문자로 입력해주세요.");
		}if(!id.matches(".*[0-9].*")) {
			System.out.println("ID중에는 반드시 숫자가 포함되어 있어야 합니다.");
			}
		} catch (Exception e) {
			if(email.isEmpty()) {
				System.out.println("빈 문자열입니다.");
			}else
			System.out.println("@를 입력해주세요");
		}
		
	}

}
