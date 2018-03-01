package buoi6;

import java.util.Comparator;

class RollNoComperator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if (o1.getRollNo()==o2.getRollNo()) 
			return 0;
		else if (o1.getRollNo()>o2.getRollNo())
			return 1;
		else return -1;
	}
	
}
