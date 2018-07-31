package redescomp.uacm.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnvioMail extends JFrame {

	private JPanel contentPane;
	private JTextField textPuerto;
	private JTextField textIP;
	private JTextField textRespuesta;
	private JTextField textPara;
	private JTextField textDe;
	private JTextField textAsunto;
	private JTextField textMensaje;
	private JTextField textSalida;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnvioMail frame = new EnvioMail();
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
	public EnvioMail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textPuerto = new JTextField();
		textPuerto.setColumns(10);
		
		JLabel lblPuerto = new JLabel("Puerto");
		
		JLabel lblIP = new JLabel("IP");
		
		textIP = new JTextField();
		textIP.setColumns(10);
		
		textRespuesta = new JTextField();
		textRespuesta.setColumns(10);
		
		JButton btnEntrarAServidor = new JButton("Entrar a servidor");
		btnEntrarAServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		textPara = new JTextField();
		textPara.setColumns(10);
		
		JLabel lblFrom = new JLabel("From:");
		
		JLabel lblTo = new JLabel("To:");
		
		textDe = new JTextField();
		textDe.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject:");
		
		JLabel lblMensaje = new JLabel("Message");
		
		textAsunto = new JTextField();
		textAsunto.setColumns(10);
		
		textMensaje = new JTextField();
		textMensaje.setColumns(10);
		
		textSalida = new JTextField();
		textSalida.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Salida del servidor");
		
		JButton btnEnviar = new JButton("Enviar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(11)
									.addComponent(lblPuerto))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblFrom))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblTo)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textPuerto, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(41)
									.addComponent(lblIP)
									.addGap(26)
									.addComponent(textIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(32)
									.addComponent(btnEntrarAServidor)
									.addGap(18)
									.addComponent(textRespuesta, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textPara, Alignment.LEADING)
									.addComponent(textDe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblSubject)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textAsunto, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textMensaje, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMensaje))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(textSalida, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnEnviar)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textPuerto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPuerto)
						.addComponent(lblIP)
						.addComponent(textIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textRespuesta, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEntrarAServidor))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textPara, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFrom))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTo)
						.addComponent(textDe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSubject)
						.addComponent(textAsunto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMensaje)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textSalida)
						.addComponent(textMensaje, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnEnviar)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
