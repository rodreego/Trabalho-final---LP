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
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import arquivos.LerArquivoLogin;
public class LoginAut {
    
    private static StringBuffer memoria = new StringBuffer();
    private static ArrayList<String> arrayPesquisa = new ArrayList();
    private static LerArquivoLogin leitura = new LerArquivoLogin();
    
    public static boolean authenticate(String username, String password) {
        String arquivo = "";
        arrayPesquisa.clear();
        if (username.length() == 11) {
            arquivo = "cadastroProfissional.txt";
        }else{
            if (username.length() == 14)
            arquivo = "cadastroEmpresa.txt";
        }
        arrayPesquisa = leitura.ler(arquivo,username,7);
        String cpfCnpj = arrayPesquisa.get(0);
        String senha = arrayPesquisa.get(1);
        if (username.equals(cpfCnpj) && password.equals(senha)) {
            return true;
        }else{
            return false;
        }
    }
    
    public static ArrayList<String> getArray() {
        return arrayPesquisa;
    }
}

