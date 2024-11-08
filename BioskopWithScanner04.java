import java.util.Scanner;
public class BioskopWithScanner04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, pilihan;
        String nama, next;

        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Baris atau kolom tidak valid. Silakan masukkan ulang.");
                        continue;
                    }
                    if (penonton[baris-1][kolom-1] != null) {
                        System.out.println("Kursi ini sudah terisi! Silakan pilih kursi lain.");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        break;
                    }
                }
                break;

            case 2:
                System.out.println("Susunan Tempat Duduk:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.print(penonton[i][j] + "\t");
                        } else {
                            System.out.print("***\t");
                        }
                    }
                    System.out.println();
                }
                break;

            case 3: 
                System.out.println("Terima kasih! Program selesai.");
                sc.close();
                return;
            default:
                System.out.println("Pilihan tidak valid! Silakan pilih menu yang benar.");
        }
    }
}
}