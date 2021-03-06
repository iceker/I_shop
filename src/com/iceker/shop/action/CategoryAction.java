package com.iceker.shop.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.iceker.shop.model.Category;
import com.iceker.shop.service.CategoryService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller("categoryAction")
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {  
    
    public String update() {  
        System.out.println("----update----");  
        categoryService.update(model);  
        return "index";  
    }  
      
    public String save() {  
        System.out.println("----save----");  
        System.out.println(model);  
        return "index";  
    }  
      
    public String query() {  
        request.put("categoryList", categoryService.query());   
        session.put("categoryList", categoryService.query());   
        application.put("categoryList", categoryService.query());   
        return "index";  
    }  
  
}  