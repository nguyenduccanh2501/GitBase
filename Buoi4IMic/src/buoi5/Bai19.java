package buoi5;

import java.util.Scanner;

public class Bai19 {
	static boolean isExit(String yn) {
		return (yn.equals("N") || yn.equals("n")) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fla = 0, sum = 0;
		String yn = "";
		while (fla == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input the number: ");
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println("The positive divisor: ");
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sum = sum + i;
					System.out.print(i + " ");
				}
			}
			System.out.println("");
			System.out.println("The Sum of the divisor is " + sum);
			if (sum == n)
				System.out.println("The number is perfect");
			else
				System.out.println("The number is not perfect");

			System.out.println("\n");
			System.out.println("Bạn có muốn tiếp tục hay không?");
			yn = sc.nextLine();
			if (!isExit(yn)) {
				fla++;
				break;
			}
		}
		System.out.println("Bạn đã thoát chương trình");
	}

}
