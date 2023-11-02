public class Nasabah {

 private String nama;

 private String alamat;

 private Integer jumlahRekening;

 private Rekening[] rekening;

 public Nasabah(String nama, String alamat) {

 this.nama = nama;

 this.alamat = alamat;

 this.jumlahRekening = 0;

 this.rekening = new Rekening[2];

 }

 public void bukaRekening(String noRekening, double saldoAwal) {

 if (jumlahRekening < rekening.length) {

 rekening[jumlahRekening] = new Rekening(noRekening, 

saldoAwal);

 jumlahRekening++;

 System.out.println("Rekening " + noRekening + " berhasil dibuka.");

 } else {

 System.out.println("Jumlah rekening sudah mencapai batas 

maksimum.");

 }

 }

 public String getNama() {

 return nama;

 }

 public String getAlamat() {

 return alamat;

 }

 public Integer getJumlahRekening() {

 return jumlahRekening;

 }

 public Rekening[] getRekening() {

 return rekening;

 }

}
