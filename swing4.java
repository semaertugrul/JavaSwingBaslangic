
package ......................;
import javax.swing.*;
import java.awt.*; //Ekran hizalamalari yani layoutlar icin gerekli kutuphane
import java.awt.event.*; //Button click olayi için gerekli kutuphane
/**
 *
 * @author sema
 */
 //Javada çoklu miras olmadigi icin ActionListener inline classi implements edilmistir.

public class swing4 extends JFrame implements ActionListener{

//Burada tanimlamayip direkt yapici fonksiyonun icerisinde olusturulmus olsaydı baska fonksiyonlar tarafindan erisilemezlerdi. 
    JTextField Text1,Text2;
    
    public swing4(){
    this.setSize(300,250);
    this.setVisible(true);
    this.setTitle("FORM");
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FlowLayout yerlesim = new FlowLayout(FlowLayout.LEFT); 
    // Ekledigim her elemanin birbirinin uzerine eklenmesini onlemek icin elemanlari sola dogru yaslayabilecegim bir layout tercih ettim.
    this.setLayout(yerlesim);
    JLabel etiket1 = new JLabel("Birinci Sayi");
    this.add(etiket1);
    Text1 = new JTextField(20);
    this.add(Text1);
    JLabel etiket2 = new JLabel ("İkinci Sayi");
    this.add(etiket2);
    Text2 = new JTextField(20);
    this.add(Text2);
    
    JButton Button1 = new JButton("TOPLA");
    Button1.addActionListener(this);
    this.add(Button1);
    
    JButton Button2 = new JButton("CIKAR");
    Button2.addActionListener(this);
    this.add(Button2);
    
    }
 
   public void actionPerformed(ActionEvent event){
        String click = event.getActionCommand(); //click islemi yapilan tusa ait string degerini doner.
          String str1,str2;
          str1 = Text1.getText();
          str2 = Text2.getText();
          if(click.equals("TOPLA"))
        {   int number1,number2;
         number1 = Integer.parseInt(str1);
         number2 = Integer.parseInt(str2);
         int sonuc = number1+number2;
         JOptionPane.showMessageDialog(this, sonuc);}
          
            if(click.equals("CIKAR"))
        {   int number1,number2;
         number1 = Integer.parseInt(str1);
         number2 = Integer.parseInt(str2);
         int sonuc = number1-number2;
         JOptionPane.showMessageDialog(this, sonuc);}
    
   }
   
   
 public static void main(String [] args){
    
        swing4 form = new swing4();
    }
}
