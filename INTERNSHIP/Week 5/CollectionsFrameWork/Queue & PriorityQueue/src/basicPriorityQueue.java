import java.util.*; 

public class basicPriorityQueue {

	public static void main(String args[]){  
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Sandeep");  
		queue.add("Vijay");  
		queue.add("JaiShankar");  
		queue.add("Raj");  

		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  

		System.out.println("\nIterating the queue elements:");  

		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		queue.remove();  
		queue.poll();  
		
		System.out.println("\nAfter removing two elements:");  
		
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
} 