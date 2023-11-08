package BUild;

public class Height {
 static class Node{
	int data;
	Node1 left;
	Node1 right;
	Node(int  data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
 
 public static int height(Node1 root) {
	 if(root==null) {
		 return 0;
	 }
	 int lh=height(root.left);
	 int rh=height(root.right);
	return Math.max(lh, rh)+1;
	 
 }
 public static int count(Node1 root) {
	 if(root==null) {
		 return 0;
	 }
	 int countleft=count(root.left);
	 int countlright=count(root.right);
	 
	 
	return countleft+countlright+1;
	 
 }
 public static int sum(Node1 root) {
	 if(root==null) {
		 return 0;
	 }
	 int leftsum=sum(root.left);
	 int rightsum=sum(root.right);
	 return leftsum+rightsum+root.data;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Node1 root=new Node1(1);
		root.left=new Node1(2);
		root.left.right=new Node1(4);
		root.left.left=new Node1(3);
		root.right=new Node1(5);
		root.right.left=new Node1(7);
		root.right.right=new Node1(8);
		
		System.out.println(height(root));
		
		System.out.println(count(root));
		System.out.println(sum(root));
	}

}
