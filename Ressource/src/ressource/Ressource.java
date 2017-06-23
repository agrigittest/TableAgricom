/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressource;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author jeff
 */
public class Ressource {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.add(new JTextField("titi"));
        jframe.setSize(800, 600);
        jframe.setVisible(true); //Mouai
        
    }
    
}
