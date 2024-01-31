package UAS.TugasSort;

public class BubbleSortTugas {
  public static void main(String[] args) {
    String[] data = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};

    bubbleSortDescending(data);

    System.out.println("Data setelah diurutkan secara descending:");
    displayData(data);
}

  public static void bubbleSortDescending(String[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j].compareTo(array[j + 1]) < 0) {
                array[j] = array[j] + array[j + 1];
                array[j + 1] = array[j].substring(0, array[j].length() - array[j + 1].length());
                array[j] = array[j].substring(array[j + 1].length());
            }
        }
    }
  }

  public static void displayData(String[] array) {
    for (String city : array) {
        System.out.print(city + " ");
    }
  }
}
