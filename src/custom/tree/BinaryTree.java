package custom.tree;

import java.util.Comparator;

//二叉查找树
public class BinaryTree<E> {
	// 根节点
	private TreeNode<E> root;
	// 比较器,用来比较存放的数据
	private Comparator<? super E> comparator;

	public BinaryTree() {
	}

	// 传入比较器
	public BinaryTree(Comparator<? super E> comparator) {
		this.comparator = comparator;
	}

	//获取根节点
	public TreeNode<E> getRoot() {
		return root;
	}
	
	//获取最右边的节点  
	public TreeNode<E> getMaxNode(){
		TreeNode<E> p = root;
		if(p.getRight() != null){
			p = p.getRight();
		}
		return p;
	}
	

	/**
	 *  用来比较节点中的数据的大小,模仿TreeMap的源码
	 *  若  e1 > e2 ,返回正数
	 */
	public int compare(E e1, E e2) {
		return comparator == null ? ((Comparable<? super E>) e1).compareTo((E) e2) : comparator.compare((E) e1, (E) e2);
	}

	/**
	 * 添加数据同时建立排序二叉树
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
	 * 使用递归遍历查找节点
	 * 从左到右输出节点上的数据
	 */
	public void foreachNode(TreeNode<E> treeNode){
		
		if(treeNode.getLeft() != null)
			foreachNode(treeNode.getLeft());
		
		System.out.println(treeNode.getData());
		
		if(treeNode.getRight() != null)
			foreachNode(treeNode.getRight());
		
	}

}
