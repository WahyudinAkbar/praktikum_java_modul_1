import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes {
  public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    String namaDepan = "M";
    String namaTengah = "Wahyudin";
    String namaBelakang = "Akbar";
    int usia = 20;
    int targetTahunKuliah = 4;
    double ipk = 3.777;
    char nilaiAbjad = 'A';
    boolean tampan = true;

    System.out.print("Input Nama Depan : ");
    namaDepan = scanner.nextLine();
    System.out.print("Input Usia : ");
    usia = scanner.nextInt();
    System.out.print("Input IPK : ");
    ipk = scanner.nextDouble();
    System.out.print("");
    System.out.print("Input Nilai Abjad : ");
    nilaiAbjad = scanner.next().charAt(0);
    System.out.print("Input Tampan? : ");
    tampan = scanner.nextBoolean();

    namaBelakang = JOptionPane.showInputDialog("Nama Belakang : ");

    System.out.println("============ Output ============");
    System.out.println("Nama Depan : " + namaDepan);
    System.out.println("Nama Tengah : " + namaTengah);
    System.out.println("Nama Belakang : " + namaBelakang);
    System.out.println("Usia : " + usia);
    System.out.println("Target Kuliah : " + targetTahunKuliah + " Tahun");
    System.out.println("IPK : " + ipk);
    System.out.println("Nilai PBO : " + nilaiAbjad);
    System.out.println("Tampan : " + tampan);

    JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + " " + namaTengah + " " + namaBelakang);
  }
}
