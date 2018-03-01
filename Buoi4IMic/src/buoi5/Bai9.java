package buoi5;

import java.util.Scanner;

public class Bai9 {
	static boolean isExit(String yn) {
		return (yn.equals("N")||yn.equals("n"))?false:true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fla=0, sum =0;
		String yn = "";
		while (fla==0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input number of terms : ");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println("The odd numbers are : ");
			for (int i = 1; i <= n; i++) {				
				System.out.print((2*i-1)+" ");
				sum +=2*i-1;				
			}
			System.out.println("");
			System.out.println("The Sum of odd Natural Number upto "+n+ " terms: " +sum);
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
