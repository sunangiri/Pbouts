package risqi.mkhoirulrisqiuts;
public class Rekening {
 private String noRekening;
 private double saldo;
 public Rekening(String noRekening, double saldoAwal) {
 this.noRekening = noRekening;
 this.saldo = saldoAwal;
 }
 public void simpanUang(double jumlah) {
 saldo += jumlah;
     System.out.println("Berhasil Simpan Uang:" +jumlah);
 }
 public void ambilUang(double jumlah) {
 if (saldo >= jumlah) {
 saldo -= jumlah;
     System.out.println("Berhasil nambah uang: "+jumlah);
 } else {
 System.out.println("Saldo tidak mencukupi untuk penarikan.");
 }
 }
 public String getNoRekening() {
 return noRekening;
 }
 public double getSaldo() {
 return saldo;
 }
}
