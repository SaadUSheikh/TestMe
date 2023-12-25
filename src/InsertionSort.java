public class InsertionSort {
    public static int insertionSort(int[] arr) {
        int n = arr.length;
        int count=0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            //count++;

            int j = i - 1;
            count++;


            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 &&  key < arr[j] ) {
                arr[j + 1] = arr[j];
                count++;
                j--;
            }
            arr[j + 1] = key;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1,0};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int saad=insertionSort(array);

        System.out.println("\nSorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(saad);
    }
}
