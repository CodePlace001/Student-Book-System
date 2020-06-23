package com.hq.bean;

import java.util.Date;

public class Books {
	private String book_id;
	private String book_name;
	private String book_type;
	private String author;
	private String press;
	private Date publish_date;
	private double price;
	private Date register_time;
	private boolean is_borrow;

	public Books() {

	}

	public Books(String book_id, String book_name, String book_type, String author, String press, Date publish_date,
			double price, Date register_time, boolean is_borrow) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_type = book_type;
		this.author = author;
		this.press = press;
		this.publish_date = publish_date;
		this.price = price;
		this.register_time = register_time;
		this.is_borrow = is_borrow;
	}

	public Books(String bookId, String bookName, int bookType, String author2, String press2, Date publishDate,
			double price2, Date register_time2, boolean isBorrow) {
		// TODO Auto-generated constructor stub
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_type() {
		return book_type;
	}

	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getRegister_time() {
		return register_time;
	}

	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}

	public boolean isIs_borrow() {
		return is_borrow;
	}

	public void setIs_borrow(boolean is_borrow) {
		this.is_borrow = is_borrow;
	}

	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", book_name=" + book_name + ", book_type=" + book_type + ", author="
				+ author + ", press=" + press + ", publish_date=" + publish_date + ", price=" + price
				+ ", register_time=" + register_time + ", is_borrow=" + is_borrow + "]";
	}

}
