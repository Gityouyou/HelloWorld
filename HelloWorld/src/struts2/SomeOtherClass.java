package struts2;

import com.opensymphony.xwork2.ActionSupport;

//定义多个action
class Myaction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1043245115975885190L;
	public static String GOOD = SUCCESS;
	public static String BAD = ERROR;
}

public class SomeOtherClass extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3856900485336337857L;

	public String execute() {
		return Myaction.BAD;
	}
}

