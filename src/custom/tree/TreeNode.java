package custom.tree;

/**
 * 用于实现二叉树结构的节点
 */
public class TreeNode<E> {
	
	//左叶子节点
	private TreeNode<E> left;
	//右叶子节点
	private TreeNode<E> right;
	//节点上的数据
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
