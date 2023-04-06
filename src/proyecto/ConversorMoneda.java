package proyecto;

public class ConversorMoneda extends Principal{

	private double Moneda;

	public double MexDolar(double moneda){
		this.Moneda = Math.round((moneda/18.13)*100)/100d;   // Para reducir los decimales del double se usa Math.round(x*100)/100d
		return this.Moneda;
	}
	
	public double MexEuro(double moneda){
		this.Moneda = Math.round((moneda/19.87)*100)/100d;
		return this.Moneda;
	}
	
	public double MexLibra(double moneda){
		this.Moneda = Math.round((moneda/22.67)*100)/100d;;
		return this.Moneda;
	}
	
	public double MexYenes(double moneda){
		this.Moneda = Math.round((moneda/0.14)*100)/100d;;
		return this.Moneda;
	}
	
	public double MexWon(double moneda){
		this.Moneda = Math.round((moneda/0.014)*100)/100d;;
		return this.Moneda;
	}
	
	public double DolarMex(double moneda){
		this.Moneda = Math.round((moneda*18.13)*100)/100d;;
		return this.Moneda;
	}
	
	public double EuroMex(double moneda){
		this.Moneda = Math.round((moneda*19.87)*100)/100d;;
		return this.Moneda;
	}
	
	public double LibraMex(double moneda){
		this.Moneda = Math.round((moneda*22.67)*100)/100d;;
		return this.Moneda;
	}
	
	public double YenesMex(double moneda){
		this.Moneda = Math.round((moneda*0.14)*100)/100d;;
		return this.Moneda;
	}
	
	public double WonMex(double moneda){
		this.Moneda = Math.round((moneda*0.014)*100)/100d;;
		return this.Moneda;
	}
	
	public double getMoneda() {
		return Moneda;
	}

	public void setMoneda(double moneda) {
		Moneda = moneda;
	}

	
}
