package arquivos;
import java.io.*;
import java.util.*;
import test.Vaga;
//import Empresa;

public class LeArquivoVagas {
	private Scanner entrada;
	
	public LeArquivoVagas (String nome) throws FileNotFoundException{
		try{
			this.entrada = new Scanner (new FileReader (nome));
		}
		catch (FileNotFoundException e){
			throw new FileNotFoundException ("ARQUIVO NAO ENCONTRADO");
		}
	}
	public void leArquivo (ArrayList<Vaga> cad)throws IllegalStateException{
		String linha;
		try{
			while (this.entrada.hasNext()){
				linha = this.entrada.nextLine();
				if (!linha.equals(""))
					cad.add(leLinha(linha));
			}
		}
		catch (IllegalStateException e){
			throw new IllegalStateException ("ERRO DE LEITURA DO ARQUIVO");
		}
	}
	private Vaga leLinha (String linha)throws NoSuchElementException{
		String[] dados;
		
		try{
                    //String cnpj,String cargo, String descricao, double salario, int cargaHoraria
			dados = linha.split(";");
			String cnpj = dados[0];
			String cargo = dados[1];
			String descricao = dados[2];
			Double salario = Double.parseDouble(dados[3]);
                        int cargaHs = Integer.parseInt(dados[4]);
			return ( new Vaga(cnpj, cargo, descricao, salario, cargaHs));
		}
		catch (NoSuchElementException e){
			throw new NoSuchElementException ("ARQUIVO DIFERENTE DO REGISTRO ");
		}
	}

	public void fechaArquivo ()throws IOException{
		try{
			this.entrada.close();
		}
		catch (IllegalStateException e){
			throw new IOException ("ERRO AO FECHAR O ARQUIVO");
		}
	}
}
