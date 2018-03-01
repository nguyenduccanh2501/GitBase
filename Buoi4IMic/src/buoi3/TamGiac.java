package buoi3;

import java.util.Scanner;

public class TamGiac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào a: ");
		int a = sc.nextInt();
		if (a == 0)
			System.out.println("Không là pt bậc 2");
		else {
			System.out.println("Nhập vào b: ");
			int b = sc.nextInt();
			System.out.println("Nhập vào c: ");
			int c = sc.nextInt();
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Pt vô nghiệm");
			} else if (delta == 0) {
				float x = -b / (2 * a);
				System.out.println("Pt có nghiệm duy nhất x= " + x);
			} else {
				float x1 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
				float x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				System.out.println("Pt có 2 nghiệm x1= " + x1 + " và x2= " + x2);

			}
		}
	}
}
