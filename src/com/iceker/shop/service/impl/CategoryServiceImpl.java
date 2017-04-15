package com.iceker.shop.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iceker.shop.model.Category;
import com.iceker.shop.service.CategoryService;
import com.iceker.shop.utils.HibernateSessionFactory;

public class CategoryServiceImpl implements CategoryService {

	@Override
	public void save(Category category) {
		//ͨ���ո����ɵ�sessionFactory��ȡsession  
		getSession().save(category);       

	}
	
	/*Spring��Hibernate������*/  
    private SessionFactory sessionFactory; //����һ��sessionFactory  
      
    //����Ҫʹ��sessoinFactory��ʱ��Spring�ὫsessionFactoryע�����  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }    
    protected Session getSession() {  
        //�ӵ�ǰ�̻߳�ȡsession�����û���򴴽�һ���µ�session  
        return sessionFactory.getCurrentSession();  
    }  
      
    @Override //Spring��Hibernate���Ϻ�����  
    public void update(Category category) {  
        getSession().update(category);      
    }  
}
