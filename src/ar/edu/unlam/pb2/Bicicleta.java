package ar.edu.unlam.pb2;

public class Bicicleta {

		private Integer cadencia;
		private Integer velocidad;
		
		
		public Bicicleta()
		{
			this.cadencia=0;
			this.velocidad=0;
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
		
		public void frenar(){
			velocidad--;
		}

}
