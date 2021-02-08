public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = SortedArray.getIntegers(5);

        System.out.println("Displaying unsorted array:");
        SortedArray.printArray(unsortedArray);

        int[] sortedArray = SortedArray.sortIntegers(unsortedArray);
        System.out.println("\nDisplaying sorted array, descending order:");
        SortedArray.printArray(sortedArray);
    }

}