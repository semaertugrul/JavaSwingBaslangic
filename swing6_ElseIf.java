
package .............;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author sema
 */
public class swing6_ElseIf extends JFrame implements ActionListener{
    JTextField txt1,txt2;
    
    public swing6_ElseIf(){
    this.setSize(300,300);
    this.setVisible(true);
     this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    FlowLayout yerlesim = new FlowLayout(FlowLayout.LEFT);
    this.setLayout(yerlesim);
    JLabel etiket1 = new JLabel("Vize Notu :");
    this.add(etiket1);
     txt1 = new JTextField(20);
     this.add(txt1);
     JLabel etiket2 = new JLabel("Final Notu :");
     this.add(etiket2);
     txt2 = new JTextField(20);
     this.add(txt2);
     
     JButton btn = new JButton("HESAPLA");
     btn.addActionListener(this);
     this.add(btn);
    }
    
    public void actionPerformed (ActionEvent e){
    
    int vize_ = Integer.parseInt(txt1.getText());
    int final_=Integer.parseInt(txt2.getText());
    int sonuc = (vize_+final_)/2;
    
    if (sonuc <= 100 && sonuc >= 85){
    JOptionPane.showMessageDialog(this,"AA");
    }
    
    else if (sonuc <= 84 && sonuc >= 70){
    JOptionPane.showMessageDialog(this,"BA");
    }
    
    else  if (sonuc <=69 && sonuc >= 50){
    JOptionPane.showMessageDialog(this,"CB");
    }
      
    else   if (sonuc <= 49 && sonuc >= 30){
    JOptionPane.showMessageDialog(this,"CC");
    }
       
    else   if (sonuc <= 29 && sonuc >= 0){
    JOptionPane.showMessageDialog(this,"FF");
    }
  
 
 }
    
  
 
    public static void main(String [] args){
    
    swing6_ElseIf nesne = new swing6_ElseIf();
    
    }
}
