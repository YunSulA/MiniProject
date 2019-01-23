package Academy.service;

import java.sql.Connection;
import java.sql.SQLException;

import Academy.DAO.Academy_DAO;
import Academy.model.Academy;
import Academy.util.DBConnection;
import Academy.util.DBResourceReturn;

public class Service_change {

	private static Service_change servicechange = new Service_change();
	private Service_change() { }
	public static Service_change getInstance() {
		return servicechange;
	}

	public static void nameChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeNameDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}

}
