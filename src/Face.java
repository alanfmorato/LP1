import java.awt.EventQueue;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class Face extends JFrame {

	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtHora;
	private JTextField txtBatimento;
	private JTextField txtTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face frame = new Face();
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
	public Face() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(88, 88, 88));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtData = new JTextField();
		txtData.setBounds(130, 79, 86, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		txtHora = new JTextField();
		txtHora.setColumns(10);
		txtHora.setBounds(130, 110, 86, 20);
		contentPane.add(txtHora);
		
		txtBatimento = new JTextField();
		txtBatimento.setColumns(10);
		txtBatimento.setBounds(130, 141, 86, 20);
		contentPane.add(txtBatimento);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setColumns(10);
		txtTemperatura.setBounds(130, 172, 86, 20);
		contentPane.add(txtTemperatura);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CodFace c1 = new CodFace();
				c1.settxtData(txtData.getText());
				c1.settxtHora(txtHora.getText());
				c1.settxtBatimento(txtBatimento.getText());
				c1.settxtTemperatura(txtTemperatura.getText());
				try {
				PrintWriter pw = new PrintWriter(new File("C:\\Users\\DNC-PC-138\\Desktop\\Java\\teste.csv"));
				   StringBuilder sb = new StringBuilder();
				   
				   sb.append(txtData.getText());
				   sb.append(";");
				   sb.append(txtHora.getText());
				   sb.append(";");
				   sb.append(txtBatimento.getText());
				   sb.append(";");
				   sb.append(txtTemperatura.getText());
				   sb.append(";");
				   pw.write(sb.toString());
				   pw.close();
				            
				        } catch (Exception e1){
				            System.out.println("Error !");
				        }
				JOptionPane.showMessageDialog(null, "Informações cadastradas com sucesso");
				System.exit(0);

			}
		});
		Cadastrar.setBounds(294, 109, 110, 23);
		contentPane.add(Cadastrar);
		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 79, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setForeground(new Color(192, 192, 192));
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHora.setBounds(10, 113, 46, 14);
		contentPane.add(lblHora);
		
		JLabel lblBatimento = new JLabel("Batimento");
		lblBatimento.setForeground(new Color(192, 192, 192));
		lblBatimento.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBatimento.setBounds(10, 144, 110, 14);
		contentPane.add(lblBatimento);
		
		JLabel lblTemperatura = new JLabel("Temperatura");
		lblTemperatura.setForeground(new Color(192, 192, 192));
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTemperatura.setBounds(10, 175, 124, 14);
		contentPane.add(lblTemperatura);
		
		JLabel lblSmartwatch = new JLabel("SMARTWATCH");
		lblSmartwatch.setForeground(Color.LIGHT_GRAY);
		lblSmartwatch.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSmartwatch.setBounds(167, 11, 152, 23);
		contentPane.add(lblSmartwatch);
	}
}
