import java.util.ArrayList;
import java.util.Calendar;


public class UasAlgoritma {
    public static void main(String[] args) {
        ArrayList<String> namaPasien = new ArrayList<>();
        ArrayList<Integer> umurPasien = new ArrayList<>();
        ArrayList<Boolean> statusVaksin = new ArrayList<>();


        for (int i = 0; i < 105; i++) {
            namaPasien.add("Pasien " + (i + 1));
            umurPasien.add((int) (Math.random() * 60) + 20);
            statusVaksin.add(false);
        }


        System.out.println("Data Pasien COVID-19:");
        for (int i = 0; i < 105; i++) {
            System.out.println("Nama: " + namaPasien.get(i) +
                    ", Umur: " + umurPasien.get(i) +
                    ", Status Vaksin: " + (statusVaksin.get(i) ? "Sudah" : "Belum"));
        }


        System.out.println("\nPerkiraan Tahun Lahir Pasien:");
        ArrayList<Integer> tahunLahir = new ArrayList<>();
        int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = 0; i < 105; i++) {
            tahunLahir.add(tahunSekarang - umurPasien.get(i));
            System.out.println("Pasien " + (i + 1) + ": " + tahunLahir.get(i));
        }
    }
}
