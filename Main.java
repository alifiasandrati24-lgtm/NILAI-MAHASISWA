import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Pengolahan Nilai Mahasiswa");
        System.out.println("Nama Pembuat : Alifia Sandra");
        System.out.println("NIM : 20240040169");
        System.out.println("====================================\n");

        Mahasiswa[] mhs = new Mahasiswa[4];

        int totalNilai = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeE = 0;

        for (int i = 0; i < mhs.length; i++) {

            mhs[i] = new Mahasiswa();

            System.out.println("Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            mhs[i].nim = input.nextLine();

            System.out.print("Nama : ");
            mhs[i].nama = input.nextLine();

            System.out.print("Nilai : ");
            mhs[i].nilai = input.nextInt();
            input.nextLine();

            mhs[i].hitungGrade();

            totalNilai += mhs[i].nilai;

            if (mhs[i].isLulus()) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }

            switch (mhs[i].grade) {
                case "A":
                    gradeA++;
                    break;
                case "B":
                    gradeB++;
                    break;
                case "C":
                    gradeC++;
                    break;
                case "D":
                    gradeD++;
                    break;
                case "E":
                    gradeE++;
                    break;
            }

            System.out.println();
        }

        System.out.println("\n===== DATA MAHASISWA =====");

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilData();
        }

        double rata = (double) totalNilai / mhs.length;

        System.out.println("Jumlah Mahasiswa : " + mhs.length);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + jumlahTidakLulus);

        System.out.println("Jumlah Mahasiswa dengan Nilai A : " + gradeA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B : " + gradeB);
        System.out.println("Jumlah Mahasiswa dengan Nilai C : " + gradeC);
        System.out.println("Jumlah Mahasiswa dengan Nilai D : " + gradeD);
        System.out.println("Jumlah Mahasiswa dengan Nilai E : " + gradeE);

        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata);
    }
}