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
		String m = sc.nextLine(); //部屋数
		List<String> list = new ArrayList<String>();
		//List<String> s = new ArrayList<String>();
		int m1 = Integer.parseInt(m); //部屋数を数値化
		//String r = sc.nextLine(); //部屋番号
		for (int i = 0; i <= m1; i++) {
			list.add(sc.nextLine());
		}
		sc.close();
			
			//String r = sc.nextLine(); //部屋番号
				
			List<String> o =	
				list.stream()
					.filter( a  ->! a.contains(n))
					.collect(Collectors.toList());
				
				if(o.size() == 0) {
					System.out.println("none");
				} else{
				for(String k : o) {
					System.out.println(k);
				}
			}
	}
}
