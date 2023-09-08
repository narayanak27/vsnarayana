package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import front.Connectivity;

public class RegistrationDaoImpl implements RegistrationDao{

	@Override
	public int insertRecords() {
		try {
		Connection con =Connectivity.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1,"narayana");
		ps.setInt(2,21);
		ps.setString(3,"kantelakshminarayana21@gmail.com");
		ps.setString(4,"madhu");
		int i=ps.executeUpdate();
		return i;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
	
}
