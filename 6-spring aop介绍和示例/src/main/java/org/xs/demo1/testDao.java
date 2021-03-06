package org.xs.demo1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class testDao {

	@Autowired
	private SessionFactory sessionFactory;  
	
	@SuppressWarnings("unchecked")
	public List<testInfo> getList() {
		
		String hql = "from testInfo";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	    
	    return query.list();
	}
}
