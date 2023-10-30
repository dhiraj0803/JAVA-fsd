package coms.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import coms.service.UserAuthenticationService;

public class UserAuthenticationServiceTest {
	@Test
	@DisplayName("Check the user's details")
	void testCheckUser() {
	//fail("Not yet implemented");
		UserAuthenticationService es = new UserAuthenticationService();
	String result = es.checkUser("y1dhiraj@gmail.com", "GalaCtus@123");
	assertEquals("success", result);
	String result1 = es.checkUser("vigyanyog@mail.com", "ProToType@99877");
	assertEquals("failure", result1);
	}
}
