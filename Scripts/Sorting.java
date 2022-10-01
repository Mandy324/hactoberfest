package concepts;

public class Sorting {
	public static void main(String[] args) {
		//In bubble sort swapping two adjacent elements
		int[] arr = {1,4,2,8,4};
		
		/*
		//Bubble Sort
		for(int i=0; i<arr.length;i++) {//this for loop for all the elements
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		}
		*/
		
		//Selection sort = Searching + Bubble sort
		for(int i=0; i<4; i++) {
			int index = i;
			for(int j= i+1; j<5; j++) {
				if(arr[index] > arr[j]) {
					index = j;
				}
			}
			int smallest = arr[index];
			arr[index] = arr[i];
			arr[i] = smallest;
			
		}
		
		
//		for(int i=0; i<arr.length; i++) {
//			for (int j = i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				} 
//			}
//		}
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	
		
	}//main method end
}//main class end
