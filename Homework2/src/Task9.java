import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А: ");
		int A = sc.nextInt();
		System.out.println("Въведете B:");
		int B = sc.nextInt();
		int sum = 0;
		if (B > A) {
			int tmp = A;
			A = B;
			B = tmp;
		}
		for (int i = B; i <= A; i++) {
			
			
			if ((i * i) % 3 == 0) {
				
				if(i==B){
				
					System.out.print("skip 3");
			
				}
				else{
					System.out.print(", skip 3");
				}
				continue;
			}
			else{
			
				if(i==B){
				
					System.out.print(i * i);
				}
				else {
					
					System.out.print(", " + i * i);
				}
				sum += i * i;
			}
			if (sum > 200) {
				break;
			}
		}
		sc.close();

	}

}
