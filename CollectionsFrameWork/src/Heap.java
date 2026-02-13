import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Heap {
    
    public static void main(String[] args) {
	
    	     ArrayList<Integer> al= new ArrayList(); 
    	     al.add(10);
    	     al.add(100);
    	     al.add(50);
    	     al.add(70);
    	     al.add(60);
    	     al.add(90);
    	     al.add(20);
    	     
    	     
    	     PriorityQueue<Integer> minHeap= new PriorityQueue();
    	     minHeap.add(100);
    	     minHeap.add(50);
    	     minHeap.add(150);
    	     minHeap.add(25);
    	     minHeap.add(75);
    	     minHeap.add(125);
    	     minHeap.add(175);
    	     
    	     System.out.println(minHeap);
    	     PriorityQueue<Integer> pq= new PriorityQueue();
    	     pq.addAll(al);
    	     System.out.println(pq);
    	     
    	     pq.clear();
    	     pq.comparator();
    	     System.out.println(pq);
    	     
    	     HashSet<Integer> hs= new HashSet<Integer>();
    	     hs.contains(10);
    	     
    	     HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
    	     hm.put(10,20);
    	     hm.
    	     
    	     
    	     
    }

}
