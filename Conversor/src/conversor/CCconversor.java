package conversor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class CCconversor extends JFrame {

	private JPanel contentPane;
	private JTextField Valor;
	private JTextField Resultado;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCconversor frame = new CCconversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CCconversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblFahrenheit);
		
		Valor = new JTextField();
		Valor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(Valor);
		Valor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celsius:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblNewLabel);
		
		Resultado = new JTextField();
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(Resultado);
		Resultado.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		btnNewButton = new JButton("Fahrenheit/Celsius");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
					
					try {
					float fahrenheit = Float.parseFloat(Valor.getText());
					
					
					float celsius = (fahrenheit - 32) / 1.8f;
					
					
					Resultado.setText(celsius + " °C");
					
					}
					catch (Exception erro)
					{
						
					}
						
			
			}
		});
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setToolTipText("Limpar os campos de texto.");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == btnLimpar)
			{
			Valor.setText("");
			Resultado.setText("");
			}
			
			}
		});
		panel_1.add(btnLimpar);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Celsius/Fahrenheit");
		btnNewButton_1.setToolTipText("Converta Celsius para Fahrenheit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			
			
				
					
					
					try {
					float celsius = Float.parseFloat(Resultado.getText());
					
					
					float fahrenheit = (celsius *1.8f) + 32;
					
					
					Valor.setText(fahrenheit + " °C");
					
					}
					catch (Exception erro)
					{
						
					}
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(btnNewButton_1);
	}

}
