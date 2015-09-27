public class SortingAlgorithms {
	public final int ARRAY_SIZE = 5;
	public final String BUBBLE = "bubble";
	public final String INSERT = "insert";
	public final String SELECT = "select";
	public int[] arrayA = {5, 4, 3, 2, 1}; // descending order
	public int[] arrayB = {6, 10, 7, 9, 8}; // random order
	public int[] arrayC = {11, 12, 13, 14, 15}; // ascending order
	
	public SortingAlgorithms() {
	}
	
	public void sort(String type) {
		switch (type) {
			case BUBBLE: bubbleSort(arrayA); bubbleSort(arrayB); bubbleSort(arrayC); break;
			case INSERT: insertSort(arrayA); insertSort(arrayB); insertSort(arrayC); break;
			case SELECT: selectSort(arrayA); selectSort(arrayB); selectSort(arrayC); break;
			default: break;
		}
	}
	
	public void bubbleSort(int[] inputArray) {
		int temp;
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			for (int j = 0; j < ARRAY_SIZE - i - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
	}
	
	public void insertSort(int[] inputArray) {
		for (int i = 1; i < ARRAY_SIZE; i++) {
			int temp = inputArray[i];
			int j = i;
			
			while (j > 0 && inputArray[j - 1] > temp) {
				inputArray[j] = inputArray[j - 1];
				j--;
			}
			
			inputArray[j] = temp;
		}
	}
	
	public void selectSort(int[] inputArray) {
		for (int i = 0; i < ARRAY_SIZE - 1; i++) {
			int tempIndex = i;
			
			for (int j = i + 1; j < ARRAY_SIZE; j++) {
				if (inputArray[j] < inputArray[tempIndex]) {
					tempIndex = j;
				}
			}
			
			int temp = inputArray[tempIndex];
			inputArray[tempIndex] = inputArray[i];
			inputArray[i] = temp;
		}
	}
	
	public void print() {
		printArray(arrayA);
		printArray(arrayB);
		printArray(arrayC);
		System.out.print("|\n");
	}
	
	public void printArray(int[] inputArray) {
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print("|");
			System.out.print(inputArray[i]);
		}
	}

	public static void main(String[] args){
		SortingAlgorithms bubbleArray = new SortingAlgorithms();
		System.out.print("Bubble\n");
		bubbleArray.print();
		bubbleArray.sort("bubble");
		bubbleArray.print();
		
		SortingAlgorithms insertArray = new SortingAlgorithms();
		System.out.print("Insert\n");
		insertArray.print();
		insertArray.sort("insert");
		insertArray.print();
		
		SortingAlgorithms selectArray = new SortingAlgorithms();
		System.out.print("Select\n");
		selectArray.print();
		selectArray.sort("select");
		selectArray.print();
	}
}