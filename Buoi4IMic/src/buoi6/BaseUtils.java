package buoi6;

public class BaseUtils {
	static boolean IsEmpty(String sValue) {
		return sValue.isEmpty() ? true : false;
	}

	static boolean IsNumeric(String sValue) {
		return sValue.matches("^[-+]?\\d+(\\.\\d+)?$");
	}

	static boolean IsSatisfy(byte bValue) {
		return (bValue < 1 || bValue > 6) ? false : true;
	}
}
