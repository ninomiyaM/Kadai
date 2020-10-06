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
		String dateStr[] = new String[Mnum];
		int rainFallPc[] = new int[Mnum];
		int[] total = new int[Onum];
		int min = 0;
		int minIndex = 0;
		int[] avg = new int[Onum];
		
		for(int i = 0; i < Mnum; i++) {
			String input = sc.nextLine();
			String[] tmpArray = input.split(" ");
			dateStr[i] = tmpArray[0];
			rainFallPc[i] = Integer.parseInt(tmpArray[1]);
		}
		
		for (int k = 0; k < Onum; k++ ) {
			for(int j = 0 ; j < Nnum; j++) {
				
				total[k] += rainFallPc[k];//合計値
				avg[k] = total[k]/Nnum;//平均
				min = avg[0];//最小値仮置き				
			}
			
				if(avg[k] < min) {	
				min = avg[k];
				minIndex = k;
			}
			
			
		}	
		String start = dateStr[minIndex]; //最小確率開始日
		String end = dateStr[minIndex + Nnum -1];//最小確率終了日
		String[] startend = new String[2];
		startend[0] = start;
		startend[1] = end;
		for (int o = 0; o < startend.length; o++) {
			System.out.println(startend[o]);//仮出力
		}
	}
}
