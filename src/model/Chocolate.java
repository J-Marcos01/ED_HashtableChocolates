package model;

public class Chocolate {

		private double volume;
		private String nome;
		private int peso;
		
		
	public Chocolate() {
		super();
	}


	@Override
	public int hashCode() {
		return (int) ((volume - 50) / 50);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		return Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}


	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Chocolate nome "+ nome +", volume" + volume +", peso=" + peso + "";
	}

		
}
