import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_API {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.size()+ "//" + queue.isEmpty());
		queue.offer("이동욱");
		queue.offer("이지아");
		queue.offer("김태희");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.size() + "//" + queue.isEmpty());
	}
	
}
