package calendar;

import java.util.Scanner;

public class JoinController {
	Scanner sc = new Scanner(System.in);
	Join[] cj = new Join[30];
	int count = 0;
	Join[] mj = new Join[10];

	public void manager() {
		if(count >= mj.length) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		
		while(true) {
			System.out.println("안녕하세요 관리자님! 관리자 메뉴를 선택해주세요.");
			System.out.println("====================================");
			System.out.println("1. 회원 목록");
			System.out.println("2. 회원 삭제");
			System.out.println("0. 뒤로 가기");
			System.out.println("====================================");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1 :{
					clientManage();
				}break;
				case 2 :{
					clientDelete();
				}break;	
				case 0 :{
					return;
				}
				default :{
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				
			}
		}
	}
		
	public void clientAdd() {
		if(count >= cj.length) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		
		while(true) {
			System.out.println("이름을 입력해주세요 : ");
			String myName = sc.next();
			System.out.println("사용할 아이디를 입력해주세요 : ");
			String myId = sc.next();
			
			boolean isDuplicate = false;
			
			for(int i = 0; i < count; i++) {
				int num = 0;
				if(cj[num] == null) {
					System.out.println("등록된 회원이 없습니다.");
					return;
				}
				if(myId.equals(cj[i].getMyId())) {
					System.out.println("중복되어서 사용할 수 없는 아이디입니다.");
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				System.out.println("사용할 비밀번호를 입력해주세요 : ");
				String myPassword = sc.next();
				
				Join newJoin = new Join(myName, myId, myPassword);
				cj[count++] = newJoin;
				
				System.out.println(myName +"님, 회원가입이 완료되었습니다.");
				
				break;
			}
		}
	}
	
	public Join[] clientDelete() {
		System.out.println("삭제할 회원의 아이디를 입력해주세요.");
		System.out.println("아이디 : ");
		String clientId = sc.next();
		for(int i = 0 ; i < cj.length; i++) {
			if(cj[i].getMyId().equals(clientId) ) {
				cj[i] = null;
				break;
			}
		}	
		for(int i = 0 ; i < cj.length ; i++) {
			if(cj[i] == null && cj[i+1] != null) {
				cj[i] = cj[i+1];
				cj[i+1] = null;

			}else if(cj[i] == null) {
				break;
			}
		}	
		return cj;
	}
		
		
	

	
	public Join[] delete() {
		System.out.println("삭제하실 아이디를 입력해주세요");
		String myId = sc.next();
		System.out.println("삭제하실 비밀번호를 입력해주세요");
		String myPassword = sc.next();
		int num =0;
		for(int i = 0 ; i < cj.length; i++) {
			if(cj[num] == null) {
				System.out.println("삭제할 회원이 없습니다.");
				break;
			}
			if(cj[i].getMyId().equals(myId) && cj[i].getmyPassword().equals(myPassword) ) {
				System.out.println(cj[i].getMyId()+"의 삭제가 완료됐습니다.");
				cj[i] = null;
				break;
			}
		}	
		for(int i = 0 ; i < cj.length ; i++) {
			if(cj[i] == null && cj[i+1] != null) {
				cj[i] = cj[i+1];
				cj[i+1] = null;

			}else if(cj[i] == null) {
				break;
			}
		}
		return cj;
	}
	
	public void login() {
		while(true) {
			System.out.println("회원님 안녕하세요. 아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String clientName = sc.next();
			if("0".equals(clientName)) {
				return;
			}
			System.out.println("비밀번호 : ");
			String clientPassword = sc.next();	
			
			for(int i = 0 ; i < cj.length; i++) {
				if(cj[i].getMyId().equals(clientName) && cj[i].getmyPassword().equals(clientPassword)) {
					System.out.println("로그인 성공!");
					return;
				} else {
					System.out.println("회원정보가 일치하지 않습니다. 다시 입력해주세요. \n<뒤로가기를 원하시는 경우 0번을 입력해주세요.>");
					break;
				}
			}
		}
		
	}
	
	public void clientManage() {
		int num = 0;
		for(int i = 0; i < cj.length; i++) {
			if(cj[num] == null) {
				System.out.println("등록된 회원이 없습니다.");
				return;
			}
			if(cj[i] ==null) {				
				break;
			}
			System.out.println("["+(i+1) +"]" + cj[i].toString()+"\n---------------------");
		}	
	}		
}


