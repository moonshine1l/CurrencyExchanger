import javax.swing.*;

public class Runner {
    public static void main(String[] args) {

        Function f = new Function();
        Object[] foptions = {"Рубли", "Фунты стерлингов", "Выход"};
        Object[] soptions = {"Снова", "Выход"};


        while(true){
             String input = JOptionPane.showInputDialog(null, "Введите значение");
             System.out.println(input);

             if(f.check(input) == true){
                 double Minput = Double.parseDouble(input);

                 int fchoice = JOptionPane.showOptionDialog(null, "Выберете валюту",
                         "Обменник валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                         foptions, foptions[2]);

                 if(fchoice == 0){
                     f.dollarsToRubles(Minput);

                     int schoice = JOptionPane.showOptionDialog(null, "Что вы хотите сделать?",
                             "Обменник валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                             soptions, soptions[1]);
                     if (schoice == 0){
                     }else { break;}

                 }else if(fchoice == 1){
                     f.dollarsToPounds(Minput);

                     int schoice = JOptionPane.showOptionDialog(null, "Что вы хотите сделать?",
                             "Обменник валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                             soptions, soptions[1]);

                     if (schoice == 0){
                     }else { break;}

                 }else {break;}

             }else{
                 JOptionPane.showMessageDialog(null, "Некорректное значение");

                 int schoice = JOptionPane.showOptionDialog(null, "Что вы хотите сделать?",
                         "Обменник валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                         soptions, soptions[1]);
                 if (schoice == 0){

                 }else { break;}
             }
         }
    }
}
