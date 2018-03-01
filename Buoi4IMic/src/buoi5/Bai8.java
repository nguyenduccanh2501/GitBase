package buoi5;

import java.util.Scanner;

public class Bai8 {
	static boolean isExit(String yn) {
		return (yn.equals("N")||yn.equals("n"))?false:true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fla=0;
		String yn = "";
		while (fla==0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input upto the table number starting from 1 : ");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println("Multiplication table from 1 to " +n);
			for (int i = 1; i <= 10; i++) {
				for (int j =1; j<=n;j++) {	
					if (j<=n-1)
					System.out.print(j+"x"+i+"="+i*j+",");
					else System.out.println(j+"x"+i+"="+i*j);
				}
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
