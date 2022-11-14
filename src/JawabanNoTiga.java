import java.util.Scanner;

public class JawabanNoTiga {




        static int jmlTopLevel = 0;
        static int jmlMiddleLevel = 0;
        static int jmlRegStaff = 0;
        static int jmlStaff = 0;

        static boolean success = false;

        static void cekNIKKaryawan(String nik) {
            if (nik.length() <= 10) {

                if (nik.contains("C01")) {
                    success = true;
                    jmlTopLevel++;
                } else if (nik.contains("J02")) {
                    success = true;
                    jmlMiddleLevel++;
                } else if (nik.contains("N03")) {
                    success = true;
                    jmlRegStaff++;
                } else if (nik.contains("P04")) {
                    success = true;
                    jmlStaff++;
                } else {
                    success = false;
                    System.out.println("Gagal, Format registrasi tidak terdaftar dalam list busInfo");
                }
            } else {
                success = false;
                System.out.println("Gagal, Pastikan jumlah NIK tidak lebih dari 10, silahkan isi ulang NIK");

            }

        }

        static void Nik() {

            Scanner inputRegistrasi = new Scanner(System.in);
            System.out.println("Masukkan NIK untuk registrasi");
            String nik = inputRegistrasi.nextLine();
            cekNIKKaryawan(nik);
            if (success) {
                printResult();
            }

        }

        static void printResult() {

            System.out.println("Jumlah peserta di bus 01-TopLevel = " + jmlTopLevel);
            System.out.println("Jumlah peserta di bus 02-MiddleLevel = " + jmlMiddleLevel);
            System.out.println("Jumlah peserta di bus 03-RegulerStaff = " + jmlRegStaff);
            System.out.println("Jumlah peserta di bus 04-Staff = " + jmlStaff);
            System.out.println();
        }


    public static void main(String[] args) {
        while(true){
            JawabanNoTiga.Nik();
        }
    }
}