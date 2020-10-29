package kadaisyokyuu6;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int Nnum = N.length();
		String[] Nafter = new String[Nnum];
		
		for (int i  = 0; i < N.length(); i++ ) {
			char leet = N.charAt(i);
			
			switch(leet) {
				case 'A':
					Nafter[i] = "4";
					break;
				case 'E':
					Nafter[i] = "3";
					break;
				case 'G':
					Nafter[i] = "6";
					break;
				case 'I':
					Nafter[i] = "1";
					break;
				case 'O':
					Nafter[i] = "0";
					break;
				case 'S':
					Nafter[i] = "5";
					break;
				case 'Z':
					Nafter[i] = "2";
					break;
				default:
					Nafter[i] = String.valueOf(leet);
			
			}
		}
		for (int j = 0; j < Nafter.length; j++) {
		System.out.print(Nafter[j]);
		}	
	}
}
