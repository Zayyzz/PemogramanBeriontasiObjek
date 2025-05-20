package pertemuan10.tugas;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Pengguna mhs = new Mahasiswa("fauzi");
        Pengguna pustakawan = new Pustakawan("Pak Arif");

        mhs.aktivitasUtama();
        pustakawan.aktivitasUtama();

        PenggunaDigital akun = new PenggunaDigital("Fauzi123");
        akun.login();
        akun.logout();
    }
}
