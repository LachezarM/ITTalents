import java.util.Scanner;

/*
 * ������ 14:
�� �� ������� �����, ����� ������ �� �������� ����� N � �����
���������� �� N! (N ���������).

 */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int n = sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}
	static int fact(int n){
		if(n == 0){
			return 1;
		}
		return n * fact(n-1);
		
	}

}
