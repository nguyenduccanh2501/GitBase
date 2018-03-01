package buoi4;

import java.util.Scanner;

public class Bai5 {
	
	static boolean KiemTraEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	static boolean KiemTraKieuSo(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$");
	}
	static boolean KiemTraPhepToan(byte bValue) {
		return (bValue < 0 || bValue > 1) ? false : true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhập vào giá trị dãy số: ");
		Scanner sc = new Scanner(System.in);
		String sTemp = sc.nextLine();
		if (!KiemTraEmpty(sTemp)) {
			if (KiemTraKieuSo(sTemp)) {
				int sDaySo = Integer.parseInt(sTemp);
				int i =0;
				System.out.println("Chọn kiểu giá trị: ");
				System.out.println("0: chẵn, 1: lẻ");
				sTemp = sc.nextLine();
				
				if (!KiemTraEmpty(sTemp)) {
					if (KiemTraKieuSo(sTemp)) {
						byte bChoose = Byte.parseByte(sTemp);
						if (KiemTraPhepToan(bChoose)) {
							switch (bChoose) {
							case 0:
								System.out.println("Kết quả: ");
								do  {
									if (i%2==0) {System.out.print(i+" ");}
									i++;
								} while(i<=sDaySo);
								System.out.println("");
								System.out.println("Số lần thực hiện: "+ (sDaySo+1));
								
								break;
							case 1:
								System.out.println("Kết quả: ");
								do  {
									if (i%2!=0) {System.out.print(i+" ");}
									i++;
								} while(i<=sDaySo);
								System.out.println("");
								System.out.println("Số lần thực hiện: "+ (sDaySo+1));
								break;
							default:
								System.out.println(":D");
								break;
							}
						} else {System.out.println("Trong khoảng [0-1]");}
					}else {System.out.println("Không phải là số");}
				} else {System.out.println("Không được để trống");}
				
			} else {System.out.println("Không phải là số");}
		} else {System.out.println("Không được để trống");}
	}

}
