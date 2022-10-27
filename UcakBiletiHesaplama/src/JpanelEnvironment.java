import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class JpanelEnvironment {

    public void environment() {
        Hesaplama hesaplama = new Hesaplama();
        Jpanel jPanel = new Jpanel();

        JFrame f = new JFrame("UmutJet");
        f.setLayout(new FlowLayout());

        UtilDateModel modelT = new UtilDateModel();
        modelT.setSelected(true);
        UtilDateModel modelGD = new UtilDateModel();
        modelGD.setSelected(true);
        Properties p = new Properties();
        p.put("text.today", "Gün");
        p.put("text.month", "Ay");
        p.put("text.year", "Yıl");
        JDatePanelImpl datePanelT = new JDatePanelImpl(modelT, p);
        JDatePickerImpl datePickerT = new JDatePickerImpl(datePanelT,  new DateLabelFormatter());
        JDatePanelImpl datePanelGD = new JDatePanelImpl(modelGD, p);
        JDatePickerImpl datePickerGD = new JDatePickerImpl(datePanelGD,  new DateLabelFormatter());

        String[] country = {"Lütfen Seçim Yapınız", "Ankara", "İstanbul", "Antalya", "Van", "İzmir", "Gaziantep", "Çanakkale", "Tokat"};
        JLabel label = new JLabel("Kalkış");
        JComboBox departure = new JComboBox(country);
        JLabel label1 = new JLabel("Varış");
        JComboBox arrival = new JComboBox();
        JLabel label3 = new JLabel("Gidiş Tarihi");
        JLabel label4 = new JLabel("Dönüş Tarihi");

        JRadioButton radioT = new JRadioButton("Tek Yön");
        JRadioButton radioGD = new JRadioButton("Gidiş Dönüş");

        JButton b1 = new JButton("Hesapla");
        JButton b2 = new JButton("Çıkış");
        JButton b3 = new JButton("Başa Dön");

        String[] ageUntil = {"0-12 Yaş", "12-24 Yaş", "25-64 Yaş", "65 Yaş Üstü"};
        JComboBox age = new JComboBox(ageUntil);

        JPanel panel = new JPanel(new GridLayout(2,2));
        panel.add(age);
        JPanel panel1 = new JPanel(new GridLayout(2,2));
        panel1.add(radioT);
        panel1.add(radioGD);
        JPanel panel2 = new JPanel(new GridLayout(4,1));
        panel2.add(label);
        panel2.add(departure);
        panel2.add(label1);
        panel2.add(arrival);

        JPanel panel3 = new JPanel(new GridLayout(4,2));
        panel3.add(label3);
        panel3.add(datePickerT);

        JPanel panel4 = new JPanel(new GridLayout(3,2));
        panel4.add(b2);
        b2.setForeground(Color.RED);
        panel4.add(b3);
        b3.setForeground(Color.blue);

        f.add(panel);
        f.add(panel1);
        f.add(panel2);

        f.add(panel3);
        f.add(panel4);

        f.setSize(1500, 200);
        //f.setLocationByPlatform(true);
        //f.setVisible(true);
        f.show();

        radioGD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel3.add(label4);
                panel3.add(datePickerGD);
                Date selectedValueGD = (Date) datePickerT.getModel().getValue();
                f.show();
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                jPanel.panel();
            }
        });

        departure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedDeparture = (String) departure.getSelectedItem();
                if (selectedDeparture.equals("Ankara")) {
                    String[] selectedArrivalCountry = {"İstanbul", "Van"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("Van")) {
                    String[] selectedArrivalCountry = {"Ankara"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("İstanbul")) {
                    String[] selectedArrivalCountry = {"Ankara", "Antalya"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("İzmir")) {
                    String[] selectedArrivalCountry = {"Gaziantep"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("Gaziantep")) {
                    String[] selectedArrivalCountry = {"İzmir"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("Çanakkale")) {
                    String[] selectedArrivalCountry = {"Tokat"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                else if (selectedDeparture.equals("Tokat")) {
                    String[] selectedArrivalCountry = {"Çanakkale"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
                //else if (selectedDeparture.equals("Antalya")) {
                else
                {
                    String[] selectedArrivalCountry = {"İstanbul"};
                    arrival.removeAllItems();
                    for (String i : selectedArrivalCountry) {
                        arrival.addItem(i);
                    }
                    departure.updateUI();
                    arrival.updateUI();
                    panel4.add(b1);
                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            String selectedDeparture = (String) departure.getSelectedItem();
                            String selectedArrival = (String) arrival.getSelectedItem();
                            boolean selectedRadioT = Boolean.parseBoolean(String.valueOf(radioT.isSelected()));
                            boolean selectedRadioGD = Boolean.parseBoolean(String.valueOf(radioGD.isSelected()));
                            String selectedAge = (String) age.getSelectedItem();
                            Date selectedValueT = (Date) datePickerT.getModel().getValue();
                            Date selectedValueGD = (Date) datePickerGD.getModel().getValue();
                            hesaplama.biletHesaplama(selectedDeparture, selectedArrival, selectedRadioT, selectedRadioGD, selectedAge, selectedValueT, selectedValueGD);
                        }
                    });
                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            System.exit(0);
                        }
                    });
                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                            jPanel.panel();
                        }
                    });
                    f.show();
                }
            }
        });
        departure.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            }
        });
    }
}
class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {
    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }
    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}
