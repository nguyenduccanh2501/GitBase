package buoi4;

import java.util.Scanner;

public class BaiToanSo1 {

	static boolean KiemTraEmpty(String sValue) {		
		return sValue.isEmpty() ? true : false;
	}

	static boolean XacThucThongTin(String sUser, String sPass) {
		// cách 1
		return (sUser.equals("abc") && sPass.equals("nothing")) ? true : false;

		// cách 2
		// if (sUser.equals("abc") && sPass.equals("nothing"))
		// return true;
		// return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào Username: ");
		Scanner sc = new Scanner(System.in);
		String sUsername = sc.nextLine();
		if (KiemTraEmpty(sUsername)) {
			System.out.println("Không được để trống");
		} else {
			System.out.println("Mời nhập password: ");
			String sPassword = sc.nextLine();
			if (KiemTraEmpty(sPassword)) {
				System.out.println("Không được để trống");
			} else {
				if (XacThucThongTin(sUsername, sPassword))
					System.out.println("Đăng nhập thành công");
				else
					System.out.println("Đăng nhập thất bại");
			}
		}
	}

}
