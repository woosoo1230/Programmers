package level1.���簢�������;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//b��ŭ �ݺ��ϸ鼭 a��ŭ �����
		for(int i = 0; i<b; i++) {
			for(int j = 0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
