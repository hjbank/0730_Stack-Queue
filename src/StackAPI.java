import java.util.Stack;

public class StackAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 저장하는 스택
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.size()+"//"+stack.isEmpty());
		stack.push("이동욱");
		stack.push("이지아");
		stack.push("김태희");
		System.out.println(stack.size()+"//"+stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
