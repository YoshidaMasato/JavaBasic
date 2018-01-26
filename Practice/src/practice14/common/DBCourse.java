package practice14.common;

/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */
public class DBCourse implements Course{

	@Override
	public String getCourseName() {
		return PREFIX + "DB基礎";
	}

	@Override
	public String[] getCourseUnit() {
		return new String[] {
				"DB基礎"
				,"SQL基礎"
				,"正規化"
				,"SQL応用"};
	}

}
