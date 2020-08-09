package connection.java.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import connection.java.db.DB;
import connection.java.model.Form;
import connection.java.model.LoginForm;
import connection.java.view.CForm;
import connection.java.view.LForm;

public class ServiceImpl implements Service {

	 Connection con=null;
	 public ServiceImpl() {
		 con=DB.getcon();
	 }
	@Override
	public boolean Insert(Form f) {
		String sql="INSERT INTO server(First_Name,Middle_Name,Last_Name,Temporary_Address,Permanent_Address,Email,Dateofbirth,Phone,Username,Password,Gender,Status)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,f.getFname() );
			ps.setString(2, f.getMname());
			ps.setString(3, f.getLname());
			ps.setString(4, f.getT_address());
			ps.setString(5,f.getP_address());
			ps.setString(6, f.getEmail());
			ps.setDate(7, f.getDob());
			ps.setString(8, f.getPhone());
			ps.setString(9, f.getUsername());
			ps.setString(10, f.getPassword());
			ps.setString(11, f.getGender());
			ps.setString(12, f.getStatus());
			ps.execute();
			return true;
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public boolean update(Form f) {
	  String sql="UPDATE server SET First_Name=?,Middle_Name=?,Last_Name=?,Temporary_Address=?,Permanent_Address=?,Email=?,Dateofbirth=?,Phone=?,Username=?,Password=?,Gender=?,Status=? WHERE Id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, f.getFname());
			ps.setString(2, f.getMname());
			ps.setString(3, f.getLname());
			ps.setString(4, f.getT_address());
			ps.setString(5, f.getP_address());
			ps.setString(6, f.getEmail());
			ps.setDate(7, f.getDob());
			ps.setString(8, f.getPhone());
			ps.setString(9, f.getUsername());
			ps.setString(10, f.getPassword());
			ps.setString(11, f.getGender());
			ps.setString(12, f.getStatus());
			ps.setInt(13, f.getId());
			ps.execute();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	@Override
	public List<Form> getAll() {
		List<Form> e=new ArrayList<>();
		String sql="SELECT * FROM server";
		try {
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery(sql);
		while(rs.next()) {
		Form f=new Form();
		f.setFname(rs.getString("First_Name"));
		f.setLname(rs.getString("Last_Name"));
		f.setPhone(rs.getString("Phone"));
		f.setEmail(rs.getString("Email"));
		f.setDob(rs.getDate("Dateofbirth"));
		f.setUsername(rs.getString("Username"));
		f.setPassword(rs.getString("Password"));
		f.setId(rs.getInt("id"));
		e.add(f);
		}
		}catch(Exception es) {
			es.printStackTrace();
			
			
		}
		return e;
	}
	@Override
	public Form getById(int id) {
		String sql="select * from server where id ="+id;
		Form f=new Form();
		try {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
		f.setId(rs.getInt("Id"));
		f.setFname(rs.getString("First_Name"));
		f.setMname(rs.getString("Middle_Name"));
		f.setLname(rs.getString("Last_Name"));	
		f.setDob(rs.getDate("Dateofbirth"));
		f.setUsername(rs.getString("Username"));
		f.setPassword(rs.getString("Password"));
		f.setPhone(rs.getString("phone"));
		f.setP_address(rs.getString("Permanent_Address"));
		f.setT_address(rs.getString("Temporary_Address"));
		f.setEmail(rs.getString("Email"));
		f.setStatus(rs.getString("Status"));
		f.setGender(rs.getString("Gender"));
		}
		}catch(Exception e) {
			
		}
		return f;
	}
	@Override
	public boolean login(LoginForm lf) {
		String sql="select * from server";
		try {
	  Statement st=con.createStatement();
	  ResultSet rs=st.executeQuery(sql);
	  while(rs.next())
	      if(lf.getUsername().equals(rs.getString("username"))&&lf.getPassword().equals(rs.getString("password"))) {
	    return true;
	      }
		}catch(Exception e) {
			
		}
		return false;
	}
	
	
	
}
