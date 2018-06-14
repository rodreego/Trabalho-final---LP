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
public class LoginAut {
    
    private static StringBuffer memoria = new StringBuffer();
    
  

  
    public static boolean authenticate(String username, String password) {
        try{
            String arquivo = "";
            if (username.length() == 11) {
                arquivo = "cadastroProfissional.txt";
            }else{
                if (username.length() == 14)
                arquivo = "cadastroEmpresa.txt";
            }
            BufferedReader arqentrada;
            arqentrada = new BufferedReader( new FileReader(arquivo));
            String nome = username;
            String linha;
            String senha;
            while((linha = arqentrada.readLine()) != null){
                memoria.append(linha + "\n");
            }            
            int inicio = -1;
            inicio = memoria.indexOf (nome);
            if (inicio != -1){
                int ultimo = memoria.indexOf ("\t", inicio);
                nome = memoria.substring(inicio, ultimo);
                int primeiro = ultimo + 1;
                ultimo = memoria.indexOf ("\t", primeiro);
                senha = memoria.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                int fim = memoria.indexOf ("\n", primeiro);
                if (username.equals(nome) && password.equals(senha)) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Erro de leitura");
            return false;
        }
    } 
}

