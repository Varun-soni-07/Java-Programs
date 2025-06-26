public class CustomLinkedList {
    
public class ManualLinkedList {
	static Node head;
	static Node tail;
	static int size;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}}
        static class Liked{
        	static Node get(int index) {
        		if (index < 0 || index >= size) {
        			System.out.println("Give valid index");
        			return null; // Return null to avoid exception
        		}
        		Node temp = head;
        		for (int i = 0; i < index; i++) {
        			temp = temp.next;
        		}
        		return temp;
        	}

        	static Node lastremove() {
        		if (size == 0) {
        			System.out.println("List is already empty.");
        			return null;
        		}
        		if (size == 1) {
        			Node temp = head;
        			head = null;
        			tail = null;
        			size = 0;
        			return temp;
        		}

        		Node secondLast = get(size - 2); // get the second last node
        		Node removed = secondLast.next; // node to be removed (last node)
        		secondLast.next = null;         // unlink it
        		tail = secondLast;
        		size--;
        		return removed; // return the removed node (optional)
        	}
         	static Node remove(int index) {
        		if (size == 0) {
        			System.out.println("List is already empty.");
        			return null;
        		}
        		if (size == 1) {
        			Node temp = head;
        			head = null;
        			tail = null;
        			size = 0;
        			return temp;
        		}

        		Node secondLast = get(index-1); // get the second last node
        		Node removed = secondLast.next; // node to be removed (last node)
        		secondLast.next = null;         // unlink it
        		tail = secondLast;
        		size--;
        		return removed; // return the removed node (optional)
        	}

        	static void add(Node a,int index) {
        	
        		if(head==null || tail==null ||index==0) {head=a=tail;size++;return;}
        		else{Node t=get(index-1);
        	    a.next=t.next;
        	    t.next=a;
        		size++;}
        	}
		static void firstinsertion(Node a) {
			if (head == null) {
				head = a;
				tail = head;
				size++;
				return;
			} else {
				a.next = head;
				head = a;
			}
			size++;
		}

		static void lastinsertion(Node a) {
			if (tail == null) {
				tail = a;
				head = tail;
				size++;
				return;
			} else {
				tail.next = a;
				tail = a;
			}
			size++;
		}
		static Node firstremove() {
			if(size==0) {return null;}
			head=head.next;
			size--;
			return head;
		}
	
		public static void main(String[] args) {
			Node a = new Node(1);
			Node b = new Node(2);
			Node c = new Node(3);
			firstinsertion(a);
			firstinsertion(b);
			firstinsertion(c);
			lastinsertion(new Node(4));
			add(new Node(6),2);
			firstremove();
			show();
			lastremove();
			show();
			remove(2) ;
			show();
		}

		static void show() {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println("this is the size of linkedlist " + size);

		}

	}
}

}
