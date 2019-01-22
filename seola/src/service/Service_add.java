package service;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.Academy_DAO;
import model.Academy;
import util.DBConnection;
import util.DBResourceReturn;

public class Service_add {
	private static Service_add serviceAdd = new Service_add();
	private Service_add() { }
	public static Service_add getInstance() {
		return serviceAdd;
	}
	
	public static void add(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.addDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}

}
