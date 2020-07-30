import java.util.Scanner;
import java.util.Stack;

public class Brower_Stack_Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<String> backward = new Stack<>();
		Stack<String> forward = new Stack<>();
		String current = "http://ssafy.com";
		
		out:while(true)	{
			String input = sc.next();
			
			switch (input) { 
			case "Q":
				break out;
			case "V":
				// 어딘가를 방문하면 forward는 모두 폐기됨
				forward.clear();
				// 현재 페이지는 backward에 들어가게 됨
				backward.push(current);
				current = sc.next();
				System.out.println(current);
				
				break;
			case "F":
				// 포워드가 비어있으면 처리불
				if ( forward.isEmpty()) {
					System.out.println("처리 불가");
				}
				else {
					// 현재 페이지를 백워드 큐에 저장 
					backward.add(current);
					// 포워드로부터 하나 pop 해서 현재페이지로 만듦
					current = forward.pop();
					System.out.println(current);
				}
				break;
			case "B":
				// 백워드가 비어있으면 처리불가
				if ( backward.isEmpty()) {
					System.out.println("처리불가");
				}
				else {
					// 현제 페이지를 포워드에 push 하고
					// 백워드로부터 하나 pop 현재 페이지로 만듦
					current = backward.pop();
					forward.add(current);
					System.out.println(current);
					
				}
				
				break;

			default:
				break;
			}
		}
	}
}
