package buoi4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mời nhập mã sinh viên: ");
		Scanner sc = new Scanner(System.in);
		int maSinhVien = sc.nextInt();
		System.out.println("Mời nhập họ và tên của bạn: ");
		sc.nextLine();
		String hoVaTen = sc.nextLine();

		System.out.println("Mời nhập vào điểm của bạn: ");
		float diem = sc.nextFloat();

		System.out.println("Họ và tên: " + hoVaTen + "\nMã sinh viên: " + maSinhVien + "\nĐiểm số: " + diem);

		String a = "23";
		String b = "23";

		int kq = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(kq);
		int c = 2;
		String KQ = "" + c; // chuyển đổi số thành chuỗi (an toàn nhất)
		System.out.println(KQ);

		// Math.Round(...) làm tròn
		// chia lấy dư
		// i%2 == 0: chia k còn dư
		// i%2 != 0: chia không còn dư

		// khi thực hiện so sánh giá trị kiểu chuỗi hoặc thông tin đối tượng thì
		// sử dụng hàm equals để so sánh

		String userName = "abc";
		String passWord = "nothing";
		if (userName.equals("abc") && passWord.equals("nothing"))
			System.out.println(":D");
		
		
		System.out.println("Nhập vào bValue: ");
		byte bValue =sc.nextByte();
		
		switch (bValue) {
		case 0:
			System.out.println("Giá trị bằng 0");
			break;
		case 1:
			System.out.println("Giá trị bằng 1");
			break;
		case 2:
			System.out.println("Giá trị bằng 2");
			break;
		case 3:
			System.out.println("Giá trị bằng 3");
			break;
		default:
			System.out.println("Không xác định");
			break;
		}
	}

}
