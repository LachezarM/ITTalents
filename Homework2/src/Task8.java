import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете n: ");
		int n=sc.nextInt();
		int helper=n-1;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				
				System.out.print(helper);
			}
			helper+=2;
			System.out.println();
		}
		sc.close();
	}

}
