package test1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(s, " !,?._'@");
		while(stn.hasMoreTokens()) {
			
			System.out.println(stn.nextToken());
		}
		
		
	}
}
