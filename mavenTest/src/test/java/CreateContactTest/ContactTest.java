package CreateContactTest;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
public void contact()
{
		System.out.println("Contact Created");
		new ContactTest();
	}
	
	@Test
	public void updateContact() {
		System.out.println("contact updated");
	}

}
