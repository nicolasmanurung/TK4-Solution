import java.util.ArrayList;
import java.util.stream.Collectors;

public class BubbleSort {
    public void bubbleSortAscending(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("Pass %d%n", i + 1);
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
                if (arr.get(j) > arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    Integer temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
            System.out.printf("Result of Pass %d%n", i + 1);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
        }
    }

    public void bubbleSortDescending(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("Pass %d%n", i + 1);
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
                if (arr.get(j) < arr.get(j + 1)) {
                    // swap arr[j+1] and arr[j]
                    Integer temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
            System.out.printf("Result of Pass %d%n", i + 1);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
        }
    }
}
