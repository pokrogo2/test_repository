package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import db.util.DBConnector;
import dto.BoardDTO;
import dto.ReplyDTO;

public class BoardDAO {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	private static BoardDAO dao = new BoardDAO();
	private BoardDAO() {
		con = DBConnector.getInstance().getConnection();
	}
	public static BoardDAO getInstance() {
		if (dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}
	public int insertBoard(BoardDTO dto) {
		int result = 0;
		try {
			sql = "INSERT INTO BOARD VALUES (BOARD_SEQ.NEXTVAL, ?, ?, 0, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContents());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
		return result;
	}
	public List<BoardDTO> selectList() {
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			
			sql = "select * from board order by no desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setContents(rs.getString(3));
				dto.setHit(rs.getInt(4));
				dto.setDate(rs.getDate(5));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConnector.getInstance().close(ps, null);
		}
		return list;
	}
	public void updateHit(int no) {
		try {
			sql = "UPDATE BOARD SET HIT = HIT + 1 WHERE no = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
	}
	public BoardDTO selectOneBoardByNo(int no) {
		BoardDTO dto =null;
		try {
			sql = "SELECT NO, TITLE,CONTENTS, HIT, WRITE_DATE  FROM BOARD WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setLong(1, no);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO();
				dto.setNo(rs.getInt(1));
				dto.setTitle(rs.getString(2));
				dto.setContents(rs.getString(3));
				dto.setHit(rs.getInt(4));
				dto.setDate(rs.getDate(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
		return dto;
	}
	public int deleteBoard(int no) {
		int result = 0;
		try {
			sql = "DELETE FROM BOARD WHERE NO = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
		return result;
	}
	public int insertReply(ReplyDTO dto) {
		int result = 0;
		try {
			sql = "INSERT INTO REPLY VALUES (REPLY_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getAuthor());
			ps.setString(2, dto.getContent());;
			ps.setLong(3, dto.getBoard_idx());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
		return result;
	}
	public List<ReplyDTO> selectListReply(int idx) {
		List<ReplyDTO> replyList = new ArrayList<ReplyDTO>();
		try {
			sql = "SELECT IDX, AUTHOR, CONTENT,BOARD_IDX, POSTDATE FROM REPLY WHERE BOARD_IDX = ? ORDER BY POSTDATE";
			ps = con.prepareStatement(sql);
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			while (rs.next()) {
				ReplyDTO dto = new ReplyDTO();
				dto.setIdx(rs.getInt(1));
				dto.setAuthor(rs.getString(2));
				dto.setContent(rs.getString(3));
				dto.setBoard_idx(rs.getInt(4));
				dto.setPostdate(rs.getDate(5));
				replyList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnector.getInstance().close(ps, null);
		}
		return replyList;
	}
	
}
