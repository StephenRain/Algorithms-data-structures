package custom.list;
import custom.node.Node;

public class LinkedList<E>{

	// ��һ���ڵ�
	private Node<E> first;
	// ���һ���ڵ�
	private Node<E> last;
	// ���ϵĴ�С
	private int size = 0;

	public LinkedList() {
		super();
	}

	/**
	 * ��ȡ���ϵĴ�С
	 */
	public int size() {
		return size;
	}

	/**
	 * �жϴ���������ǲ��Ǽ����е���Ч����
	 */
	private boolean isElementIndex(int index) {
		return index >= 0 && index < size;
	}

	/**
	 * ɾ��ָ����������Ԫ�� ����ɾ����Ԫ��
	 */
	public E remove(int index) {

		if (!isElementIndex(index)) {
			throw new IndexOutOfBoundsException();
		}

		Node<E> indexNode = this.getNode(index);
		E e = indexNode.getE();
		Node<E> prev = indexNode.getPrev();
		Node<E> next = indexNode.getNext();

		if (prev != null) {  
			prev.setNext(next);
		}
		if (next != null) {  
			next.setPrev(prev);
		}
		indexNode = null;
		size--;

		return e;

	}

	/**
	 * ɾ�����һ����������Ԫ�� ���ر�ɾ����Ԫ��
	 */
	private E removeLast() {
		Node<E> prev = last.getPrev(); // ��ȡ�����ڶ����ڵ�
		prev.setNext(null);
		size--;
		return last.getE();
	}

	/**
	 * ɾ����һ��Ԫ��
	 */
	private E removeFirst() {
		Node<E> f = first;
		Node<E> second = f.getNext();
		second.setPrev(null);
		first = second;
		size--;
		return f.getE();
	}

	/**
	 * ��ȡָ����������ֵ(������0��ʼ)
	 */
	public E get(int index) {
		return this.getNode(index).getE();
	}

	/**
	 * ��ȡָ���������Ľڵ�
	 */
	public Node<E> getNode(int index) {

		// У�鴫�������
		if (index >= size || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

		Node<E> target = first;
		for (int i = 0; i < index; i++) {
			target = target.getNext();
		}
		return target;
	}

	/**
	 * �����б���ĳԪ�ص�һ�γ��ֵ�����
	 */
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++) {
			E e = get(i);
			if (o == e) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * �滻ָ����������Ԫ�� ������ǰ�ڸ�λ���ϵ�����
	 */
	public E set(int index, E ele) {
		// �ж������ǲ��ǺϷ�����
		if (isElementIndex(index)) {
			throw new IndexOutOfBoundsException();
		}
		Node<E> node = getNode(index);
		Node<E> prev = node.getPrev();
		Node<E> next = node.getNext();
		if (prev != null) {
			prev.setNext(node);
		}
		if (next != null) {
			next.setPrev(node);
		}
		node.setPrev(prev);
		node.setNext(next);
		return node.getE();
	}

	/**
	 * �Ƴ����������е�Ԫ�أ� ��������ÿһ���ڵ㶼���ÿսڵ�
	 */
	public void clear() {
		// �ӵ�һ���ڵ㿪ʼ����
		for (Node<E> x = first; x != null;) {
			Node<E> next = x.getNext();
			x.setE(null);
			x.setNext(null);
			x.setPrev(null);
			x = next;
		}
		first = last = null;
		size = 0;
	}

	/**
	 * ���Ԫ��
	 */
	public boolean add(E e) {
		// ��Ҫ��ӵ����ݷ��ڽڵ���
		Node<E> node = new Node<>(last, e, null);

		if (first == null) { // ��һ�����
			first = node;
			last = first;
		} else { 			 // �������Ѿ���������
			last.setNext(node);
			last = node;
		}
		size++;
		return true;
	}

	
}
