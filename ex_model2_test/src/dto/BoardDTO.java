package dto;

import java.sql.Date;

public class BoardDTO {

	private int no;
	private int hit;
	private String contents;
	private String title;
	private Date date;
	
	public BoardDTO() {}

	public BoardDTO(int no, String contents, String title, Date date ,int hit) {
		super();
		this.no = no;
		this.hit = hit;
		this.contents = contents;
		this.title = title;
		this.date = date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
