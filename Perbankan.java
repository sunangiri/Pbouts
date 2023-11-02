public class Perbankan {

 public static void main(String[] args) {

 // Membuat objek Nasabah

 Nasabah nasabah = new Nasabah("risqi", "Ngumpak Dalem Bojonegoro");

 

 // Membuka rekening untuk nasabah

 nasabah.bukaRekening("89389239", 1000000.0);

 nasabah.bukaRekening("67890", 200000.0);

 

 // Menampilkan data nasabah

 System.out.println("Nama Nasabah: " + nasabah.getNama());

 System.out.println("Alamat Nasabah: " + nasabah.getAlamat());

 System.out.println("Jumlah Rekening: " + 

nasabah.getJumlahRekening());

 

 // Menampilkan data rekening nasabah

 Rekening[] rekeningNasabah = nasabah.getRekening();

 for (Rekening rekening : rekeningNasabah) {

 if (rekening != null) {

 System.out.println("No Rekening: " + rekening.getNoRekening());

 System.out.println("Saldo Rekening: " + rekening.getSaldo());

 }

 }

 }

}
