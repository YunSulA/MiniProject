package Academy.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Academy.model.Academy;
import Academy.util.DBResourceReturn;

public class Academy_DAO {
	private static Academy_DAO academyDao = new Academy_DAO();
	private Academy_DAO() { }
	public static Academy_DAO getInstance() {
		return academyDao;
	}
	
	
	public int addDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try {	// sno. name. birth. tel. address. major. tribute. datascore.javascore.javascriptscore.jspscore.attendance.

			pstmt=conn.prepareStatement("INSERT INTO ACADEMY VALUES (4, ' ', ' ', ?, ' ', ' ', 1,1,1,1,1, 1.5)");
			
			pstmt.setString(1, view.t1.getText());
			return pstmt.executeUpdate();			
	// 외부 테이블이 존재하는 항목 : attend 				
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeNameDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement("UPDATE ACADEMY SET NAME=? WHERE SNO=5");
			pstmt.setString(1, view.t1.getText());
			System.out.println(view.t1.getText());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int removeDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		
		try {
			pstmt=conn.prepareStatement("DELETE FROM ACADEMY WHERE SNO=?");
			pstmt.setString(1, view.t1.getText());
			System.out.println(view.t1.getText());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	
	
	
	
	
	
}