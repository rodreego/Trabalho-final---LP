/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author mfsalomao
 */
public class LerArquivoLogin {
    
    private static StringBuffer memoria = new StringBuffer();
    private static ArrayList<String> array = new ArrayList<String>();
    private static ArrayList<String> arrayErro = new ArrayList<String>();
   
    
    public static ArrayList<String> ler(String nomeArquivo, String username, int nCampos) { 
        String arquivo = nomeArquivo;
        array.clear();
        for (int i=0; i < nCampos ; i++) {
            arrayErro.add(i,"NC");
        }
        try{
            BufferedReader arqentrada;
            arqentrada = new BufferedReader( new FileReader(arquivo));
            String linha;
            while((linha = arqentrada.readLine()) != null){
                memoria.append(linha + "\n");
            }
            int inicio = -1;
            inicio = memoria.indexOf (username);
            int ultimo = memoria.indexOf (";", inicio);
            int primeiro = inicio;
            for (int i=0; i < nCampos; i++) {
                if (inicio != -1){
                    array.add(i,memoria.substring(primeiro, ultimo));
                    primeiro = ultimo + 1;
                    ultimo = memoria.indexOf (";", primeiro);
                }
            }
            return array;
        }catch (Exception e){
            return arrayErro;
        }
    }
}
