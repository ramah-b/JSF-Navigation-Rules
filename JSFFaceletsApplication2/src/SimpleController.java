import javax.faces.bean.ManagedBean;
import java.lang.Object;

@ManagedBean 
public class SimpleController {
	private String message = "";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String doNavigation() {
		if (message.trim().length() < 2) {
			return ("too-short");
		} else {
			String[] results = { "page1", "page2", "page3" };
			
			return ("page2");
		}
	}

}
