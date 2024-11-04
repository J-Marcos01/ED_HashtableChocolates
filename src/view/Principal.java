package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ChocolateController;
import controller.IChocolateController;
import model.Chocolate;

public class Principal {

	public static void main(String[] args) throws Exception {

		int opc=0;
		
		IChocolateController cont=new ChocolateController();
		
		while(opc!=9) {
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1-Cadastrar cholocate \n2-Listar chocolates \n9-Finalizar","Menu",JOptionPane.INFORMATION_MESSAGE));
			switch (opc) {
			case 1: {
				Chocolate choco = new Chocolate();
				double volume=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o volume do chocolate","Cadastro de Chocolate",JOptionPane.INFORMATION_MESSAGE));
				choco.setVolume(volume);
				try {
					cont.descreveChocolate(choco);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 2: {
				cont.listarChocolate();
				break;
			}
			case 9: {
				JOptionPane.showMessageDialog(null, "Finalizando...","Fim",JOptionPane.ERROR_MESSAGE);
			break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Digite 1 , 2 ou 9","Valor inválido",JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		
	}

}
