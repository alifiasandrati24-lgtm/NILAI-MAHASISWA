public class Mahasiswa {

    String nim;
    String nama;
    int nilai;
    String grade;

    void hitungGrade() {

        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 0) {
            grade = "E";
        } else {
            System.out.println("Input nilai salah!");
        }

    }

    boolean isLulus() {
        return nilai >= 60;
    }

    void tampilData() {

        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("====================================");

    }
}