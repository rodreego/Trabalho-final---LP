/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author rafa2
 */
public class ListaVaga {
    private ArrayList <Vaga> listaVaga1;
    
     public ListaVaga() {
        listaVaga1 = new ArrayList<Vaga>();   
    }
     
     public   ArrayList <Vaga> listaVagasComp(){
        return listaVaga1;
    }
        
     public void cadVaga(String cnpj,String cargo, String descricao, double salario, int cargaHoraria) {
        Vaga vaga = new Vaga(cnpj, cargo, descricao, salario, cargaHoraria);
        listaVaga1.add(vaga);  
        System.out.println("Alterado com sucesso");

}
        
    public  String imprimeListasVagasEmpresa (String cnpj){
		String pesCnpj = cnpj;
                String txt = "";
		Vaga aux;
		for (int i=0; i<listaVaga1.size(); i++){
			aux = listaVaga1.get(i);
			if (aux.getCnpj().equalsIgnoreCase(pesCnpj)){
				txt+= " " + aux.toString()+ "\n\n";
			}
		}
		return txt;
    }

    
}
