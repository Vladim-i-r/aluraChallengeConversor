package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyecto.ConversorMoneda;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;

public class VentanaSeleccionDivisa extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnConvertir, btnCancelar;
	JComboBox boxDivisas;
	String input;
	
	/**
	 * Create the frame.
	 * @param string 
	 */
	public VentanaSeleccionDivisa() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		iniciarComponentes();
		setTitle("Conversor de Divisas");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		boxDivisas = new JComboBox();
		boxDivisas.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		boxDivisas.setModel(new DefaultComboBoxModel(new String[] { "Pesos a Dolar", "Pesos a Euros",
				"Pesos a Libras Esterlinas", "Pesos a Yen Japones", "Pesos a Won sul-coreano", "Dolar a Pesos",
				"Euros a Pesos", "Libras Esterlinas a Pesos", "Yen Japones a Pesos", "Won sul-coreano a Pesos" }));
		boxDivisas.setBounds(30, 44, 154, 22);
		contentPane.add(boxDivisas);

		JLabel lblseleccion = new JLabel("Seleccione la divisa a convertir: ");
		lblseleccion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblseleccion.setBounds(30, 19, 207, 14);
		contentPane.add(lblseleccion);

		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnConvertir.setBounds(201, 44, 89, 23);
		contentPane.add(btnConvertir);
		btnConvertir.addActionListener(this);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCancelar.setBounds(300, 44, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (btnCancelar == e.getSource()) {
			this.dispose();
			VentanaPrincipal main = new VentanaPrincipal();
			main.setVisible(true);
		}
		
		if (btnConvertir == e.getSource()) {
			double cantidad = Double.parseDouble(input);
			ConversorMoneda moneda = new ConversorMoneda();
			switch (boxDivisas.getSelectedIndex()) {
			case 0:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " pesos a dolar son: " + moneda.MexDolar(cantidad) + " dolares." );
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " pesos a euros son: " + moneda.MexEuro(cantidad) + " euros." );
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " pesos a libras son: " + moneda.MexLibra(cantidad) + " libras." );
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " pesos a yenes son: " + moneda.MexYenes(cantidad) + " yenes." );
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " pesos a won son: " + moneda.MexWon(cantidad) + " won." );				
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " dolares a pesos son: " + moneda.DolarMex(cantidad) + " pesos." );		
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " euros a pesos son: " + moneda.EuroMex(cantidad) + " pesos." );		
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " libras a pesos son: " + moneda.LibraMex(cantidad) + " pesos." );		
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " yenes a pesos son: " + moneda.YenesMex(cantidad) + " pesos." );		
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " won a pesos son: " + moneda.WonMex(cantidad) + " pesos." );		
				break;
			}
			

			VentanaDeseaContinuar continua = new VentanaDeseaContinuar();
			continua.setVisible(true);
		}

	}

	public void asignarinput(String text) {
		this.input = text;
		
	}

	
}
