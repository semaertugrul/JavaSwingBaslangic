package .........;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author sema
 */
public class swing5_ShowConfirmDialog extends JFrame implements ActionListener{
    
    public swing5_ShowConfirmDialog(){
    
        this.setSize(300,300);
        this.setVisible(true);
        this.setTitle("swing5_ShowConfirmDialog");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout yerlesim = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(yerlesim);
        JButton Button1 = new JButton("TIKLA");
        Button1.addActionListener(this);
        this.add(Button1);
    
    }
    
       public void actionPerformed(ActionEvent par){
       
       int cevap;
       cevap = JOptionPane.showConfirmDialog(null, "çıkılsın mı?");
       
       if(cevap == 0){
       JOptionPane.showMessageDialog(null,"YES 0 değerini döner");
       }
        if(cevap == 1){
       JOptionPane.showMessageDialog(null,"NO 1 değerini döner");
       }
       
       }

       public static void main(String [] args){
       
       swing5_ShowConfirmDialog nesne = new swing5_ShowConfirmDialog();
       
       }




}
