/*
Mempraktekan Konsep Class dan Objek
Pak Kumis adalah pedagang Sate, tiap Hari dia menjual dan menerima 
Pesanan dari beberapa Pembeli. Harga Sate yang dijual oleh Pak kumis adalah 
Rp 950 per tusuk. Suatu hari, Ada seorang pembeli memesan Sate 115 Tusuk.
Jadi, Berapa harga Sate 115 tusuk yang harus dibayar oleh Pembeli?. Nah, 
Berikut adalah program Java Sederhana berbasis Teks/Console untuk 
menampilkan rincian pembelian Sate.
Catatan: simpan file yang berisi program java diatas dengan 
nama Penjualan.java. jika nama file berbeda, Anda perlu mencocokkan nama file 
dengan nama Class dan ditulis sama agar program dapat dijalankan. Berikut 
output dari program java tersebut.
*/

public class Penjualan {
    public Penjualan (String barang, int pesanan) {
        System.out.println("Nama barang: " + barang);
        System.out.println("Harga barang: " + 950);
        System.out.println("Jumlah yg dibeli: " + pesanan);
        System.out.println("-------------------------------------");
        System.out.println("Total Harga: " + (pesanan * 950));
    }

    public static void main(String[] args) {
        Penjualan pembeli = new Penjualan("Roti Kumis", 115);
    }
}
