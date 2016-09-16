package ar.edu.unlam.pb2;

public class Triatlon extends BiciConCambios {

	private String acople;
	
	public Triatlon(){
		super();
	}
	
	public Triatlon(Integer platoMaximo, Integer pinionMaximo){
		super(platoMaximo,pinionMaximo);
	}
	public String getAcople() {
		return acople;
	}

	public void setAcople(String acople) {
		this.acople = acople;
	}
	
}
