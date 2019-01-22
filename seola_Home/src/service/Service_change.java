package service;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.Academy_DAO;
import model.Academy;
import util.DBConnection;
import util.DBResourceReturn;

public class Service_change {
	private static Service_change serviceChange= new Service_change();
	private Service_change() { }
	public static Service_change getInstance() {
		return serviceChange;
	}
	
	public static void changeName(Academy academy) {
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
	
	public static void changeBirth(Academy academy) {
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
	
	public static void changeTel(Academy academy) {
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
	
	public static void changeAddress(Academy academy) {
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
	
	public static void changeMajor(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeMajorDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeItcourse(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeItcourseDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeTribute(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeTributeDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeDbscore(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeDbscoreDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeJavascore(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeJavascoreDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeJavascriptscore(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeJavascriptscoreDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeJspscore(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeJspscoreDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeAttend(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeAttendDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void changeSurvey(Academy academy) {
		Connection conn = null;
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.changeSurveyDao(conn, academy);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}

}
