/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import org.opencv.core.Core;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BIN {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
        try {
            // TODO code application logic here
       //      System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           
          Splash splash=new Splash();
          splash.setVisible(true);
            System.out.println(System.getProperty("user.dir"));
            
        } catch (IllegalAccessException ex) {
            System.out.println(ex);
            Logger.getLogger(BIN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
            Logger.getLogger(BIN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
