package SinglyLinkedList;

public class EmployeeNode {
	
	private Emplyee employee;
	private EmployeeNode next;
	
	public EmployeeNode() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeNode(Emplyee employee) {
		this.employee = employee;
	}

	public Emplyee getEmployee() {
		return employee;
	}

	public void setEmployee(Emplyee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + ", next=" + next + "]";
	}
}
