package buoi6;

public class Customer {
	// instance variable
	private int RollNo;
	private String FullName;
	private String Email;
	private String Mobile;
	private String Address;

	// Constructor - Hàm khởi tạo cho đối tượng khi nó được sinh ra

	/*
	 * Trùng tên với tên lớp đối tượng 
	 * Là phương thức luôn luôn được chạy đầu tiên khi khởi tạo đối tượng 
	 * Ko có kiểu trả về và phạm vi truy cập là public 
	 * Hàm khởi tạo luôn được khởi chạy đầu tiên khi tạo ra đối tượng 
	 * Th không có bất kỳ hàm khởi tạo nào thì khi tạo ra đối tượng nó sẽ tự động 
	 * tạo ra 1 hàm khởi tạo không tham số ngầm định 
	 * Th có định nghĩa hàm khởi tạo -->không thể tự động
	 * tạo ra hàm khởi tạo không tham số được 
	 * Có 02 hàm khởi tạo không tham số truyền vào và có tham số truyền vào
	 **/

	// định nghĩa ra các phương thức getter or setter

	public Customer() {
		RollNo = -1;
		FullName = "Example";
		Email = "Example@gmail.com";
		Mobile = "01645865";
		Address = "Hn";
	}

	public Customer(int rollNo, String fullName, String email, String mobile, String address) {
		super();
		RollNo = rollNo;
		FullName = fullName;
		Email = email;
		Mobile = mobile;
		Address = address;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int RollNo) {
		this.RollNo = RollNo;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		this.FullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		this.Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

}
