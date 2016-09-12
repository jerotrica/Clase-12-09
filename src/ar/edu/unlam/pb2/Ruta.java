package ar.edu.unlam.pb2;

public class Ruta extends Bicicleta {
	
		private final Integer PLATO_MAXIMO;
		private final Integer PINION_MAXIMO;

		
		public Ruta(Integer platoMaximo, Integer pinionMaximo){
			this.PLATO_MAXIMO = platoMaximo;
			this.PINION_MAXIMO = pinionMaximo;
		}
		
		
		public void setPlato(Integer plato)
		{
			if(plato>=1 && plato<=PLATO_MAXIMO)
			{
				super.setPlato(plato);
			}
		}
		
		public void setPinion(Integer pinion)
		{
			if(pinion>=1 && pinion<=PINION_MAXIMO)
			{
				super.setPinion(pinion);
			}
		}
		
		public void acelerar(){
			super.acelerar();
			super.acelerar();
		}
}
