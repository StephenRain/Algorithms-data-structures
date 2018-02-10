package custom.tree;

import java.util.Comparator;

//���������
public class BinaryTree<E> {
	// ���ڵ�
	private TreeNode<E> root;
	// �Ƚ���,�����Ƚϴ�ŵ�����
	private Comparator<? super E> comparator;

	public BinaryTree() {
	}

	// ����Ƚ���
	public BinaryTree(Comparator<? super E> comparator) {
		this.comparator = comparator;
	}

	//��ȡ���ڵ�
	public TreeNode<E> getRoot() {
		return root;
	}
	
	//��ȡ���ұߵĽڵ�  
	public TreeNode<E> getMaxNode(){
		TreeNode<E> p = root;
		if(p.getRight() != null){
			p = p.getRight();
		}
		return p;
	}
	

	/**
	 *  �����ȽϽڵ��е����ݵĴ�С,ģ��TreeMap��Դ��
	 *  ��  e1 > e2 ,��������
	 */
	public int compare(E e1, E e2) {
		return comparator == null ? ((Comparable<? super E>) e1).compareTo((E) e2) : comparator.compare((E) e1, (E) e2);
	}

	/**
	 * �������ͬʱ�������������
	 */
	public void add(E data) {
		TreeNode<E> node = new TreeNode<E>();
		node.setData(data);
		
		if (root == null) {
			root = node;
		} else {
			TreeNode<E> tar = root;
			while (true) {
				int r = compare(data,tar.getData());
				if(r > 0){
					TreeNode<E> right = tar.getRight();
					if(right == null){
						tar.setRight(node);
						break;
					}else{
						tar = right;
					}
				}else if(r < 0){
					TreeNode<E> left = tar.getLeft();
					if(left == null){
						tar.setLeft(node);
						break;
					}else{
						tar = left;
					}
				}else{
					break;
				}
			}
		}

	}
	
	/**
	 * ʹ�õݹ�������ҽڵ�
	 * ����������ڵ��ϵ�����
	 */
	public void foreachNode(TreeNode<E> treeNode){
		
		if(treeNode.getLeft() != null)
			foreachNode(treeNode.getLeft());
		
		System.out.println(treeNode.getData());
		
		if(treeNode.getRight() != null)
			foreachNode(treeNode.getRight());
		
	}

}
