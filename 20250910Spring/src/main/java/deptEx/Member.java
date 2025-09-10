package deptEx;

import java.time.LocalDateTime;

public class Member {

	private int deptno;
	private String dname;
	private String loc;
	
	public Member() {}

	public Member(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Member [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	

	

	
//	public void changePassword(String oldPassword, String newPassword) {
//		if (!password.equals(oldPassword))
//			throw new WrongIdPasswordException();
//		this.password = newPassword;
//	}

}
