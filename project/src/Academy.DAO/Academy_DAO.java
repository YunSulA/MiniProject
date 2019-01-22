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
		try {
			pstmt = conn.prepareStatement("INSERT INTO ACADEMY VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, academy.getName());
			pstmt.setString(2, academy.getBirth());
			pstmt.setString(3, academy.getTel());
			pstmt.setString(4, academy.getAddress());
			pstmt.setString(5, academy.getMajor());
			pstmt.setString(6, academy.getItcourse());
			pstmt.setInt(7, academy.getTribute());
			pstmt.setInt(8, academy.getDatabaseScore());
			pstmt.setInt(9, academy.getJavaScore());
			pstmt.setInt(10, academy.getJavascriptScore());
			pstmt.setInt(11, academy.getJspScore());
			pstmt.setInt(12, academy.getAttendance());
			pstmt.setString(13, academy.getSurvey());
			return pstmt.executeUpdate();	
	// 이름 . 생년월일. 전화번호. 주소. 전공. 단과반유무. 조공횟수. 성적. 출석. 설문조사
	// name. birth. tel. address. major. itcourse. tribute. database. java. javascript. jsp, attendance. survey				
	// 외부 테이블이 존재하는 항목 : attend 				
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int remove(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("DELETE FROM ACADEMY WHERE TEL =?");
			pstmt.setString(1, /* 지우고싶은 학생의 전화번호를 받아서 이부분에 입력. */  );
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	// 일단 다른 방법이 생각나지 않아서 항목별로 전부다 change메소드를 따로 작성하기로 했다.
	/* 	private String name;
		private String birth;
		private String tel;
		private String address;
		private String major;
		private String itcourse;
		private int tribute;	// String으로 변경할 수도 ... 품목을 적는다면 0ㅁ 0
		private int databaseScore;
		private int JavaScore;
		private int JavascriptScore;
		private int JspScore;
		private int attendance;
		private String survey;		 */
	
	// UPDATE 테이블명 SET name = '설아';
	public int changeNameDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET NAME=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 이름을 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeBirthDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET BIRTH=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 생일을 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeTelDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TEL=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 전화번호를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeAddressDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ADDRESS=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 주소를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeMajorDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET MAJOR=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 전공을 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeItcourseDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ITCOURSE=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 전공을 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeTributeDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET TRIBUTE=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 조공횟수를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeDbscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET DATABASE=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 데이터베이스 점수를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJavascoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVA=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 자바 점수를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJavascriptscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JAVASCRIPT=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 자바스크립트 점수를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeJspscoreDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET JSP=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 JSP 점수를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeAttendDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET ATTENDANCE=? WHERE TEL =?)");
			pstmt.setInt(1, /* 바꿀 출결정보를 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}
	
	public int changeSurveyDao(Connection conn, Academy academy) throws SQLException {
		PreparedStatement pstmt = null;
		try { 
			pstmt = conn.prepareStatement("UPDATE ACADEMY SET SURVEY=? WHERE TEL =?)");
			pstmt.setString(1, /* 바꿀 설문결과내용을 입력받아 이곳에 작성 */ );
			pstmt.setString(2, academy.getTel());
			return pstmt.executeUpdate();
		} finally {
			DBResourceReturn.close(pstmt);
		}
	}

	
	
}
