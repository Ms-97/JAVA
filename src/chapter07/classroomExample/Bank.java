package chapter07.classroomExample;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		this.customers = new Customer[10];
	}
	
	public void addCustomer(Customer customer) {
		//배열에 할당하는 방법 기억하기
		this.customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}

