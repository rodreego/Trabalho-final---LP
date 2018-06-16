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
public class Vaga {
    private String cnpj, cargo, descricao;
    private double salario;
    private int cargaHoraria;
    
    public Vaga(String cnpj,String cargo, String descricao, double salario, int cargaHoraria){
        this.cnpj = cnpj;
        this.cargo = cargo;
        this.descricao = descricao;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    public String getCargo() {
		return cargo;
	}

	public void setCargo(String nome) {
		this.cargo = nome;
	}
        
      public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String nome) {
		this.descricao = nome;
	}
        
        public double getSalario() {
		return salario;
	}

	public void setSalario(double sal) {
		this.salario = sal;
	}
        public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHs) {
		this.cargaHoraria = cargaHs;
	}
        
        public String toString(){
		return ("Cargo: "+this.cargo+" Desc: "+this.descricao+" Sal. R$: "+this.salario+" cargaHr.: "+this.cargaHoraria);
	}
    
    
}
