package kadaisyokyuu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String kirai = sc.nextLine(); //嫌いな数字
		String room = sc.nextLine(); //部屋数
		List<String> list = new ArrayList<String>();

		int roomnum = Integer.parseInt(room); //部屋数を数値化
		//String r = sc.nextLine(); //部屋番号
		for (int i = 0; i < roomnum; i++) {
			list.add(sc.nextLine());
		}
		sc.close();
				
			List<String> kibou =	//希望する部屋
				list.stream()
					.filter( a  -> !a.contains(kirai))
					.collect(Collectors.toList());
				
				if(kibou.isEmpty()) {
					System.out.println("none");
				} else{
				for(String k : kibou) {
					System.out.println(k);
				}
			}
	}
}
