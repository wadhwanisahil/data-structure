package Linklist;
class no{
	int data;
	no next;
	no(int data){
		this.data=data;
		this.next= null;
	}
}
public class Task2 {
     no head,tail;
     public void  add(int data) {
    	 no n = new no(data);
    	 if(head==null) {
    		 head=tail=n;
    	 }
    	 else {
    		 n.next=head;
    		 head=n;
    	 }
     }
     public  void rotate(int k) {
    	 no curr=head;
    	 if(head==null) {
    		 return ;
    	 }
    	 int count=1;
    	 while(count<k+1&curr.next!=null) {
    		 curr=curr.next;
    		 count++;
    	 }
    	 while(curr!=null) {
    		 System.out.println(curr.data);
    		 curr=curr.next;
    	 }
    	 
     }
     public void size() {
 		no temp =head;
 	
 		int size=0;
		while(temp!=null) {
 			temp = temp.next;
 			size++;
 		}
 		System.out.println(size);
 	}
     public void insertatend(int data) {
    	 no node = new no(data);
    	 if(head==null) {
    		 head=node;
    		 tail=node;
    	 }
     
     tail.next=node;
     tail=node;
     }  
     public void removeFromBeginning() {
         if (head != null) {
             head = head.next;
             if (head == null) {
                 tail = null;
             }
         }
     }
     public void removeFromEnd() {
         if (head != null) {
             if (head == tail) {
                 head = null;
                 tail = null;
             } else {
                 no current = head;
                 while (current.next != tail) {
                     current = current.next;
                 }
                 current.next = null;
                 tail = current;
             }
         }
     }
         public void printlist() {
     		if(head==null) {
     			System.out.println("list is empty");
     		}
     		no cn = head; 
     		while(cn!=null) {
     			System.out.print(cn.data+" ");
     			cn=cn.next; 
     		}
     		System.out.println();
     	
     }
     public static void main(String args[]) {
    	 Task2 t = new Task2();
    	 t.add(10);
    	 t.add(20);
    	 t.add(30);
    	 t.add(50);
    	 
//    	 t.removeFromBeginning();
//    	 t.removeFromEnd();
    	 t.printlist();
    	 t.rotate(2);
     }
}
