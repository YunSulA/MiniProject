package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Academy;
import util.DBResourceReturn;
import view.UiPanel01_1;

public class Academy_DAO {

	private static Academy_DAO academyDao = new Academy_DAO();
	private Academy_DAO() { }
	public static Academy_DAO getInstance() {
		return academyDao;
	}
	
	
	public int addDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try {	// sno. name. birth. tel. address. major. tribute. datascore.javascore.javascriptscore.jspscore.attendance.

			pstmt=conn.prepareStatement("INSERT INTO ACADEMY VALUES (2, ' ', ' ', '1', ' ', ' ', 1,1,1,1,1, 1.5)");
			return pstmt.executeUpdate();			
	// 외부 테이블이 존재하는 항목 : attend 				
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeNameDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement("UPDATE ACADEMY SET NAME=? WHERE SNO=1");
			pstmt.setString(1, UiPanel01_1.nametext.getText());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
}
