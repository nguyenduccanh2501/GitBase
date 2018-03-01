package buoi4;

import java.util.Scanner;

public class BaiToanSo3 {
	static boolean KiemTraEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	static boolean KiemTraKieuSo(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$") ;
	}

	static boolean KiemTraPhepToan(byte bValue) {
		return (bValue < 0 || bValue > 2) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào họ và tên: ");
		Scanner sc = new Scanner(System.in);
		String sTemp = sc.nextLine();
		if (!KiemTraEmpty(sTemp)) {
			String sHoVaTen = sTemp;
			System.out.println("Nhập vào tuổi: ");
			sTemp = sc.nextLine();
			if (!KiemTraEmpty(sTemp)) {
				if (KiemTraKieuSo(sTemp)) {
					int iTuoi = Integer.parseInt(sTemp);
					System.out.println("Nhập vào giới tính: ");
					System.out.println("0: Nam, 1: Nữ");
					sTemp = sc.nextLine();

					byte bOpt = Byte.parseByte(sTemp);
					if (KiemTraPhepToan(bOpt)) {
						switch (bOpt) {
						case 0:
							System.out.println("Nam");
							break;
						case 1:
							System.out.println("Nữ");
							break;

						default:
							System.out.println(":v");
							break;
						}
					} else {
						System.out.println("Trong khoảng [0-1]");
					}

					System.out.println("Nhập vào tình trạng hôn nhân: ");
					System.out.println("0: Đã kết hôn, 1: Đã ly hôn, 2: Chưa kết hôn");
					sTemp = sc.nextLine();
					byte bOption = Byte.parseByte(sTemp);
					if (KiemTraPhepToan(bOption)) {
						switch (bOption) {
						case 0:
							System.out.println("Đã kết hôn");
							break;
						case 1:
							System.out.println("Đã ly hôn");
							break;
						case 2:
							System.out.println("Chưa kết hôn");
							break;
						default:
							System.out.println(":v");
							break;
						}
					} else {
						System.out.println("Trong khoảng [0-2]");
					}

					if (iTuoi >= 19) {
						if (bOpt == 1) {
							if (bOption == 0)
								System.out.println("Không được tham gia");
							else
								System.out.println("Được tham gia");
						} else if (bOpt == 0) {
							if (iTuoi >= 22) {
								if (bOption == 0)
									System.out.println("Không được tham gia");
								else
									System.out.println("Được tham gia");
							} else {
								System.out.println("Không được tham gia");
							}
						} else
							System.out.println(":v");
					} else {
						System.out.println("Không được tham gia");
					}

				} else {
					System.out.println("Không phải là số");
				}
			} else {
				System.out.println("Không được để trống");
			}
		} else {
			System.out.println("Không được để trống");
		}
	}

}
