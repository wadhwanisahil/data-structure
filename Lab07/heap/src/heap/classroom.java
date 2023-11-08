package heap;
import java.util.Comparator;
import java.util.PriorityQueue;
public class classroom {
	static class student implements Comparable<Student>{

	String name;
	int rank;
	public student(String name,int rank) {
		this.name=name;
		this.rank=rank;
	}
	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return this.rank-s1.rank;
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); 
		pq.add(1);
		pq.add(7);
		pq.add(2);
		pq.add(4);
		pq.add(3);
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
		
	}

}
