package Sort;

import java.util.PriorityQueue;

public class Heap {
	public static void main(String[] args) {
    
		int[] arr = {20,50,10,30,40};
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// 배열을 힙으로 만든다.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 뽑는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
}