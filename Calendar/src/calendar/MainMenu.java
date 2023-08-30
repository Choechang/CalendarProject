package calendar;
import java.util.Scanner;

public class MainMenu {
	Scanner sc = new Scanner(System.in);
	JoinController jc = new JoinController();
//	Join[] join = new Join[100];
	
	public MainMenu() {
		while(true) {
			System.out.println("권한을 설정해주세요");
			System.out.println("==================================");
			System.out.println("1. 관리자 계정");
			System.out.println("2. 회원 계정");
			System.out.println("0. 끝내기");
			System.out.println("==================================");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : {
				managerMenu();
			}break;
			case 2 : {
				mebershipMenu();
			}break;
			case 0 : {
				System.out.println("프로그램을 종료하겠습니다.");
				return;
			}
			default :{
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			}
		}
	}
	
	public void managerMenu() {
		System.out.println("안녕하세요! 관리자 계정 비밀번호를 입력해주세요");
		String managerPassword = sc.next();
		
		if("chlckddud".equals(managerPassword)) {
			jc.manager();
		}else {
			System.out.println("<Error> 비밀번호가 틀렸습니다. 처음으로 돌아갑니다.");
			return;
		}
				
	}
	
	public void mebershipMenu() {	
		System.out.println("안녕하세요! 찾아주셔서 감사합니다. 회원이신 경우 로그인을, 아니신 경우 회원가입을 선택해 번호를 입력해 주세요. ");
		
		while(true) {
			System.out.println("");
			System.out.println("==========================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 회원탈퇴");
			System.out.println("0. 뒤로가기");
			System.out.println("==========================");
			System.out.println("원하는 메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
				case 1 : {
					jc.login();
				}break;
				case 2 : {
					jc.clientAdd();
				}break;
				case 3 : {
					jc.delete();
				}break;
				case 0 : {			
					return;
				}
				default :{
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		}
	}

			
		
		
	
	
	
}
