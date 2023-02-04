import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int isUserWantToRetry = -1;
        ArrayList<Integer> listRandomData = new ArrayList<>();
        while (isUserWantToRetry != 6) {
            System.out.println("Selamat Datang di Program Simulasi");
            System.out.println("Menu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");

            Scanner userMenuInput = new Scanner(System.in);
            isUserWantToRetry = userMenuInput.nextInt();

            if (isUserWantToRetry == 1) {
                listRandomData = setRandomData();
                System.out.println(listRandomData);
            } else if (isUserWantToRetry == 2) {

            } else if (isUserWantToRetry == 3) {

            } else if (isUserWantToRetry == 4) {

            } else if (isUserWantToRetry == 5) {

            }
        }
    }

    private static ArrayList<Integer> setRandomData() {
        Scanner userMenuInput = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int batasBawah = userMenuInput.nextInt();
        System.out.print("Batas Atas : ");
        int batasAtas = userMenuInput.nextInt();
        ArrayList<Integer> listRandomData = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listRandomData.add(new Random().nextInt(batasAtas) + batasBawah);
        }
        return listRandomData;
    }
}