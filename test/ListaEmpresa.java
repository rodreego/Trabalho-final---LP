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
public class ListaEmpresa {
private ArrayList <Empresa> lista1;


    public ListaEmpresa() {
        lista1 = new ArrayList<Empresa>();   
    }
    
    public   ArrayList <Empresa> listaEmpresComp(){
        return lista1;
    }
    
    

    public String imprimeListasEmpresas() {
		String nome = "";
		for(Empresa func: lista1){
			nome+= func.toString()+"\n";
			//total += func.calculaSalario();
		}
		//System.out.println ("\nTOTAL DA FOLHA: R$"+total);
                return nome;
	}
    public void cadEmpresa(String cnpj, String nome, String email,String Endereco) {
        //Profissional ger = new Profissional(nome, matricula);
        Empresa empr = new Empresa(cnpj, nome, email, Endereco);
        lista1.add(empr);    
}
        public void SeCadastraOuAlterarEmpresa(String cnpj, String nome, String email,String Endereco) {
            int pos = pesquisaCnpj(cnpj);
		if (pos>=0){
                    alterarEmpresa(pos, cnpj, nome, email, Endereco);
                    System.out.println("Alterado com sucesso");

		}else{
			System.out.println("Empresa nao encontrado");
                        cadEmpresa(cnpj, nome, email, Endereco);
                        System.out.println("Cadastrado com sucesso");

		}
        }

    public void alterarEmpresa(int index,String cnpj, String nome, String email,String Endereco) {
		int pos = index;
		if (pos>=0){
			lista1.get(pos).setCnpj(cnpj);
			lista1.get(pos).setNome(nome);
                        lista1.get(pos).setEmail(email);
                        lista1.get(pos).setEndereco(Endereco);
	}
    }
    
    public  int pesquisaCnpj (String cnpj){
		String pesCnpj = cnpj;
		Empresa aux;
		for (int i=0; i<lista1.size(); i++){
			aux = lista1.get(i);
			if (aux.getCnpj().equalsIgnoreCase(cnpj)){
				return i;
			}
		}
		return -1;
    }
    
    public  String imprimirNomeEmpr(String cnpj){
        int pos = pesquisaCnpj (cnpj);
        if (pos>=0)
            return lista1.get(pos).getNome();
           else
            return "Empresa nao encontrado";
    }
    public  Empresa getDadosEmpr(String cnpj){
        int pos = pesquisaCnpj (cnpj);
        return lista1.get(pos);
    }

}
