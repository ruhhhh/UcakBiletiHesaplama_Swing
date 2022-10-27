import javax.swing.*;
import java.net.MalformedURLException;

public class YenidenBiletHesapla {

    public void yeniden() {

        JpanelEnvironment jpanelEnvironment = new JpanelEnvironment();

        int n = JOptionPane.showConfirmDialog(null, "Farklı bir şehre mi seyehat etmek istiyorsunuz?\nHadi tekrar en ucuz bilete bakalım!", "UmutJet", JOptionPane.YES_NO_OPTION);

        if (n == JOptionPane.YES_OPTION)
        {
            jpanelEnvironment.environment();
        }
        else if (n == JOptionPane.NO_OPTION)
        {
            System.exit(n);
        }
    }
}
