package com.likits.action.front;

import java.io.File;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.likits.util.BaseAction;


@Controller("uploadAction")
@Scope("prototype")
public class UploadAction extends BaseAction{
	
	private File image;//对应的就是表单中文件上传的那个输入域的名称，Struts2框架会封装成File类型的
    private String imageFileName;//   上传输入域FileName  文件名
    private String imageContentType;// 上传文件的MIME类型
	
    public void uploadImage() {
    	
    }
}
