import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    int rndSayi;
    int girilenSayi;
    Scanner okuma = new Scanner(System.in);
    public void sayiOlusturma()
    {
        Random rnd = new Random();
        rndSayi = rnd.nextInt(100);
        System.out.println(rndSayi);
    }
    public void kullaniciyaSayiGirdirme()
    {
        System.out.print("1-100 arasında bir tahmin değerinizi giriniz: ");
        girilenSayi = okuma.nextInt();
        System.out.println("10 adet tahmin hakkınız bulunmaktadır.");
        sayiyiTahminEttirme();
    }
    public void sayiyiTahminEttirme()
    {
        int tahminSayisi = 10;
        while(tahminSayisi>0) {
            if (rndSayi == girilenSayi)
            {
                System.out.println(tahminSayisi + ". tahmininizde başarılı ile tahmin ettiniz.");
            }
            else if (rndSayi - 5 < girilenSayi && girilenSayi < rndSayi + 5)
            {
                System.out.println(tahminSayisi + ". tahmininiz.");
                System.out.println("Çok yaklaştınız. (-5<sayiniz<+5)");
                int tahminSayisiTemp = tahminSayisi + 1;
                System.out.print(tahminSayisiTemp + ". tahmininizi yapınız: ");
                girilenSayi = okuma.nextInt();
            }
            else if (rndSayi - 10 < girilenSayi && girilenSayi < rndSayi + 10)
            {

                System.out.println(tahminSayisi + ". tahmininiz.");
                System.out.println("Çok yaklaştınız. (-10<sayiniz<+10)");
                int tahminSayisiTemp = tahminSayisi + 1;
                System.out.print(tahminSayisiTemp + ". tahmininizi yapınız: ");
                girilenSayi = okuma.nextInt();
            }
            tahminSayisi--;
        }
    }
}
