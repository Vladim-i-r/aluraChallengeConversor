package proyecto;

public class ConversorTemperatura extends Principal {

	private double temp;
	
	public double CelciusFahrenheit(double valor) {
		return this.setTemp(Math.round(((valor-32)/1.8)*100/100d));
	}
	
	public double FahrenheitCelcius(double valor) {
		return this.setTemp(Math.round(((valor*1.8)+32)*100/100d)); 
	}

	public double getTemp() {
		return temp;
	}

	public double setTemp(double temp) {
		this.temp = temp;
		return temp;
	}
}
