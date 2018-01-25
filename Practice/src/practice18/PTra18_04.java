/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list = new ArrayList<Player>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                Player player = new Player(line);
                list.add(player);
            }
        } catch (FileNotFoundException e) {
        	System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(list);

		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).getPosition().equals("GK")){
				System.out.println(list.get(i).toString());
				break;
			}
		}

		int countDF = 0;
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).getPosition().equals("DF")){
				System.out.println(list.get(i).toString());
				countDF++;
				if(countDF == 4) {
					break;
				}
			}
		}

		int countMF = 0;
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).getPosition().equals("MF")){
				System.out.println(list.get(i).toString());
				countMF++;
				if(countMF == 4) {
					break;
				}
			}
		}

		int countFW = 0;
		for(int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i).getPosition().equals("FW")){
				System.out.println(list.get(i).toString());
				countFW++;
				if(countFW == 2) {
					break;
				}
			}
		}

	}
}
