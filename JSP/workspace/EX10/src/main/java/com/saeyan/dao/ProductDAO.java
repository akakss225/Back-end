package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	// 생성자 형식이 private 라면 싱글톤 패턴이라고 생각하면 됨.
	private ProductDAO() {}
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	// c Read u d
	public List<ProductVO> selectAllProducts(){
		// 최근 등록한 상품 먼저 출력
		String sql = "select * from product order by code desc";
		List<ProductVO> list = new ArrayList<ProductVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		// select 로 테이블을 불러오는 경우 ResultSet을 사용함.
		ResultSet rs = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO pVo = new ProductVO();
				pVo.setCode(rs.getInt("code"));
				pVo.setName(rs.getString("name"));
				pVo.setPrice(rs.getInt("price"));
				pVo.setPictureUrl(rs.getString("pictureUrl"));
				pVo.setDescription(rs.getString("description"));
				list.add(pVo);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return list;
	}
	
}
