package Academy.service;

import java.sql.Connection;
import java.sql.SQLException;

import Academy.DAO.Academy_DAO;
import Academy.model.Academy;
import Academy.util.DBConnection;
import Academy.util.DBResourceReturn;

public class Service_remove {
	private static Service_remove serviceRemove = new Service_remove();
	private Service_remove() { }
	public static Service_remove getInstance() {
		return serviceRemove;
	}
	
	
	
	
	public static void remove(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.remove(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
