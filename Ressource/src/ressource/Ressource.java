/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressource;

import java.awt.GridLayout;
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
        jframe.setLayout(new GridLayout());
        jframe.add(new JTextField("titi")); // Ajout du composant TITI
        jframe.add(new JTextField("et")); // Ajout du composant TITI
        jframe.add(new JTextField("Gros Minet")); // Ajout du composant Gros minet
        jframe.setSize(800, 600);
        jframe.setVisible(true); //Mouai
        
    }
    
}
