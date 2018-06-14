/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author mfsalomao
 */

import javax.swing.JPanel;
import javax.swing.JFrame;

public class ExecutavelLogin {
   
    public static void main (String[] args) {
        JFrame janela = new JFrame("Login");
        JPanelLogin meuPainel = new JPanelLogin();
	janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	janela.add(meuPainel);
	janela.setSize(230,460);
	janela.setVisible(true);
    }
}
