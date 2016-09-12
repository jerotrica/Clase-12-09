package ar.edu.unlam.pb2;

public class Ruta extends Bicicleta {

		public void setPlato(Integer plato)
		{
			if(plato>=1 && plato<=2)
			{
				this.plato = plato;
			}
		}
		
		public void setPinion(Integer pinion)
		{
			if(pinion>=1 && pinion<=9)
			{
				this.pinion = pinion;
			}
		}
		
		public void acelerar(){
			velocidad=velocidad+2;
		}
}
