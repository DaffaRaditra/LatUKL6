import java.util.Scanner;

public class LatUKL6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Penjumlahan Matriks");

        System.out.print("Masukkan jumlah baris (m): ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int kolom = scanner.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] matriksHasil = new int[baris][kolom];

        System.out.println("\nInput Matriks A");
        isiMatriks(scanner, matriksA, baris, kolom);

        System.out.println("\nInput Matriks B");
        isiMatriks(scanner, matriksB, baris, kolom);

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        System.out.println("\nHasil Penjumlahan Matriks A + B");
        cetakMatriks(matriksHasil, baris, kolom);

        scanner.close();
    }

    
    public static void isiMatriks(Scanner scanner, int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = scanner.nextInt();
            }
        }
    }

    public static void cetakMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            System.out.print("|");
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%4d", matriks[i][j]); 
            }
            System.out.println(" |");
        }
    }
}