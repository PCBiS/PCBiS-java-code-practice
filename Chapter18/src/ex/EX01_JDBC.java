package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EX01_JDBC {
	public static void main(String[] args) {
		String url, user, pw;
		// JDBC 사용 객체들 : java.sql.Connection, Statement, PreparedStatement, ResultSet 
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		// url = "jdbc:oracle:thin:@address:port:dbname";
		url = "jdbc:oracle:thin:@ksla.iptime.org:31521:orcl";
		user = "scott";
		pw = "SeconD*1203";
		
		/* 
		 * 1. DB Driver 로딩.
		 *	Class.forName(Driver 클래스 전체네임)
		 *	Oracle : oracle.jdbc.driver.OracleDriver
		 */
		
		try {
			// 2. DB 연결 확립.
			// Connection Object 생성.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			
			// 3. SQL 연결.
			// Statement or PrepareStatement
			String sql = "SELECT * FROM dept WHERE deptno = ?";
			pStmt = conn.prepareStatement(sql);
			// 변수 데이터 설정
			pStmt.setInt(1, 10);
			pStmt.executeQuery();
			
			System.out.println("부서 리스트");
			System.out.println("=================================================");
			
			// ResultSet -> 결과 참조.
			while (rs.next()) {
				System.out.println(rs.getInt("deptno" + "\t"));
				System.out.println(rs.getInt("dname" + "\t"));
				System.out.println(rs.getInt("loc" + "\t"));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 4. DB 연결 종료.
		catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pStmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}	
}




