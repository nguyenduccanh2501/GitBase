package buoi5;

import java.util.Scanner;

public class Bai28 {
	static boolean isExit(String yn) {
		return (yn.equals("N") || yn.equals("n")) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fla = 0, sum = 0;
		String yn = "";
		while (fla == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Numbers between 100 and 200, divisible by 9 : ");		

			for (int i = 101; i <= 200; i++) {
				if (i % 9 == 0) {
					System.out.print(i+" ");
					sum = sum + i;
				}
			}
			System.out.println("");
			System.out.println("The Sum: " + sum);
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
