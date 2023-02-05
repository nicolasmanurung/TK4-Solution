import java.util.ArrayList;
import java.util.stream.Collectors;

public class SelectionSort {
    public void selectionSortAscending(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("Pass %d%n", i + 1);
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
                if (arr.get(j) < arr.get(min_idx)){
                    min_idx = j;
                }
            }
            Integer temp = arr.get(min_idx);
            arr.set(min_idx, arr.get(i));
            arr.set(min_idx, arr.get(i));
            arr.set(i,temp);

            System.out.printf("Result of Pass %d%n", i + 1);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
        }
    }

    public void selectionSortDescending(ArrayList<Integer> arr){
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(j) > arr.get(min)) {
                    min = j;
                }
            }
            int temp = arr.get(min);
            arr.set(min, arr.get(i));
            arr.set(i, temp);

            System.out.printf("Result of Pass %d%n", i + 1);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining("   ")));
        }
    }
}