import java.util.Scanner;
  
class Main {
  public static void main(String[] args) {
   
    int matematik, fizik, kimya, turkce, tarih, muzik;

    Scanner giris = new Scanner(System.in);

    System.out.print("Matematik Notunuzu Giriniz :");
    matematik = giris.nextInt();

    System.out.print("Fizik Notunuzu Giriniz :");
    fizik = giris.nextInt();

    System.out.print("Kimya Notunuzu Giriniz :");
    kimya = giris.nextInt();

    System.out.print("Türkçe Notunuzu Giriniz :");
    turkce = giris.nextInt();

    System.out.print("Tarih Notunuzu Giriniz :");
    tarih = giris.nextInt();

    System.out.print("Müzik Notunuzu Giriniz :");
    muzik = giris.nextInt();

    int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
    double sonuc = toplam / 6;

    System.out.print("Not Ortalamanız :" + sonuc);
    String gectiKaldi = ( sonuc >= 60) ?  "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
    System.out.print(gectiKaldi);
  }
}
