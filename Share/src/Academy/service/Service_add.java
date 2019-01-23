package Academy.service;

import java.sql.Connection;
import java.sql.SQLException;

import Academy.DAO.Academy_DAO;
import Academy.model.Academy;
import Academy.util.DBConnection;
import Academy.util.DBResourceReturn;

public class Service_add {

	private static Service_add serviceAdd= new Service_add();
	private Service_add() { }
	public static Service_add getInstance() {
		return serviceAdd;
	}
	
	public static void insert(Academy academy) {
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
//	
//	public static void changeBirth(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeBirthDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeTel(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeTelDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeAddress(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeAddressDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
	
//	public static void changeMajor(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeMajorDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeItcourse(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeItcourseDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeTribute(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeTributeDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeDbscore(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeDbscoreDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeJavascore(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeJavascoreDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
	}
	
//	public static void changeJavascriptscore(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeJavascriptscoreDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeJspscore(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeJspscoreDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeAttend(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeAttendDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//	
//	public static void changeSurvey(Academy academy) {
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConn();
//			Academy_DAO academyDao = Academy_DAO.getInstance();
//			academyDao.changeSurveyDao(conn, academy);
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			DBResourceReturn.close(conn);
//		}
//	}
//}
