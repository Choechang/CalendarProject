package calendar;

public class Join {
	private String myName;
	private String myPassword;
	
	 

	public Join(String myName, String myPassword) {
		this.myName = myName;
		this.myPassword = myPassword;
		
	}
	
	public void setmyName(String myName) {
		this.myName = myName;
	}
	public String getmyName() {
		return myName;
	}
	
	public void setmyPassword(String myPassword) {
		this.myPassword = myPassword;
	}
	public String getmyPassword() {
		return myPassword;
	}
	
	public String toString() {
		return "아이디 : " + this.myName + "\n"+"비밀번호 : " +this.myPassword;
	}

}


