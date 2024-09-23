package test;

public class User {
	
	private Cart cart;
	private int code;
	private String name;
	private String id;
	private String password;
	
	public User () {}
	
	public User(int code, String id, String password) {
		this.code = code;
		this.id = id;
		this.password = password;
	}
	
	public Cart getCart() {
		return this.cart;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}

}
