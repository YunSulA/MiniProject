package service;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.Academy_DAO;
import model.Academy;
import util.DBConnection;
import util.DBResourceReturn;

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
	
	public static void birthChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeBirthDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void telChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeTelDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void addressChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeAddressDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void majorChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeMajorDao(conn, academy);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBResourceReturn.close(conn);
		}
	}
	public static void tributeChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeTributeDao(conn, academy);
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void itcourseChange(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.chageItcourseDao(conn, academy);
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			DBResourceReturn.close(conn);
		}
			}

}
