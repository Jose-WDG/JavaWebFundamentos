package br.com.treinaweb.main;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args){
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "81776279");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
