package practice13.common;
/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */
public class Item {

	private String name;
	//Getter
	public String getName() {
		return name;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}


	private int additionalDamage;
	//Getter
	public int getAdditionalDamage() {
		return additionalDamage;
	}
	//Setter
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}


	public Item(String name,int additionalDamage){
		this.name = name;
		this.additionalDamage = additionalDamage;
	}
}
