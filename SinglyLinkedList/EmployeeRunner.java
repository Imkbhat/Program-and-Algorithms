package SinglyLinkedList;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Emplyee kiran = new Emplyee("Kiran",100);
		Emplyee pooja = new Emplyee("Pooja",100);
		Emplyee aish = new Emplyee("Aishwarya",100);
		
		EmployeeSinglyLinkedList list = new EmployeeSinglyLinkedList();
		list.addFromFront(kiran);
		list.addFromFront(pooja);
		list.addFromFront(aish);
		
		list.printList();
		
		list.removeFromFront();
		
		list.printList();
	}

}
