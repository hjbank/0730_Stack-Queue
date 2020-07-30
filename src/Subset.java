import java.util.Scanner;

public class Subset {

	static int N, totalCnt;
	static int [] input ;
	static boolean []  isSelected ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		N = sc.nextInt();
		input = new int[N];
		isSelected = new boolean[N];
		
		for ( int i=0; i< N; i++) {
			input[i] = sc.nextInt();
			
		}
		
		generateSubset(0);
		System.out.println("총 부분집합의 갯수 : " + totalCnt);
	}
	
	private static void generateSubset(int cnt) {
		if ( cnt == N) {
			++totalCnt;
			for ( int i=0; i< N; i++) {
				System.out.print( isSelected[i]? input[i] : "X");
				System.out.print("\t");
			}
			
			System.out.println();
			return;
		}
		
		// 부분집합 구성에 포함
		
		isSelected[cnt]= true;
		generateSubset(cnt + 1); // 다음원소로 넘어감
		
		// 부분집합 구성에 비포함 
		isSelected[cnt]= false;
		generateSubset(cnt + 1); // 다음원소로 넘어감 
	}

}
