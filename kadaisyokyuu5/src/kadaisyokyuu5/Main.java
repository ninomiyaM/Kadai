package kadaisyokyuu5;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();//レシート数
		int Nnum = Integer.parseInt(N);
		double pt = 0;//仮置きポイント
		int point = 0; //型変換後ポイント
		int totalPoint = 0;//合計ポイント
		int totalMoney = 0;//合計金額

		
		for(int i = 0; i < Nnum; i++) {
			
			String money = sc.nextLine();
			String[] Array = money.split(" ");
			String date = Array[0];
			String pay = Array[1];
			double payN = Integer.parseInt(pay);
			
			if (date.contains("3")) {
				pt = payN * 0.03;
				point = (int)(Math.floor(pt));
			}else if(date.contains("5")){
				pt = payN * 0.05;
				point = (int)(Math.floor(pt));
			}else {
				pt = payN * 0.01;
				point = (int)(Math.floor(pt));
			}
			
			totalPoint += point;
			totalMoney += payN;
			
		}
		
		System.out.println(totalMoney + "回");
		System.out.println(totalPoint + "ポイント");
			
	}
}
