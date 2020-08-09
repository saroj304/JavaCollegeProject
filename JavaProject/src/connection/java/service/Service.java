package connection.java.service;

import java.util.List;

import connection.java.model.Form;
import connection.java.model.LoginForm;
import connection.java.view.CForm;
import connection.java.view.LForm;

public interface Service {
  
	public boolean Insert(Form f);
	public boolean update(Form f);
	public boolean login(LoginForm lf);
	Form getById(int id);
	List<Form> getAll();
}
