import java.util.Scanner;

public class SolaYatikUcgen {

    public void ucgenCizimi()
    {
        System.out.print("Çizilecek üçgenin boy uzunluğunu giriniz: ");
        Scanner okuma = new Scanner(System.in);
        int deger = okuma.nextInt();
        for(int i = 0; i<deger; i++)
        {
            for(int j=i; j<deger; j++)
            {
                //System.out.print(" "); //Bu kod çalıştırılırsa sağa yatık üçgen olur
            }
            for(int k=0; k<i; k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
