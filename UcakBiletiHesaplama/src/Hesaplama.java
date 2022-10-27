import javax.swing.*;
import java.util.Date;

public class Hesaplama {
    public void biletHesaplama(String selectedDeparture, String selectedArrival, boolean selectedRadioT, boolean selectedRadioGD, String selectedAge, Date selectedValueT, Date selectedValueGD)
    {
        SehirKmHesaplama sehirKmHesaplama = new SehirKmHesaplama();
        KmFiyat kmFiyat = new KmFiyat();
        Jpanel jPanel = new Jpanel();
        YenidenBiletHesapla yenidenBiletHesapla = new YenidenBiletHesapla();
        GidisDonusIndirim gidisDonusIndirim = new GidisDonusIndirim();
        double tutar;

        if(selectedRadioT && selectedRadioGD)
        {
        JOptionPane.showMessageDialog(null, "Yön seçimi hatalıdır veya eksiktir. Lütfen tekrar deneyiniz.");
        }
        else if(selectedRadioT || selectedRadioGD)
        {
            if(selectedDeparture != "Lütfen Seçim Yapınız" || selectedArrival != "Lütfen Seçim Yapınız")
            {
                if(selectedDeparture.equals("Ankara") && selectedArrival.equals("İstanbul"))
                {
                    if(selectedRadioT)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                            return;

                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }

                    }
                    if(selectedRadioGD)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("Ankara") && selectedArrival.equals("Van"))
                {
                    if(selectedRadioT)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if(selectedRadioGD)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("Van") && selectedArrival.equals("Ankara")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraVan() * kmFiyat.kmFiyati() *yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraVan() * kmFiyat.kmFiyati() *yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.AnkaraVan() * kmFiyat.kmFiyati() *yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.AnkaraVan() * kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.AnkaraVan()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if(selectedDeparture.equals("İstanbul") && selectedArrival.equals("Ankara")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()*kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = tutar = sehirKmHesaplama.AnkaraIstanbul()* gidisDonusIndirim.gidisDonusIndirim()*kmFiyat.kmFiyati()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("izmir") && selectedArrival.equals("Gaziantep"))
                {
                    if(selectedRadioT)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if(selectedRadioGD)
                    {
                        if(selectedAge.equals("0-12 Yaş"))
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("12-24 Yaş"))
                        {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else if(selectedAge.equals("65 Yaş Üstü"))
                        {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                        else
                        {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("Gaziantep") && selectedArrival.equals("İzmir")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = tutar = sehirKmHesaplama.IzmirGaziantep()* kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("Tokat") && selectedArrival.equals("Çanakkale")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else if (selectedDeparture.equals("Çanakkale") && selectedArrival.equals("Tokat")) {
                    if (selectedRadioT) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeOnIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeOtuzIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.TokatCanakkale()* kmFiyat.kmFiyati()*yuzdeElliIndirim();
                            JOptionPane.showMessageDialog(null, selectedValueT+" tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                    if (selectedRadioGD) {
                        if (selectedAge.equals("0-12 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeElliIndirim()*2;;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("12-24 Yaş")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOnIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else if (selectedAge.equals("65 Yaş Üstü")) {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*yuzdeOtuzIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        } else {
                            tutar = sehirKmHesaplama.TokatCanakkale()*kmFiyat.kmFiyati()* gidisDonusIndirim.gidisDonusIndirim()*2;
                            JOptionPane.showMessageDialog(null, "Gidiş Dönüş Bilet aldığınız için %20 indirim uygulanmıştır.\n" + selectedValueT +" gidiş "+ selectedValueGD+ " dönüş tarihi için Uçak bileti fiyatınız: " + tutar + "TL");
                            yenidenBiletHesapla.yeniden();
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Seçmiş olduğunuz güzergahta uçuşumuz bulunmamaktadır.");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Seçim yapmadığınız için hesaplama gerçekleştirilememiştir.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Yön seçimi hatalıdır veya eksiktir. Lütfen tekrar deneyiniz.");
        }
    }
    public double yuzdeOnIndirim()
    {
        double yuzdeOn = 0.9;
        return yuzdeOn;
    }

    public double yuzdeElliIndirim()
    {
        double yuzdeElli = 0.5;
        return yuzdeElli;
    }

    public double yuzdeOtuzIndirim()
    {
        double yuzdeOtuz = 0.7;
        return yuzdeOtuz;
    }
}
