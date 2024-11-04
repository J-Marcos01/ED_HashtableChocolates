package controller;

import java.io.IOException;

import model.Chocolate;

public interface IChocolateController {

	public void descreveChocolate(Chocolate chocolate) throws Exception;
	public void listarChocolate ( ) throws Exception;
}
