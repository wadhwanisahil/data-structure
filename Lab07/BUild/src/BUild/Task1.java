package BUild;

import java.util.*;
class Node1{
	int data;
	Node1 left;
	Node1 right;
	Node1(int  data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class Task1 {
	static int index=-1;
	public Node1 buildtree(int node[]) {
		index++;
		if(node[index]==-1) {
			return null;
		}
		Node1 n = new Node1(node[index]);
		n.left=buildtree(node);
		n.right=buildtree(node);
		return n;
	}
public void preorder(Node1 root) {
	if(root==null) {
		return;
	}
	System.out.println(root.data);
	preorder(root.left);
	preorder(root.right);
}
public void inorder(Node1 root) {
	if(root==null) {
		return;
	}
	//System.out.println(root.data);
	inorder(root.left);
	System.out.println(root.data);
	inorder(root.right);
}
public void postorder(Node1 root) {
	if(root==null) {
		return;
	}
	//.out.println(root.data);
	postorder(root.left);
	postorder(root.right);
	System.out.println(root.data);
}


public void levelOrder(Node1 root) {
    if (root == null)
        return;

    Queue<Node1> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        Node1 current = queue.poll();
        System.out.println(current.data);

        if (current.left != null)
            queue.add(current.left);

        if (current.right != null)
            queue.add(current.right);
    }
}
public static void main(String args[]) {
	int node[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	Task1 t = new Task1();
	Node1 root = t.buildtree(node);
	//t.preorder(root);
	t.levelOrder(root);
}
}