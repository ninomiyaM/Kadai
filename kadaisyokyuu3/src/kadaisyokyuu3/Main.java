package kadaisyokyuu3;

import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String day =sc.nextLine();
		String[] Array =day.split(" ");
		String M = Array[0]; //休日数
		String N = Array[1]; //旅行日数
		int Nnum = Integer.parseInt(N);
		int Mnum = Integer.parseInt(M);
		int[] total = new int[Nnum];
		int min = 0;
		int[] avg = new int[Nnum];
		for (int i = 1; i <= Mnum; i++ ) {
			String input = sc.nextLine();//不明点
			String[] tmpArray = input.split(" ");//不明点
			int start = Integer.parseInt(tmpArray[0]);
			for(int j = start ; j <= Nnum; j++) {
				
			
				total[i] += Integer.parseInt(tmpArray[1]);//合計値
				 avg[i] = total[i]/Nnum;//平均
			}
			min = avg[i];//最小値仮置き
			int minIndex = i;
			
			for (int t = i + 1; t < Mnum; t++) {//比較
				if (total[t] < min) {
					min =total[t];
					minIndex = t;
				}
			System.out.println(i);//仮出力
			}
			
		}
	}
}
