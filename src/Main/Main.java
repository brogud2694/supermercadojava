package Main;

import GUI.JPPrincipal;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        initSystem();
    }//END MAIN

    public static void initSystem() {
        JFrame jf = new JFrame();
        JPPrincipal jp = new JPPrincipal();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp);
        jf.pack();
        jf.setVisible(true);
    }//END METHOD INITSYSTEM
}//END CLASS MAIN
