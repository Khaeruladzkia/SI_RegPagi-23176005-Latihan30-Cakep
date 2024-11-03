/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 30 - Cakep
 * Deskripsi Program    : Pengguna diminta menjawab pertanyaan apakah mereka menyelesaikan latihan,
                          dan berdasarkan jawaban yang diberikan, program mencetak respons dengan warna tertentu.
 * @author
 **/
package pertemuan.pkg6;
import java.util.Scanner;
public class Latihan30 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String colorText(String text, String colorCode) {
        return colorCode + text + ANSI_RESET;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(colorText("Kamu ", ANSI_RED)
                + colorText("ngerjain sendiri ", ANSI_GREEN)
                + colorText("latihan 17. sampe ", ANSI_YELLOW)
                + colorText("latihan 30 ini ? jawab ", ANSI_BLUE)
                + colorText("(Yoi/Enggak): ", ANSI_RED));
        
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("Yoi")) {
            System.out.println("\n" + colorText("Cakep Bener. Good Job", ANSI_PURPLE));

        } else if (jawaban.equalsIgnoreCase("Enggak")) {

            System.out.println("\n" + colorText("Tetep cakep sih.", ANSI_RED));
            System.out.println(colorText("Sing penting paham konsep nya yee.", ANSI_CYAN));
            System.out.println(colorText("Keep the code works dude", ANSI_RED));

        } else {
            System.out.println("Input tidak valid. Silahkan jawab dengan 'Yoi' atau 'Enggak'.");
        }

        scanner.close();
    }
}
