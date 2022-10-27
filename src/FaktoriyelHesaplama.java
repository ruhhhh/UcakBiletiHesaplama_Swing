import java.util.Scanner;
public class FaktoriyelHesaplama {

    public void recursiveYapi()
    {
        System.out.print("Faktöriyelini hesaplayacağınız sayıyı giriniz: ");
        Scanner okuma = new Scanner(System.in);
        int deger = okuma.nextInt();
        System.out.print(deger + "!" + " sonucunuz: " + faktoriyel(deger));
    }
    int faktoriyel(int deger)
    {
        if(deger == 1 || deger == 0)
        {
            return 1;
        }
        else
        {
            return deger * faktoriyel(deger-1);
        }
    }
}
