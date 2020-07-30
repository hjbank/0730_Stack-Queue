import java.util.Scanner;
import java.util.Stack;



public class Browser_Stack {
	public static void main(String[] args) {
		// 사용자의 입력 예
		// V http://blabla // 해당 url 방문
		// F 포워드
		// B 백워드
		// ~ 13:05
		
		Scanner sc = new Scanner(System.in);
		
		Stack<String> Back_Q = new Stack<String>();
		Stack<String> Forw_Q = new Stack<String>();
		String [] Url = new String[2]; 
		String pre_Url;
		int idx =0;
		boolean exist_URL = false;
		
		while(true) {
			System.out.println("1. 방문할 URL 주소 ex> 1 URl");
			System.out.println("2. 뒤로가기");
			System.out.println("3. 앞으로 가기 ");
			System.out.println("4. Quit");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1: // 방문할 URl 주소
				Url[idx++] = sc.next();
				System.out.println("V : " + Url);
				
				if ( !exist_URL	) { // URL 처음이라면
					exist_URL = true;
					pre_Url = Url[0];
				}
				else { // URL 이미 1개 이상이라면 
					Back_Q.add(Url[0]); // 백 큐에 저장
					idx =0;
				}
				
		
				break;
				
			case 2: // 뒤로가기
				if( Back_Q.size() == 0) {
					System.out.println("뒤로가기 불가");
					continue;
				}
				Forw_Q.add(Back_Q.peek());
				System.out.println("B: " + Back_Q.pop());
				
				break;
				
			case 3: // 앞으로가기
				if( Forw_Q.size() == 0) {
					System.out.println("앞으로가기 불가");
					continue;
				}
				Back_Q.add(Forw_Q.peek());
				System.out.println("F: " + Forw_Q.pop());
				break;
				
			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
