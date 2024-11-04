package controller;

import java.io.IOException;

import br.edu.fateczl.Lista.Lista;
import model.Chocolate;

public class ChocolateController implements IChocolateController {

	Lista [] listaChocolate;
	
	public ChocolateController() {
		listaChocolate=new Lista[5];
		inicializaLista();		
	}
	
	private void inicializaLista() {
		int tamanho=listaChocolate.length;
		for(int i=0;i<tamanho;i++) {
			listaChocolate[i]=new Lista();
		}
		
	}

	@Override
	public void descreveChocolate(Chocolate chocolate) throws Exception {
	
		int posicao=(int)chocolate.hashCode();
		if (posicao==0) {
			chocolate.setNome("Bombom");
			chocolate.setPeso(60);
			listaChocolate[posicao].addFirst(chocolate);
		}
		if(posicao==1) {
			chocolate.setNome("Pavê");
			chocolate.setPeso(115);
			listaChocolate[posicao].addFirst(chocolate);
		}
		if(posicao==2) {
			chocolate.setNome("Brigadeiro");
			chocolate.setPeso(160);
			listaChocolate[posicao].addFirst(chocolate);
		}
		if(posicao==3) {
			chocolate.setNome("Bolo");
			chocolate.setPeso(215);
			listaChocolate[posicao].addFirst(chocolate);
		}
		if(posicao==4) {
			chocolate.setNome("Ovos de Pascoa");
			chocolate.setPeso(280);
			listaChocolate[posicao].addFirst(chocolate);
		}
	}

	@Override
	public void listarChocolate() throws Exception {
		int tamanho=listaChocolate.length;
		
		for(int i=0;i<tamanho;i++) {
			int qtdChocolate=listaChocolate[i].size();
			for(int j=0;j<qtdChocolate;j++) {
				System.out.println(listaChocolate[i].size() +" "+listaChocolate[i].get(j));
			}
			}
		}
		
	}


