import java.util.Scanner;
public class KararYapilari {

    public void ayTahmini()
    {
        System.out.print("1-12 arasında bir sayı giriniz: ");
        Scanner okuma = new Scanner(System.in);
        int i = okuma.nextInt();

        if(1<=i && i<=12)
        {
            if(1<=i && i<=3)
            {
                System.out.println("Mevsim kıştır.");
            }
            else if (4<=i && i<=5)
            {
                System.out.println("Mevsim ilkbahardır.");
            }
            else if (6<=i && i<=8)
            {
                System.out.println("Mevsim yazdır.");
            }
            else if (9<=i && i<10)
            {
                System.out.println("Mevsim sonbahardır.");
            }
            else
            {
                System.out.println("Mevsim kıştır.");
            }
        }
        else
        {
            System.out.println("Aralıkta bir sayı girmediğiniz için program sonlanmıştır.");
        }
    }
}
