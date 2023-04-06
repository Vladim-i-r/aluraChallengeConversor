package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Predicate;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaDivInput extends JFrame implements ActionListener{

	private JPanel input;
	JTextField textCantidad;
	JButton btnCantidad;
	JButton btnAtras;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public VentanaDivInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 136);
		input = new JPanel();
		input.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(input);
		input.setLayout(null);
		
		iniciarComponentes();
		setTitle("Conversor de Divisas");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		JLabel lblCantidad = new JLabel("Indique la cantidad a convertir:");
		lblCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCantidad.setBounds(21, 23, 195, 14);
		input.add(lblCantidad);
		
		textCantidad = new JTextField();
		textCantidad.setToolTipText("");
		textCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textCantidad.setBounds(21, 48, 159, 20);
		input.add(textCantidad);
		textCantidad.setColumns(10);
		
		btnCantidad = new JButton("Siguiente");
		btnCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCantidad.setBounds(190, 47, 89, 23);
		btnCantidad.addActionListener(this);
		input.add(btnCantidad);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAtras.setBounds(289, 47, 89, 23);
		input.add(btnAtras);
		btnAtras.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnAtras==e.getSource()) {
			this.dispose();
			VentanaPrincipal main = new VentanaPrincipal();
			main.setVisible(true);
		}
		
		if(btnCantidad==e.getSource()) {
			if(validaInputNum()&validaEmpty()) {
				this.dispose();
				VentanaSeleccionDivisa selDiv = new VentanaSeleccionDivisa();
				selDiv.asignarinput(textCantidad.getText());
				selDiv.setVisible(true);	
			}
		}
		
		
	}
	
	
	public boolean validaInputNum() {
		if(textCantidad.getText().matches("[0-9]*")&textCantidad.getText().contains(".")) {
			return true;
		}else if(textCantidad.getText().matches("[0-9]*")|textCantidad.getText().contains(".")){
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero válido.");
			textCantidad.requestFocus();
			return false;
		}
	}
	
	public boolean validaEmpty() {
		if(textCantidad.getText().equals("")|textCantidad.getText().equals(".")) {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad.");
			textCantidad.requestFocus();
			return false;
		}else {
			return true;
		}
	}
	
	

}
