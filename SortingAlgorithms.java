public class SortingAlgorithms {
	public final int ARRAY_SIZE = 5;
	public final String BUBBLE = "bubble";
	public final String INSERT = "insert";
	public final String SELECT = "select";
	public int[] arrayA = {5, 4, 3, 2, 1};
	public int[] arrayB = {6, 10, 7, 9, 8};
	public int[] arrayC = {11, 12, 13, 14, 15};
	
	public SortingAlgorithms() {
	}
	
	public void sort(String type) {
		switch (type) {
			case BUBBLE: bubbleSort(arrayA); bubbleSort(arrayB); bubbleSort(arrayC); break;
			default: break;
		}
	}
	
	public void bubbleSort(int[] inputArray) {
		
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
		
		bubbleArray.print();
	}
}