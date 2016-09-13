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
		this.PINION_MAXIMO= getPINION_MAXIMO();
		this.PLATO_MAXIMO = getPLATO_MAXIMO();
	}
	
	public BiciConCambios(Integer plato, Integer pinion, Integer platoMaximo,Integer pinionMaximo){
		super();
		this.plato=plato;
		this.pinion=pinion;
		this.PINION_MAXIMO= pinionMaximo;
		this.PLATO_MAXIMO = platoMaximo;
		
	}
	
	public void setPlato(Integer plato)
	{
		if(this.plato>=1 && this.plato<=PLATO_MAXIMO)
		{
			this.plato=plato;
		}
	}
	
	public void setPinion(Integer pinion)
	{
		if(this.pinion>=1 && this.pinion<=PINION_MAXIMO)
		{
			this.pinion=pinion;
		}
	}

	public Integer getPlato() {
		return plato;
	}

	public Integer getPinion() {
		return pinion;
	}

	public Integer getPLATO_MAXIMO() {
		return PLATO_MAXIMO;
	}

	public Integer getPINION_MAXIMO() {
		return PINION_MAXIMO;
	}

}