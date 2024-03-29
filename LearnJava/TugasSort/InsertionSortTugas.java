package UAS.TugasSort;

public class InsertionSortTugas {
  public static void main(String[] args) {
    int[] array = {15, 8, 12, 18, 4, 10};

    System.out.println("Array sebelum diurutkan:");
    printArray(array);

    insertionSort(array);

    System.out.println("\nArray setelah diurutkan:");
    printArray(array);
}

  static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j + 1] = key;
    }
  }

  static void printArray(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");

    System.out.println();
  }
}
