package com.training.bean;

public class LoginBean {
	private String Member_login;
	private String Subject;
	private String Body;

	public LoginBean() {
	}

	public LoginBean(String Member_login, String Subject, String Body) {
		super();
		this.Member_login = Member_login;
		this.Subject = Subject;
		this.Body = Body;
		
	}

	public String getMember_login() {
		return Member_login;
	}

	public void setMember_login(String Member_login) {
		this.Member_login = Member_login;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}


	public String getBody() {
		return Body;
	}

	public void setBody(String Body) {
		this.Body = Body;
	}
	
	@Override
	public String toString() {
		return "LoginBean [Member_login=" + Member_login + ", Subject=" + Subject + ", Body="+Body+"]";
	}

}
