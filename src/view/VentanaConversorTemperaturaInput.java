package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConversorTemperaturaInput extends JFrame implements ActionListener {

	private JPanel contentPane;
	JTextField textInput;
	JButton btnSiguiente, btnAtras;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaConversorTemperaturaInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
		setTitle("Conversor de Temperatura");
		setResizable(false);
		setLocationRelativeTo(null);
		
	}//2411257

	private void iniciarComponentes() {
		JLabel lblinput = new JLabel("Digite la cantidad a convertir: ");
		lblinput.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblinput.setBounds(20, 25, 258, 14);
		contentPane.add(lblinput);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSiguiente.setBounds(194, 50, 89, 23);
		btnSiguiente.addActionListener(this);
		contentPane.add(btnSiguiente);
		
		btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAtras.setBounds(300, 50, 89, 23);
		btnAtras.addActionListener(this);
		contentPane.add(btnAtras);
		
		textInput = new JTextField();
		textInput.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textInput.setBounds(20, 51, 155, 20);
		contentPane.add(textInput);
		textInput.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnAtras==e.getSource()) {
			this.dispose();
			VentanaPrincipal main = new VentanaPrincipal();
			main.setVisible(true);
		}
		
		if(btnSiguiente==e.getSource()) {
			if(validaInputNum()&validaEmpty()) {
				this.dispose();
				VentanaSeleccionTemp selTemp = new VentanaSeleccionTemp();
				selTemp.asignarinput(textInput.getText());
				selTemp.setVisible(true);	
			}
		}
		
	}


	private boolean validaInputNum() {
		if(textInput.getText().matches("[0-9]*")&textInput.getText().contains(".")) {
			return true;
		}else if(textInput.getText().matches("[0-9]*")|textInput.getText().contains(".")){
			return true;
		}else {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero válido.");
			textInput.requestFocus();
			return false;
		}
	}
	
	private boolean validaEmpty() {
		if(textInput.getText().equals("")|textInput.getText().equals(".")) {
			JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad.");
			textInput.requestFocus();
			return false;
		}else {
			return true;
		}
	}
	
	

}
