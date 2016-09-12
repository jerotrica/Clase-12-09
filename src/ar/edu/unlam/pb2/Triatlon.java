package ar.edu.unlam.pb2;

public class Triatlon extends Ruta {

	private String acople;
	
	public Triatlon(){
		super(2,9);
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
