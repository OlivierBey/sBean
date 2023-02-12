package Configuration;

import org.springframework.stereotype.Component;

@Component
public class sComponent {

	private static String sName;

	public static String getsName() {
		return sName;
	}

	@SuppressWarnings("static-access")
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
}
