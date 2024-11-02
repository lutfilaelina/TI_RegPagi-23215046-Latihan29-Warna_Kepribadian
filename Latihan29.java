/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika 
 * NIM      : 23215046
 * Deskripsi Program : Warna Kepriibadian
 */

package Pertemuan6;
import java.util.Scanner;

public class Latihan29 {
    
    public static final String RESET = "\033[0m"; 
    public static final String WHITE_TEXT = "\033[37m";
    public static final String RED_TEXT = "\033[31m";  
    public static final String GREEN_TEXT = "\033[32m";
    public static final String YELLOW_TEXT = "\033[33m";
    public static final String BLUE_TEXT = "\033[34m";    
    public static final String PURPLE_TEXT = "\033[35m";
    public static final String CYAN_TEXT = "\033[36m";  
    
    public static final String RED_BG = "\033[41m";
    public static final String GREEN_BG = "\033[42m";
    public static final String YELLOW_BG = "\033[43m";  
    public static final String BLUE_BG = "\033[44m";
    public static final String PURPLE_BG = "\033[45m"; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println(RED_TEXT + "YUK " + GREEN_TEXT + "CEK " + YELLOW_TEXT + "KEPRIBADIANMU " + CYAN_TEXT + "DARI " +
                           PURPLE_TEXT + "WARNA " + BLUE_TEXT + "FAVORITMU" + RESET);
        
        System.out.println(WHITE_TEXT + RED_BG + "       MERAH       " + RESET);
        System.out.println(WHITE_TEXT + GREEN_BG + "       HIJAU       " + RESET);
        System.out.println(WHITE_TEXT + YELLOW_BG + "       KUNING      " + RESET);
        System.out.println(WHITE_TEXT + BLUE_BG + "       BIRU        " + RESET);
        System.out.println(WHITE_TEXT + PURPLE_BG + "       UNGU        " + RESET);
        
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warnaFavorit = scanner.nextLine().toUpperCase();

        System.out.print("NAMA KAMU : ");
        String nama = scanner.nextLine();
        
        System.out.println("\n===HASIL TEST KEPRIBADIAN " + nama.toUpperCase() + "===");
        System.out.print("Warna Favoritmu adalah ");
        
        switch (warnaFavorit) {
            case "MERAH":
                System.out.println(RED_TEXT + "MERAH" + RESET); 
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
                break;
            case "HIJAU":
                System.out.println(GREEN_TEXT  + "HIJAU" + RESET);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri,");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
            case "KUNING":
                System.out.println(YELLOW_TEXT  + "KUNING" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, sering kali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
                break;
            case "BIRU":
                System.out.println(BLUE_TEXT + "BIRU" + RESET);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
                break;
            case "UNGU":
                System.out.println(PURPLE_TEXT  + "UNGU" + RESET);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
            default:
                System.out.println("Tidak terdeteksi");
                System.out.println("Mohon maaf warna yang anda pilih tidak ada dalam daftar warna.");
                break;
        }

        scanner.close(); 
    }
}

