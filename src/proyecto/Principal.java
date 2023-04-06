package proyecto;

import view.VentanaPrincipal;

public class Principal {
	
	public static void main(String[] args) {
		
		ConversorMoneda moneda = new ConversorMoneda();
		ConversorTemperatura temp = new ConversorTemperatura();
		mostrarVentana(moneda,temp);
		//moneda
		//moneda.MexDolar(20); //EVENT LISTENER?
		//System.out.println(moneda.getMoneda());
		
		//moneda.MexEuro(100); //EVENT LISTENER?
		//System.out.println(moneda.getMoneda());
	}

	
	
	private static void mostrarVentana(ConversorMoneda moneda,ConversorTemperatura temp) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.asignarDivisas(moneda);
		ventana.asignarTemp(temp);
		ventana.setVisible(true);
		
	}
	
	

}
