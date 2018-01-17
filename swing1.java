import javax.swing.*;
/**
 *
 * @author sema
 */
public class swing1 {
    
    public static void main (String [] args){
    
        String str1,str2;
        str1 = JOptionPane.showInputDialog("ilk sayi :");
        str2 = JOptionPane.showInputDialog("ikinci sayi :");
        
        int number1, number2;
        
        number1 = Integer.parseInt(str1);//cast
        number2 = Integer.parseInt(str2);//cast
        
        int sonuc = number1+number2;
        
        String str = Integer.toString(sonuc);//cast
        JOptionPane.showMessageDialog(null,str);
    
    }
    
}
