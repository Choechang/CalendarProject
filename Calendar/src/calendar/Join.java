package calendar;

public class Join {
	private String myName;
	private String myId;
	private String myPassword;
	
	 

	public Join(String myName, String myId, String myPassword) {
		this.myName = myName;
		this.myId = myId;
		this.myPassword = myPassword;
		
	}
	
	public void setMyId(String myId) {
		this.myId = myId;
	}
	public String getMyId() {
		return myId;
	}
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getMyName() {
		return myName;
	}
	
	public void setmyPassword(String myPassword) {
		this.myPassword = myPassword;
	}
	public String getmyPassword() {
		return myPassword;
	}
	
	public String toString() {
		return "이름 : "+this.myName +"\n" +"아이디 : " + this.myId + "\n"+"비밀번호 : " +this.myPassword;
	}

}


