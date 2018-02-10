package custom.tree;

/**
 * ����ʵ�ֶ������ṹ�Ľڵ�
 */
public class TreeNode<E> {
	
	//��Ҷ�ӽڵ�
	private TreeNode<E> left;
	//��Ҷ�ӽڵ�
	private TreeNode<E> right;
	//�ڵ��ϵ�����
	private E data;

	public TreeNode() {
		super();
	}
	
	public TreeNode(TreeNode<E> left, TreeNode<E> right, E data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
}
