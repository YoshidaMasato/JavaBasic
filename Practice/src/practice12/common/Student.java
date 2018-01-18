/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;
		//Getter
		public int getStudentId() {
			return this.studentId;
		}
		//Setter
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

	/** 受講生氏名 */
	private String studentName;
		//Getter
		public String getStudentName() {
			return this.studentName;
		}
		//Setter
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

	/** 会社名 */
	private String companyName;
		//Getter
		public String getCompanyName() {
			return this.companyName;
		}
		//Setter
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

	/** 教室名 */
	private String className;
		//Getter
		public String getClassName() {
			return this.className;
		}
		//Setter
		public void setClassName(String className) {
			this.className = className;
		}

	/** メールアドレス */
	private String mail;
		//Getter
		public String getMail() {
			return this.mail;
		}
		//Setter
		public void setMail(String mail) {
			this.mail = mail;
		}

	/** パスワード */
	private String password;
		//Getter
		public String getPassword() {
			return this.password;
		}
		//Setter
		public void setPassword(String password) {
			this.password = password;
		}
}
