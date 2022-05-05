package Sort;

import java.util.PriorityQueue;

public class Heap {
	public static void main(String[] args) {
    
		int[] arr = {20,50,10,30,40};
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		// �迭�� ������ �����.
		for(int i = 0; i < arr.length; i++) {
			heap.add(arr[i]);
		}
		
		// ������ �켱������ ���� ���� ����(root���)�� �ϳ��� �̴´�.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.poll();
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}
}