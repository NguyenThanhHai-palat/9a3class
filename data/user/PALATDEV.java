import javax.swing.*;

import java.awt.HeadlessException;
import java.util.Scanner;
public class PALATDEV {
  public static void main(String[] args) {
        Scanner NAMEObj = new Scanner(System.in);
        Scanner WORKObj = new Scanner(System.in);
        try (Scanner AGEObj = new Scanner(System.in)) {
            String NAMEinput,WORKinput,AGEinput;
            System.out.println("Nhập Tên"); 
            NAMEinput = NAMEObj.nextLine();  
            JFrame fillscreen = new JFrame();
            String name = NAMEinput; 
            System.out.println("Nhập Tuổi"); 
            AGEinput = AGEObj.nextLine();  
            String age = AGEinput; 
            System.out.println("Nhập Công Việc"); 
            WORKinput = WORKObj.nextLine();  
            String Dowork = WORKinput; 
            fillscreen.setSize(500, 500);
            fillscreen.setLayout(null);
            fillscreen.setVisible(true);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Work: " + Dowork);
            JLabel a = new JLabel("Name: " + name);
            JLabel b = new JLabel("Age: " + age);
            JLabel c = new JLabel("Work: " + Dowork);
            a.setBounds(170, -10, 1200, 200);
            b.setBounds(1, 1, 1200, 200);
            c.setBounds(1, 16, 1100, 200);
            fillscreen.add(a);
            fillscreen.add(b);
            fillscreen.add(c);
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        System.out.println("HOAN THANH KHOI TAO !");

  }
}