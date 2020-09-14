/**
 * 
 */
package kadaisyokyuu1;

import java.util.*;

/**
 * @author ninomiya
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();  //社員数
			String str = sc.nextLine(); //社員名
			int M = sc.nextInt(); //購入冊数
			String[] str1 = new String[M]; //購入者と購入金額
			
			String[] name = new String[100];
			name = str.split(" "); //社員名格納
			
			int[] total = new int[N]; //合計購入金額
			
			for (int i = 0; i <= M; i++) {
				String input = sc.nextLine();
				 str1 = input.split(" ");
			}
	}
}
