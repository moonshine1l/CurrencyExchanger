import javax.swing.*;

public class Function {
    public boolean check(String input){
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
        }catch(NumberFormatException e) {
            return false;
        }
    }

    public void dollarsToRubles(double Minput) {
        double rubles = Minput * 60.52;
        JOptionPane.showMessageDialog(null, "Это " + rubles + " рублей");
    }

    public void dollarsToPounds(double Minput) {
        double pound = Minput * 0.82829;
        JOptionPane.showMessageDialog(null, "Это " + pound + " фунтов стерлингов");
    }
}
