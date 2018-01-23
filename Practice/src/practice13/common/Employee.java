package practice13.common;
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */
public class Employee extends Person{
	private String departmentNm;
		//Setter
		public void setDepartmentNm(String departmentNm) {
			this.departmentNm = departmentNm;
		}
		//Getter
		public String getDepartmentNm() {
			return departmentNm;
		}

	private int departmentCnt;
		//Setter
		public void setDepartmentCnt(int departmentCnt) {
			this.departmentCnt = departmentCnt;
		}
		//Getter
		public int getDepartmentCnt() {
			return departmentCnt;
		}
}
