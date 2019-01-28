package service;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.Academy_DAO;
import model.Academy;
import util.DBConnection;
import util.DBResourceReturn;

public class Service_select {
	private static Service_select serviceSelect = new Service_select();
	private Service_select() { }
	public static Service_select getInstance() {
		return serviceSelect;
	}
	
	public static void select(Academy academy) {
		Connection conn = null;
		
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.selectDao(conn,academy);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void selectsno(Academy academy) {
		Connection conn = null;
		
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.selectSno(conn,academy);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
	
	public static void telselect(Academy academy) {
		Connection conn = null;
		
		try {
			conn = DBConnection.getConn();
			Academy_DAO academyDao = Academy_DAO.getInstance();
			academyDao.Teloverlap(conn,academy);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DBResourceReturn.close(conn);
		}
	}
}
