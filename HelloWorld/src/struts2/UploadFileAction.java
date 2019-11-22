package struts2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport{
	
	//以下三个属性，fileUpload拦截器自动传入
	private File file;
	private String fileContentType;
	private String fileFileName;
	private String destPath;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		destPath = "/Library/apache-tomcat-8.5.47/work/";
		
		try{
	     	 System.out.println("文件: " + file);
	     	 System.out.println("文件名: " + fileFileName);
	     	    	 
	     	 File destFile  = new File(destPath, fileFileName);
	    	 FileUtils.copyFile(file, destFile);
	  
	      }catch(IOException e){
	         e.printStackTrace();
	         return ERROR;
	      }

	    return SUCCESS;
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		System.out.println("上传文件为 "+file);
		this.file = file;
	}


	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	
	
}
