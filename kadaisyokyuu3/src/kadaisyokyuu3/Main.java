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
		int  Onum = Mnum - ( Nnum -1);
		int[] total = new int[Onum];
		int min = 0;
		int minIndex = 0;
		int[] avg = new int[Onum];
		for (int i = 0; i < Onum; i++ ) {
			for(int j = 0 ; j < Nnum; j++) {
				
				String input = sc.nextLine();
				String[] tmpArray = input.split(" ");
				total[i] += Integer.parseInt(tmpArray[1]);//合計値
				avg[i] = total[i]/Nnum;//平均
				min = avg[0];//最小値仮置き				
			}

			if(avg[i] < min) {	
				min = avg[i];
				minIndex = i;
			}
			System.out.println(minIndex);//仮出力
		}	
	}
}
