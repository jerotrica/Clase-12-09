package ar.edu.unlam.pb2;

public class Bicicleta {

		protected Integer plato;
		protected Integer pinion;
		private Integer cadencia;
		protected Integer velocidad;
		
		//private String tipo;
		
		public Bicicleta()
		{
			this.plato=1;
			this.pinion=1;
			this.cadencia=0;
			this.velocidad=0;
		}

		public Integer getPlato() {
			return plato;
		}
		
		public Integer getPinion() {
			return pinion;
		}

		public Integer getCadencia() {
			return cadencia;
		}

		public void setCadencia(Integer cadencia) {
			this.cadencia = cadencia;
		}

		public Integer getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(Integer velocidad) {
			this.velocidad = velocidad;
		}
		
		public void acelerar(){
			velocidad++;
		}

}
