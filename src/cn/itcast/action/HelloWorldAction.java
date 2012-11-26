package cn.itcast.action;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class HelloWorldAction {// id=23&name=xxxx

	/*public String execute() {
		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("app", "application");
		ctx.getSession().put("ses", "session");
		ctx.put("req", "request");
		ctx.put("names", Arrays.asList("x","1","wow"));
		return "success";
	}

	public String rsa() throws Exception{
		HttpServletRequest request = ServletActionContext.getRequest();
		ServletContext servletContext = ServletActionContext.getServletContext();
		request.setAttribute("req", "request范围");
		request.getSession().setAttribute("ses", "session范围");
		servletContext.setAttribute("app", "application范围");
		return "success";
	}*/
	
	/*private File image;
	private String imageFileName;
	
	
	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
*/
	
	/*public String execute() throws Exception{
		String realPath = ServletActionContext.getServletContext().getRealPath("images");
		System.out.println(realPath);
		File savefile = new File(new File(realPath),imageFileName);
		if(!savefile.getParentFile().exists()){
			savefile.getParentFile().mkdirs();
			FileUtils.copyFile(image, savefile);
			
			ActionContext.getContext().put("message","upload success");
		}
		return "success";
	}*/
	
	private String message;
	
	
	public String getMessage() {
	
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String addUI() {
		this.message = "addUI";
		return "success";
	}
	
	public String execute(){
		this.message = "execute";
		return "success";
		
	}
}
