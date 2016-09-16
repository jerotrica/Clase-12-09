package ar.edu.unlam.pb2;

public class Ruta extends BiciConCambios {

	private Integer aceleracion;

	public Ruta(Integer platoMaximo,Integer pinionMaximo){
		super(platoMaximo, pinionMaximo);
	}

	public Ruta(Integer aceleracion) {
		super();
		this.aceleracion = aceleracion;
	}

	public Integer getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(Integer aceleracion) {
		this.aceleracion = aceleracion;
	}

	public void acelerar() {
		for (Integer i = 0; i < this.aceleracion; i++) {
			super.acelerar();
			super.acelerar();
		}
	}
}

//Comment