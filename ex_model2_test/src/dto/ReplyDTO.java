package dto;

import java.sql.Date;

public class ReplyDTO {
	private int idx;
	private String author;
	private String content;
	private int board_idx;
	private Date postdate;
	
	public ReplyDTO() {}

	public ReplyDTO(int idx, String author, String content, int board_idx, Date postdate) {
		super();
		this.idx = idx;
		this.author = author;
		this.content = content;
		this.board_idx = board_idx;
		this.postdate = postdate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getBoard_idx() {
		return board_idx;
	}

	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	public Date getPostdate() {
		return postdate;
	}

	public void setPostdate(Date postdate) {
		this.postdate = postdate;
	}
	
}
