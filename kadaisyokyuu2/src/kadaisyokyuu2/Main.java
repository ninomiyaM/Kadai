package kadaisyokyuu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine(); //嫌いな数字
		sc.nextLine();
		String m = sc.nextLine(); //部屋数
		sc.nextLine();
		List<String> list = new ArrayList<String>();
		List<String> s = new ArrayList<String>();
		while (sc.hasNext()) {
			list.add(sc.nextLine());
		}
		
			int m1 = Integer.parseInt(m); //部屋数を数値化
			String r = sc.nextLine(); //部屋番号
			
			for (int i = 0; i <= m1; i++) {
				
				
				list.stream()
					.filter(( a -> list.contains(n)))
					.collect(Collectors.toList());
			
					
			
			}
			
		}	
			
		
}


