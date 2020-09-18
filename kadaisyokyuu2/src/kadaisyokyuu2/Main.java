package kadaisyokyuu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //嫌いな数字
		sc.nextLine();
		String m = sc.nextLine(); //部屋数
		sc.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> s = new ArrayList<Integer>();
		while (sc.hasNext()) {
			list.add(sc.nextInt());
		}
		
		if( m != null) {
			int m1 = Integer.parseInt(m); //部屋数を数値化
			int r = sc.nextInt(); //部屋番号
			
			list.stream()
				.filter(a -> (list).startsWith(n))
				.collect(s.toList);
			
			
			}
			
		}	
			
		
}


