package buoi5;

import java.util.Scanner;

public class Bai7 {
	static boolean isExit(String yn) {
		return (yn.equals("N")||yn.equals("n"))?false:true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fla=0, n=0;
		String yn = "";
		while (fla==0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập cột cửu chương: ");
			n=sc.nextInt();
			sc.nextLine();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n+"x"+i+"="+n*i);
			}
			System.out.println("\n");
			System.out.println("Bạn có muốn tiếp tục hay không?");
			yn=sc.nextLine();
			if (!isExit(yn)) {
				fla++;
				break;
			}
		}
		System.out.println("Bạn đã thoát chương trình");
	}

}
