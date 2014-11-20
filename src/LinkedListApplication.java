
public class LinkedListApplication {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Object1");
		ll.add("Object2");
		ll.add("Object3");
		
		System.out.println(ll);
		
	}
	
	public static class LinkedList {
		Node head;
		
		public LinkedList() {
			head = null;
		}
		
		public void add(Object obj) {
			Node tmp;
			tmp = head;
			head = new Node();
			head.setElement(obj);
			head.setNext(tmp);
		}
		
		public void remove(Object obj) {
			
		}

		@Override
		public String toString() {
			return "LinkedList [head=" + head + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + "]";
		}
		
		
	}
	
	public static class Node{
		
		private Object element;
		private Node next;
		
		public Object getElement() {
			return element;
		}
		public void setElement(Object element) {
			this.element = element;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [element=" + element + ", next=" + next + "]";
		}
		
		
	}

}
