import java.util.Scanner;

public class BasamakSayilari {

    public void sayiDegerleriniTopla()
    {
        System.out.println("Bu program girdiğiniz tam sayının basamak değerlerinin toplamını verecektir.");
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi;
        Scanner okuma = new Scanner(System.in);
        sayi = okuma.nextInt();

        while(sayi<0)
        {
            System.out.println("Sıfırdan küçük sayı girdiniz lütfen yenileniyiniz!");
            System.out.print("Lütfen bir sayı giriniz: ");
            sayi = okuma.nextInt();
        }
        while(sayi>=0)
        {
            int birlerBasamagi = sayi % 10;
            int sayiTemp = sayi / 10;
            int onlarBasamagi = sayiTemp%10;
            int yuzlerBasamagi = sayi / 100;
            int basamakDegeriToplami = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;
            System.out.println(birlerBasamagi);
            System.out.println(onlarBasamagi);
            System.out.println(yuzlerBasamagi);
            System.out.println(basamakDegeriToplami);
            break;
        }
    }
}
