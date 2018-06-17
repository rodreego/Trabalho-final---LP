/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author rafa2
 */

public class Empresa {
    private String cnpj;
    private String nome;
    private String email;
    private String endereco;
	
	public Empresa(String cnpj,String nome, String email, String endereco) {
            this.cnpj = cnpj;
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
        }
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
        
        public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
	public String toString(){
		return (this.cnpj+" "+this.nome+" "+this.email+" "+this.endereco);
	}


}

