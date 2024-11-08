import java.util.Scanner;
public class NilaiSurvey04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];
        double totalKeseluruhan = 0;
        for (int i = 0; i < survey.length; i++) {
            System.out.println("Input Nilai Responden ke-" + (i+1));
            double totalPerResponden = 0;

            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j+1) + ": ");
                survey[i][j] = sc.nextInt();
                totalPerResponden += survey[i][j];
                totalKeseluruhan += survey[i][j];
            }
            System.out.println("Rata-rata Nilai Responden ke-" + (i+1) + ": " + totalPerResponden/6);
        }
        System.out.println("==========================================");
        System.out.println("Rata-rata Nilai setiap Pertanyaan Survey: ");

        for (int j = 0; j < 6; j++) {
            double totalPerPertanyaan = 0;

            for (int i = 0; i < 10; i++) {
                totalPerPertanyaan += survey[i][j];
            }
            System.out.println("Rata-rata Nilai Pertanyaan ke-" + (j+1) + ": " + totalPerPertanyaan/10);
        }
        System.out.println("==========================================");
        System.out.println("Rata-rata keseluruhan nilai: " + totalKeseluruhan/60);

        }
    }