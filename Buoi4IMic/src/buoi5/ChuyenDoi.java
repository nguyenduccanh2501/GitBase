package buoi5;

import java.util.Scanner;

public class ChuyenDoi {
	static boolean isExit(String yn) {
		return (yn.equals("N") || yn.equals("n")) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần chuyển đổi: ");
		n=sc.nextInt();
		System.out.println(n+" = ");
		while (n>0) {			
			System.out.println(n % 2);
			
			n/=2;
		}
	}

}
