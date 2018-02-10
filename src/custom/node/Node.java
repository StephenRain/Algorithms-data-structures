package custom.node;

/**
 * 用于实现链表的节点对象
 */
public class Node<E> {
	//节点中的数据
	private E e;
	//指向的下一个节点
	private Node<E> next;
	//指向前一个的节点
	private Node<E> prev;
	
	public Node() {
		super();
	}

	public Node(Node<E> prev,E e,Node<E> next) {
		super();
		this.e = e;
		this.next = next;
		this.prev = prev;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
}
