package sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int numbers[] = new int[] {5,6,7,1,2,3,4};
		for (int i : numbers) {
			System.out.print(i);
		}
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[i] > numbers[j + 1 ]) {
					int temp = numbers[i];
					numbers[i] =  numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		for (int i : numbers) {
			System.out.print(i);
		}
		
	
	}

}
