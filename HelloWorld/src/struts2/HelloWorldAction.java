package struts2;

import com.opensymphony.xwork2.ActionSupport;


public class HelloWorldAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String name;
	
//	Struts2中actions的唯一要求是必须有一个无参数方法返回String或Result对象,默认是使用execute()方法
//	public String execute() throws Exception {
//		return "success";
//	}
	
//	继承ActionSupport之后重写execute()
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if ("lxd".equals(name)) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
