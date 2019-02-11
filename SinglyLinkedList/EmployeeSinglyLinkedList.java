package SinglyLinkedList;

public class EmployeeSinglyLinkedList {
	
	private EmployeeNode head;
	
	public void addFromFront(Emplyee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
	}
	
	public EmployeeNode removeFromFront() {
		EmployeeNode removeNode = head;
		head.getNext();
		removeNode.setNext(null);
		return removeNode;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		if (current != null) {
			System.out.print(current);
			System.out.print("->");
			current = current.getNext();
		}
		System.out.println(" -> null");
	}

}
