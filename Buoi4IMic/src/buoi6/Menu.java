package buoi6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		String sValue;
		boolean isValid = false;
		// Khai báo 1 biến mảng động kiểu dữ liệu Khách hàng
		List<Customer> lisCust = new ArrayList<Customer>();

		Scanner sc = new Scanner(System.in);
		do {
			TableOfContent();
			sValue = sc.nextLine();
			byte bResult = CheckInfo(sValue);

			switch (bResult) {
			case 0: {
				byte bOption = Byte.parseByte(sValue);
				switch (bOption) {
				case 1: {
					Input(lisCust);
					isValid = true;
				}
					break;
				case 2: {
					Output(lisCust);
					isValid = true;
				}
					break;
				case 3: {
					System.out.println("Nhập vào mã khách hàng cần sửa");
					int id =sc.nextInt();	
					Update(lisCust, id);
					System.out.println("Danh sách khách hàng: ");
					Output(lisCust);
					isValid = true;
				}
					break;
				case 4: {
					System.out.println("Nhập vào mã khách hàng cần xóa");
					int id =sc.nextInt();					
					Delete(lisCust, id);
					System.out.println("Danh sách khách hàng: ");
					Output(lisCust);
					isValid = true;
				}
					break;
				case 5: {
					System.out.println("Sắp xếp theo mã khách hàng: ");
					Sort(lisCust);
					Output(lisCust);
					isValid = true;
				}
					break;
				case 6:
					isValid = false;
					break;
				}
			}
				break;
			case 1:
				System.out.println("- Bạn cần phải nhập vào giá trị.");
				break;
			case 2:
				System.out.println("- Giá trị bạn nhập không phải là kiểu số [0-9].");
				break;
			case 3:
				System.out.println("- Giá trị cần nằm trong khoảng [1-3].");
				break;
			}
			if (bResult > 0)
				isValid = true;
		} while (isValid);
		System.out.println("Cảm ơn bạn đã sử dụng phần mềm của chúng tôi!!!");
	}

	static void Input(List<Customer> lisCust) {
		// 1. Yêu cầu cung cấp thông tin về số kh
		System.out.println("- Mời nhập số khách hàng?");
		Scanner sc = new Scanner(System.in);
		byte bNumber = sc.nextByte();

		for (int i = 0; i < bNumber; i++) {
			// 2. Khai báo danh sách đối tượng
			Customer oCustomer = new Customer();
			Customer oCus02 = new Customer(132, "Nguyễn Văn A", "13@gmail.com", "046416348", "Hà Nội");
			// 3. Sử dụng kiến thức về Scanner để yêu cầu người dùng cung cấp thông tin
			// đầy đủ cho chúng ta.
			System.out.println("- Nhập thông tin cho KH thứ: " + (i + 1));
			System.out.println("- Mời nhập mã khách hàng?");
			oCustomer.setRollNo(sc.nextInt());
			sc.nextLine();
			System.out.println("- Mời nhập họ và tên của bạn?");
			oCustomer.setFullName(sc.nextLine());
			System.out.println("- Mời nhập thư điện tử?");
			oCustomer.setEmail(sc.nextLine());
			System.out.println("- Mời nhập điện thoại?");
			oCustomer.setMobile(sc.nextLine());
			System.out.println("- Địa chỉ của khách hàng?");
			oCustomer.setAddress(sc.nextLine());

			// 4. Đưa đối tượng khách hàng vào mảng đối tượng khách hàng
			lisCust.add(oCustomer);
		}
		System.out.println("Toàn bộ khách hàng đã được lưu trên hệ thống!!!");
	}

	static void Output(List<Customer> lisCust) {
		if (lisCust.size() > 0) {
			for (Customer oCust : lisCust) {
				// Hiển thị thông tin của khách hàng ra ngoài
				System.out.println("- Mã khách hàng: " + oCust.getRollNo());
				System.out.println("- Tên khách hàng: " + oCust.getFullName());
				System.out.println("- Thư điện tử của khách hàng: " + oCust.getEmail());
				System.out.println("- Điện thoại của khách hàng: " + oCust.getMobile());
				System.out.println("- Địa chỉ của khách hàng: " + oCust.getAddress());
			}
		}
	}

	static void Update(List<Customer> lisCust, int id) {		
		for (int i = 0; i < lisCust.size(); i++) {			
			Scanner sc = new Scanner(System.in);
			 if(lisCust.get(i).getRollNo()==id) {
				 	System.out.println("Chỉnh sửa thông tin: ");
				 	System.out.println("- Mời nhập mã khách hàng?");
				 	lisCust.get(i).setRollNo(sc.nextInt());
					sc.nextLine();
					System.out.println("- Mời nhập họ và tên của bạn?");
					lisCust.get(i).setFullName(sc.nextLine());
					System.out.println("- Mời nhập thư điện tử?");
					lisCust.get(i).setEmail(sc.nextLine());
					System.out.println("- Mời nhập điện thoại?");
					lisCust.get(i).setMobile(sc.nextLine());
					System.out.println("- Địa chỉ của khách hàng?");
					lisCust.get(i).setAddress(sc.nextLine());
				   } else {System.out.println(":D");}
			 
		}
	}

	static void Delete(List<Customer> lisCust, int id) {
		Customer oCust = new Customer();		
		for (int i = 0; i < lisCust.size(); i++) {
			 if(lisCust.get(i).getRollNo()==id) {
				 	oCust=lisCust.get(i);
				    lisCust.remove(oCust);				   
				   } else {System.out.println(":D");}
		}
	}

	static void Sort(List<Customer> lisCust) {		
		Collections.sort(lisCust, new RollNoComperator());
	}

	static void TableOfContent() {
		System.out.println("--- Table of Content ---");
		System.out.println("1. Nhập thông tin khách hàng?");
		System.out.println("2. Hiển thị danh sách khách hàng?");
		System.out.println("3. Cập nhật thông tin khách hàng?");
		System.out.println("4. Xóa thông tin khách hàng?");
		System.out.println("5. Sắp xếp thông tin khách hàng?"); // buddy sort, insertion sort, selection sort
		System.out.println("6. Thoát chương trình?");
		System.out.println("==> Input?");
	}

	/*
	 * 0 - Thỏa mãn các điều kiện. 1 - Báo lỗi do không nhập giá trị. 2 - Báo lỗi do
	 * sai kiểu dữ liệu [0-9]. 3 - Báo lỗi do sai khoảng giá trị cho phép [1-3].
	 */
	static byte CheckInfo(String sValue) {
		if (!BaseUtils.IsEmpty(sValue))
			if (BaseUtils.IsNumeric(sValue)) {
				byte bValue = Byte.parseByte(sValue);
				if (BaseUtils.IsSatisfy(bValue))
					return 0;
				else
					return 3;
			} else
				return 2;
		else
			return 1;
	}
}
