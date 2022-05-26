public class Users {
	protected int id;
	protected String phoneno;
	protected String name;
	protected String address;
	
	public Users() {
	}
	
	public Users(String phoneno, String name, String address) {
		super();
		this.phoneno = phoneno;
		this.name = name;
		this.address = address;
	}

	public Users(int id, String phoneno, String name, String address) {
		super();
		this.id = id;
		this.phoneno = phoneno;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
