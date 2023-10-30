package coms.service;

public class UserAuthenticationService {
	public String checkUser(String emailid, String password) {
		if(emailid.equals("y1dhiraj@gmail.com") && password.equals("GalaCtus@123")) {
		return "success";
		}else {
		return "failure";
		}
		}


}
