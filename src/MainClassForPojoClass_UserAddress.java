
public class MainClassForPojoClass_UserAddress {

	public static void main(String[] args) {
		PojoClassToStoreUserAddress user[]= new PojoClassToStoreUserAddress[4];
		user[0]=new PojoClassToStoreUserAddress(1);
		user[1]=new PojoClassToStoreUserAddress(2);
		user[2]=new PojoClassToStoreUserAddress(3);
		user[3]=new PojoClassToStoreUserAddress(4);
		
		user[0].setUserName("Akila");
		user[0].setAddress("Iowa USA");
		
		user[1].setUserName("Anna");
		user[1].setAddress(" Texass USA");
		user[2].setUserName("katie");
		user[2].setAddress("Minneapolis USA");
		user[3].setUserName("Sam");
		user[3].setAddress("NC USA");
		
		System.out.println("name " + user[0].getUserName()+" address : " +user[0].getUserName());
		System.out.println("name " + user[1].getUserName()+" address : " +user[1].getUserName());
		System.out.println("name " + user[2].getUserName()+" address : " +user[2].getUserName());
		System.out.println("name " + user[3].getUserName()+" address : " +user[3].getUserName());
	
System.out.println(user[0].toString());
System.out.println(user[1].toString());
System.out.println(user[2].toString());
System.out.println(user[3].toString());
	}

}
