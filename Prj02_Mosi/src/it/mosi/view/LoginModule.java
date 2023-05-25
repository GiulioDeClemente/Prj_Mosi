package it.mosi.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LoginModule extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JButton loginButton;

	public LoginModule() {

		// Imposta le proprietà della finestra di accesso
		setTitle("Login");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// Crea i componenti dell'interfaccia utente
		JLabel usernameLabel = new JLabel("Username:");
		JLabel passwordLabel = new JLabel("Password:");
		JLabel emailLabel = new JLabel("Email");

		usernameField = new JTextField(20);
		passwordField = new JPasswordField(20);
		final JTextField emailField = new JTextField(4);

		loginButton = new JButton("Login");

		// Aggiungi i componenti alla finestra
		JPanel panel = new JPanel(new GridLayout(4, 2));
		panel.add(usernameLabel);
		panel.add(usernameField);
		panel.add(passwordLabel);
		panel.add(passwordField);
		panel.add(emailLabel);
		panel.add(emailField);

		panel.add(new JLabel()); // Spazio vuoto per allineare il pulsante
		panel.add(loginButton);

		// Aggiungi un controllo al pulsante di accesso
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
				String email = new String(emailField.getText());

				// Qui puoi chiamare la logica di autenticazione per verificare le credenziali
				boolean authenticated = authenticateUser(username, password, email);

				if (authenticated) {
					// L'autenticazione ha successo, puoi eseguire le azioni desiderate
					JOptionPane.showMessageDialog(null, "Accesso effettuato con successo!");
				} else if (!email.equals("18/08/1994")) {
					JOptionPane.showMessageDialog(null, "Email errata!");
				} else {
					// L'autenticazione fallisce, mostra un messaggio di errore
					JOptionPane.showMessageDialog(null, "Nome utente o password non validi");
				}
			}
		});

		// Aggiungi il pannello alla finestra
		add(panel);

		// Rendi la finestra visibile
		setVisible(true);
	}

	private boolean authenticateUser(String username, String password, String email) {

		return username.equals("Mosi") && password.equals("5852") && email.equals("frollofc@gmail.com");

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LoginModule();
			}
		});
	}
}
