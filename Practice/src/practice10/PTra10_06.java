package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline = 40;

		Car car3 = new Car();
		car3.color = "Black";
		car3.gasoline = 30;

		final int distance = 300;

		int total1 = 0;
		int count1;
		for(count1 = 0; distance > total1; count1++) {
			int move = car1.run();
			total1 += move;

			if(move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		if(car1.gasoline != -1) {
			System.out.println("目的地まで"+ count1 +"時間かかりました。残りのガソリンは、"+ car1.gasoline +"リットルです");
		}

		int total2 = 0;
		int count2;
		for(count2 = 0; distance > total2; count2++) {
			int move = car2.run();
			total2 += move;

			if(move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		if(car2.gasoline != -1) {
			System.out.println("目的地まで"+ count2 +"時間かかりました。残りのガソリンは、"+ car2.gasoline +"リットルです");
		}

		int total3 = 0;
		int count3;
		for(count3 = 0; distance > total3; count3++) {
			int move = car3.run();
			total3 += move;

			if(move == -1) {
				System.out.println("目的地に到達できませんでした");
				break;
			}
		}
		if(car3.gasoline != -1) {
			System.out.println("目的地まで"+ count3 +"時間かかりました。残りのガソリンは、"+ car3.gasoline +"リットルです");
		}
	}
}
