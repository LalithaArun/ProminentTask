package com.prominent.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.prominent.util.SessionUtil;



public abstract class AbstractGenericDao<T> {
	
	SessionUtil sessionUtil = new SessionUtil();
	
	public void saveData(T entity) throws Exception {
		Session session = null ;
		Transaction tx = null;
		try {
			session = sessionUtil.getSession();
			session.save(entity);
			tx=session.getTransaction();
			
			tx.commit();
			session.close();
		}
		catch(Exception ex) {
//			if(tx!=null)
//				tx.rollback();
//			}
			//ex.printStackTrace();
			throw ex;
		}
		
	}


}
