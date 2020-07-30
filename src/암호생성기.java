import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 암호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> code = new LinkedList<>();
		int cnt =0;
		boolean find = false;
		
		for ( int tc = 1; tc <=10 ; tc++) {
			sc.nextInt(); // case number
			find = false;
			// 저장			
			for ( int i=0; i< 8; i++) {
				code.offer(sc.nextInt());
			}
			
			//System.out.println(code.toString());
			//System.out.println(code.poll());
			while ( true) {
				// 1cycle : 5개 만큼 뒤로 보내기
				
				cnt =1;
				while ( cnt != 6) {
					int first = code.poll(); // 앞에있는거 꺼내서
					first -= cnt ; // cnt 감소 후
					
					if ( first <= 0 ) 	{
						first =0;
						code.offer(first);
						//System.out.println(code.toString());
						find = true;
						break;
					}
					else code.offer(first); // 다시 뒤에다가 넣기
					
					
					cnt ++;
				}
				if ( find) break;
			}
			System.out.print("#" +tc+" ");
			for( int i=0; i<8; i++) {
				System.out.print(code.poll()+" ");
			}
			System.out.println();
			code.clear();
		}
		
	}

}
