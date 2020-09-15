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
			sc.nextLine();
			String str = sc.nextLine(); //社員名
			int M = sc.nextInt(); //購入冊数
			sc.nextLine();
			String[] name = new String[N];
			int[] amount = new int[N];
			
			name = str.split(" "); //社員名格納
			int[] total = new int[N]; //合計購入金額
			
			String[] name1 = new String[N];
			
			for (int i = 0; i <= M; i++) {
				String input = sc.nextLine();
				String[] tmpArray = input.split(" "); //入力値用一時
				
				for (int s = 0; s < name.length; s++) {
					if( tmpArray[0].equals(name[s])) { //比較
						amount[s] += Integer.parseInt(tmpArray[1]); //合計金額に加算
					}
				}
				
			for ( int j = 0; j < N; j++) {
				int max = total[j]; //最大値仮置き
				int maxIndex = j;
				String maxname = name[j];
				
				for ( int t = j + 1; t < N; t++) {
					if ( total[t] > max) { //最大値と比較
						max = total[t];
						maxIndex = t;
						maxname = name[t];
					}
				}
				total[maxIndex] = total[j]; //値入れ替え
				total[j] = max; 
				name[maxIndex] = name[j];
				name[j] = maxname;
				}
			}
			System.out.println(Arrays.toString(name));
	}
}
