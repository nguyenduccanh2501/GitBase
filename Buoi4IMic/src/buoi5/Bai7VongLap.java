package buoi5;

import java.util.Scanner;

public class Bai7VongLap {
	static boolean KiemTraEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	static boolean KiemTraKieuSo(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào n: ");
		Scanner sc = new Scanner(System.in);
		String sTemp = sc.nextLine();
		if (!KiemTraEmpty(sTemp)) {
			if (KiemTraKieuSo(sTemp)) {
				int n = Integer.parseInt(sTemp);
				for (int i = 1; i <= 10; i++) {
					System.out.println(n+"x"+i+"="+n*i);
				}
			} else {System.out.println("Không phải là số");}
		} else {System.out.println("Không được để trống");}
	}

}
