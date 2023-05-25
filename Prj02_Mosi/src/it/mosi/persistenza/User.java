package it.mosi.persistenza;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "username") // Specifica il nome della tabella nel database
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String users;
	private String password;
	private int id_Users;

	public User() {
		// Costruttore vuoto richiesto da Hibernate
	}

	public User(String users, String password) {
		this.users = users;
		this.password = password;
	}
	
	

	// Metodi getter e setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
