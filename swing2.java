
import javax.swing.*;
/**
 *
 * @author sema
 */
public class swing2 {
    public swing2(){ //swing2 classının paremetresiz yapicisi.
    JFrame Form1 = new JFrame(); //JFrame classına ait nesne olusturulmasi
    Form1.setSize(300,300);
    Form1.setVisible(true); //Form1'in görünür olmasini saglar
    Form1.setTitle("Form1");
    Form1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Pencere kapansa bile class uzantili
    //bytecode dosyasini calistiran java.exe programi geri planda calismaya devam eder. 
    //Java.exe nin calismasini sona erdirir.
    }
    public static void main (String [] args){
    
        swing2 Form = new swing2();//swing2 classindan nesne olusturuldu.
    }
}
