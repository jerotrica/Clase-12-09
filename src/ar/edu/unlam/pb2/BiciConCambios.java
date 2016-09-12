package ar.edu.unlam.pb2;

public class BiciConCambios extends Bicicleta {

	private Integer plato;
	private Integer pinion;

	public BiciConCambios()
	{
		this.plato=1;
		this.pinion=1;

	}
	
	public Integer getPlato() {
		return plato;
	}

	public Integer getPinion() {
		return pinion;
	}

	public void setPlato(Integer plato) {
		this.plato = plato;
	}

	public void setPinion(Integer pinion) {
		this.pinion = pinion;

	}

}