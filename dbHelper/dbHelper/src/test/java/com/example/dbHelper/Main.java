package com.example.dbHelper;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Connection connection = null;
		DbHelper dbHelper = new DbHelper();
		
		try {
			connection = dbHelper.getConnection();
			System.out.println("Bağlantı oluştu!");
		}catch(SQLException sqlException) {
			dbHelper.showErrorMessage(sqlException);
		}finally {
			try {
				connection.close(); //eger dosya bulunamadiysa kapanmaz
				//o yuzden try- catch blogu icine alinir ya da throws SQLException
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
