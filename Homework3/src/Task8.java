import java.util.Scanner;

/*+
 * Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
 */
public class Task8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input array length: ");
		int len = sc.nextInt();
		int[] array = new int[len];
		for (int i = 0; i < array.length; i++) {
			System.out.println("input array[" + i + "]: ");
			array[i] = sc.nextInt();
		}
		int maxLength = 1;
		int max = 1;
		int currIndex = 0;
		int maxElementIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i] == array[i-1]){
				currIndex = i-1;
				do{
					if(currIndex != array.length-1){
						currIndex++;
					}
					else{
						break;
					}
					maxLength++;
				}while(array[currIndex] == array[currIndex-1]);
				if(max < maxLength){
					max = maxLength;
					maxElementIndex = currIndex;
				}
				maxLength = 1;
			}
		}
		for (int j = maxElementIndex - max + 1; j < maxElementIndex + 1; j++) {
			System.out.println("array[" + j + "]" + array[j]);
		}
	}

	
}
