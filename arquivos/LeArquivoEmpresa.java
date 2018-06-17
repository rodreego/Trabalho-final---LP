package arquivos;
import java.io.*;
import java.util.*;
import test.Empresa;
//import Empresa;

public class LeArquivoEmpresa {
	private Scanner entrada;
	
	public LeArquivoEmpresa (String nome) throws FileNotFoundException{
		try{
			this.entrada = new Scanner (new FileReader (nome));
		}
		catch (FileNotFoundException e){
			throw new FileNotFoundException ("ARQUIVO NAO ENCONTRADO");
		}
	}
	public void leArquivo (ArrayList<Empresa> cad)throws IllegalStateException{
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
	private Empresa leLinha (String linha)throws NoSuchElementException{
		String[] dados;
		
		try{
			dados = linha.split(";");
			String cnpj = dados[0];
			String nome = dados[1];
			String email = dados[2];
			String endereco = dados[3];
			return (new Empresa(cnpj, nome, email, endereco));
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
