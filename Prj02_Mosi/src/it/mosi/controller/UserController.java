package it.mosi.controller;

import it.mosi.model.UserModel;
import it.mosi.view.UserView;
import it.mosi.persistenza.User;

public class UserController {
	
	private UserModel model;
	private UserView view;

	public UserController(User model, UserView view) {
	
		this.model = new UserModel();
		this.model.setName(model.getUsers());
		this.view = view;
	}

	public void setUserName(String name) {
		model.setName(name);
	}

	public void updateUserView() {
		String userName = model.getName();
		view.Visualizza(userName);
	}
	
}
