package com.iceker.shop.sevice.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iceker.shop.model.Category;
import com.iceker.shop.service.CategoryService;
import com.iceker.shop.service.impl.CategoryServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:beans.xml")  
public class SSHTest {  
      
    @Resource  
    private Date date;  
      
    @Resource  
    private CategoryService categoryService;  
      
    @Test //����Spring IOC�Ŀ�������  
    public void springIoc() {  
        System.out.println(date);  
    }  
      
    @Test  //����Hibernate�Ŀ�����������Ϊû�����ϣ�����ֱ��new  
    public void hihernate() {  
       // CategoryService categoryService = new CategoryServiceImpl();  
        Category category = new Category("��ʿ��1��", true);  
        categoryService.save(category);  
    }  
      
    @Test //����Hibernate��Spring���Ϻ�  
    public void hibernateAndSpring() {  
        categoryService.update(new Category(1, "����Ůʽ", true)); //categoryServiceͨ��Spring������ע�������  
    }  
}  