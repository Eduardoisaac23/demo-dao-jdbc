package model.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import db.DB;
import db.DbException;
import mode.entities.Department;
import model.dao.DepartmentDao;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn;

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
		try {
			st = (PreparedStatement) conn.prepareStatement(
					"INSERT INTO department " 
					+ "(Name) " 
					+ "VALUES " 
					+ "(?)", 
					Statement.RETURN_GENERATED_KEYS);
			
			
			st.setString(1, obj.getName());

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();

				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				
			} else {
				throw new DbException("Nenhuma linha foi alterada! ");
			}

		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);

		}

	}

	@Override
	public void update(Department obj) {
		

	}

	@Override
	public void deletById(Integer id) {
PreparedStatement st = null;
		
		try {
			st = (PreparedStatement) conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			st.setInt(1, id);
			st.executeUpdate();
		}catch(SQLException e){
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(st);
		}	
	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = (PreparedStatement) conn.prepareStatement(
					"SELECT * FROM department WHERE Id = ?");
			st.setInt(1, id);				
			rs = st.executeQuery();	
			if(rs.next()) {
				Department obj = new Department();
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("Name"));
				return obj;
			}
				return null;
		}catch(SQLException e){
			throw new DbException(e.getMessage());
		}finally{
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
