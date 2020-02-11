package tugas1;

import java.util.Scanner;

public class Mahasiswa {

    private static int[] nilai = new int[20];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama  Lengkap                     = ");
        String name = scanner.nextLine();

        System.out.print("Berapa nilai yang akan diinputkan = ");

        int batas = scanner.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.print("Nilai ke \t" + i + "\t\t\t\t\t  = ");
            nilai[i] = scanner.nextInt();
            if (nilai[i] > 100 || nilai[i] < 0){
                System.out.println("Nilai yang Anda input salah!!! ");
                i = i-1;
            }
        }
        System.out.println("============================================");
        System.out.println("Nama              = " + name);
        System.out.println("Nilai Rata - Rata = " + rata2(batas));
        System.out.println("Nilai Terendah    = " + min(batas));
        System.out.println("Nilai Tertinggi   = " + max(batas));
        System.out.println("=============================================");
    }

    private static float rata2(int batas) {
        float rata = 0;
        for (int i = 1; i <= batas; i++) {
            rata += nilai[i];
        }
        return rata / batas;
    }

    private static float max(int batas) {
        float max = 0;
        for (int i = 1; i <= batas; i++) {
            if (max < nilai[i]) {
                max = nilai[i];
            }
        }
        return max;
    }

    private static float min(int batas) {
        float min = 110;
        for (int i = 1; i <= batas; i++) {
            if (min > nilai[i]) {
                min = nilai[i];
            }
        }
        return min;
    }
}
