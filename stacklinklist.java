public class stacklinklist{
	Node head;
	Node tail;
	int size;
	public stacklinklist(){
		head = null;
		tail = null;
		size = 0;
	}
	public void push(int n){
		Node newest = new Node(n,null);
		if(size==0){
			head = newest;
			tail = newest;
		}else{
			tail.setNext(newest);
			tail = newest;
		}
		size++;
	}
	public int pop(){
		int last = tail.getElement();

		size--;
		return last;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		return false;
	}
}

class Node{
	private int element;
	private Node next;
	public Node(int element,Node next){
		this.element = element;
		this.next = next;
	}

	public int getElement(){
		return element;
	}
	public void setElement(int n){
		element = n;
	}
	public Node getnext(){
		return next;
	}
	public void setNext(Node n){
		next = n;
	}
}