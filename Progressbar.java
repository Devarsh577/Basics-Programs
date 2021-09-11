
import javax.swing.*;
public class Progressbar extends JFrame{

JProgressBar jpb;
int i=0;
Progressbar(){
    jpb= new JProgressBar(0,2000);
    jpb.setBounds(40, 40, 200, 30);
    jpb.setValue(0);
    jpb.setStringPainted(true);
    add(jpb);

    setSize(400, 400);
    setLayout(null);
    setVisible(true);

}
public void iterate(){

    while(i<=1000){

        jpb.setValue(i);
        i=i+20;
        
       try {
           Thread.sleep(1000);
       } catch (Exception e) {
           System.out.println(e);
       } 
    }
}
public static void main(String args[]){

    Progressbar pb= new Progressbar();
    pb.iterate();
}












    
    
}
