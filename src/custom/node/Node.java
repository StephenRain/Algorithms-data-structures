package custom.node;

/**
 * ����ʵ������Ľڵ����
 */
public class Node<E> {
	//�ڵ��е�����
	private E e;
	//ָ�����һ���ڵ�
	private Node<E> next;
	//ָ��ǰһ���Ľڵ�
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
