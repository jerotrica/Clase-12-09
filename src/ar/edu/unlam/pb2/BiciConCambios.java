package ar.edu.unlam.pb2;

public class BiciConCambios extends Bicicleta {

	private Integer plato;
	private Integer pinion;
	private final Integer PLATO_MAXIMO;
	private final Integer PINION_MAXIMO;
	
	
	public BiciConCambios()
	{
		super();
		this.plato=1;
		this.pinion=1;
		this.PINION_MAXIMO=1;
		this.PLATO_MAXIMO = 1;
	}
	
	public BiciConCambios()
	{
		
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