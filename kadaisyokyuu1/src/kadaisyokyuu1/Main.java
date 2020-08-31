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
			String str1 = "2";
			String str2 = "ando,noda";
			String str3 = "2";
			String str4 = "ando 1000";
			String str5 = "noda 500";
			String[] str = {str4,str5};
			int A = 0;
			int B = 0;
			int N = Integer.parseInt(str1);
			int M = Integer.parseInt(str3);
			
			Scanner sc = new Scanner (System.in);
			//int N = sc.nextInt();
			for (int i = 0; i < M; i++) {
				String s = sc.next();
				String[] array = s.split(",");
				
				for (int a = 4; a <= 5; a++) {
					switch (str[a]) {
					case("ando"): //andoの時
						
						break;
					case("noda"): //nodaの時
						
						break;
					}
				if (A > B) {
					System.out.println(str[a]);
					
				}
				}
			}
			
	}
}
