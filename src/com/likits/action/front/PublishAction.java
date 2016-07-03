package com.likits.action.front;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import com.likits.util.BaseAction;

import net.sf.json.JSONObject;

@Controller("publishAction")
@Scope("prototype")
public class PublishAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String content;
	private String image;
	
	public void addNewArticle() {
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println(req.getAttribute("content"));
		JSONObject jo = new JSONObject();
		jo.put("status", "success");
		
		ServletContext sc = ServletActionContext.getServletContext();
        String storePath = sc.getRealPath("assets");
        System.out.println(System.getProperty("user.dir"));    
		this.toResponse(jo.toString());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	
}