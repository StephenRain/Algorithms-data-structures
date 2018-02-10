package tree;
//自定义二叉树
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	//内部节点类
	private static class BinaryNode<AnyType> {
		
		AnyType element;
		BinaryNode<AnyType> left;
		BinaryNode<AnyType> right;
		
		BinaryNode(AnyType theElement){
			
		}
		
		BinaryNode(AnyType theElement,BinaryNode<AnyType> lt,BinaryNode<AnyType> rt){
			
		}

	}

}
