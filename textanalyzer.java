package modul4.latihan;
import java.util.Arrays;
import java.util.Scanner;

public class textanalyzer {
    private String text;

    public textanalyzer(String text) {
        this.text = text;
    }

    public int countCharacters() {
        if (!isEmpty()) {
            return text.length();
        } else {
            return 0;
        }
    }

    public int countWords() {
        if (!isEmpty()) {
            String[] words = text.split("\\s+");
            return words.length;
        } else {
            return 0;
        }
    }

    public boolean searchWord(String word) {
        if (!isEmpty()) {
            String[] words = text.split("\\s+");
            return Arrays.asList(words).contains(word);
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        return text == null || text.trim().isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userText = "";
        int choice;

        do {
            // Memilih operasi
            System.out.println("\nPilih operasi:");
            System.out.println("1. Masukkan teks");
            System.out.println("2. Hitung jumlah karakter");
            System.out.println("3. Hitung jumlah kata");
            System.out.println("4. Cari kata dalam teks");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan (0/1/2/3/4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan teks untuk dianalisis: ");
                    scanner.nextLine();  // Consuming the newline character
                    userText = scanner.nextLine();
                    break;
                case 2:
                    textanalyzer analyzer1 = new textanalyzer(userText);
                    int charCount = analyzer1.countCharacters();
                    System.out.println("Jumlah karakter: " + charCount);
                    break;
                case 3:
                    textanalyzer analyzer2 = new textanalyzer(userText);
                    int wordCount = analyzer2.countWords();
                    System.out.println("Jumlah kata: " + wordCount);
                    break;
                case 4:
                    textanalyzer analyzer3 = new textanalyzer(userText);
                    System.out.print("Masukkan kata yang dicari: ");
                    String searchWord = scanner.next();
                    boolean wordFound = analyzer3.searchWord(searchWord);
                    System.out.println("Kata \"" + searchWord + "\" ditemukan: " + wordFound);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 0);

        // Menutup scanner
        scanner.close();
    }
}