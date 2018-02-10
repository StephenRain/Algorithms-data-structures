package custom.list;
import custom.node.Node;

public class LinkedList<E>{

	// 第一个节点
	private Node<E> first;
	// 最后一个节点
	private Node<E> last;
	// 集合的大小
	private int size = 0;

	public LinkedList() {
		super();
	}

	/**
	 * 获取集合的大小
	 */
	public int size() {
		return size;
	}

	/**
	 * 判断传入的索引是不是集合中的有效索引
	 */
	private boolean isElementIndex(int index) {
		return index >= 0 && index < size;
	}

	/**
	 * 删除指定索引处的元素 返回删除的元素
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
	 * 删除最后一个索引处的元素 返回被删除的元素
	 */
	private E removeLast() {
		Node<E> prev = last.getPrev(); // 获取倒数第二个节点
		prev.setNext(null);
		size--;
		return last.getE();
	}

	/**
	 * 删除第一个元素
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
	 * 获取指定索引处的值(索引从0开始)
	 */
	public E get(int index) {
		return this.getNode(index).getE();
	}

	/**
	 * 获取指定索引处的节点
	 */
	public Node<E> getNode(int index) {

		// 校验传入的数据
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
	 * 返回列表中某元素第一次出现的索引
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
	 * 替换指定索引处的元素 返回以前在该位置上的索引
	 */
	public E set(int index, E ele) {
		// 判断索引是不是合法索引
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
	 * 移除集合中所有的元素， 将集合中每一个节点都设置空节点
	 */
	public void clear() {
		// 从第一个节点开始遍历
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
	 * 添加元素
	 */
	public boolean add(E e) {
		// 将要添加的数据放在节点中
		Node<E> node = new Node<>(last, e, null);

		if (first == null) { // 第一次添加
			first = node;
			last = first;
		} else { 			 // 集合中已经有数据了
			last.setNext(node);
			last = node;
		}
		size++;
		return true;
	}

	
}
