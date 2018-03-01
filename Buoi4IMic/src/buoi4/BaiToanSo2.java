package buoi4;

import java.util.Scanner;

public class BaiToanSo2 {
	static boolean KiemTraEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	static boolean KiemTraKieuSo(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$") ? true : false;
	}

	static boolean KiemTraPhepToan(byte bValue) {
		return (bValue < 0 || bValue > 3) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào số a: ");
		Scanner sc = new Scanner(System.in);
		String sTemp = sc.nextLine();

		if (!KiemTraEmpty(sTemp)) {
			if (KiemTraKieuSo(sTemp)) {
				double dA = Double.parseDouble(sTemp);
				System.out.println("Nhập vào số b: ");
				sTemp = sc.nextLine();
				if (!KiemTraEmpty(sTemp)) {
					if (KiemTraKieuSo(sTemp)) {
						double dB = Double.parseDouble(sTemp);
						System.out.println("Chọn phép toán: ");
						System.out.println("0: Cộng; 1: Trừ; 2: Nhân; 3: Chia");
						sTemp = sc.nextLine();
						if (!KiemTraEmpty(sTemp)) {
							if (KiemTraKieuSo(sTemp)) {
								byte bOption = Byte.parseByte(sTemp);
								if (KiemTraPhepToan(bOption)) {
									switch (bOption) {
									case 0:
										System.out.printf("Kết quả: %s", (dA + dB));
										break;
									case 1:
										System.out.printf("Kết quả: %s", (dA - dB));
										break;
									case 2:
										System.out.printf("Kết quả: %s", (dA * dB));
										break;
									case 3: {
										if (dA == 0 && dB == 0)
											System.out.println("Result is undefined");
										else if (dA != 0 && dB == 0)
											System.out.println("Cannot divide by zero");
										else
											System.out.printf("Kết quả: %s", (dA / dB));
									}
										break;
									default:
										System.out.println("Bạn đã chọn sai");
										break;
									}
								} else {
									System.out.println("Phép toán trong khoảng [0-3]");
								}
							} else {
								System.out.println("Phép toán là số [0-9]");
							}
						} else {
							System.out.println("Bạn cần chọn phép toán");
						}
					} else {
						System.out.println("Không phải là số [0-9]");
					}
				} else {
					System.out.println("Số b không được để trống");
				}
			} else {
				System.out.println("Không phải là số [0-9]");
			}
		} else {
			System.out.println("Số a không được để trống");
		}
	}

}
