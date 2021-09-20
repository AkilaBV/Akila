
public class PojoClassToStoreUserAddress {
	private String userName;
	private String address;
	private int user_id;
	
	public PojoClassToStoreUserAddress(int id) {
		user_id=id;
	}
	
	public String getUserName() {
		return userName;
	}
	
public void setUserName(String name) {
		userName=name;
	}


public String getAddress() {
	return address;
}

public void setAddress(String location) {
	address=location;
}

@Override
public String toString() {
	return "PojoClassToStoreUserAddress [userName=" + userName + ", address=" + address + ", user_id=" + user_id + "]";
}



}
