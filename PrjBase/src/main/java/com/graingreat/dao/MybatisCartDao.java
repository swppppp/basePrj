package com.graingreat.dao;

import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisCartDao implements CartDao {
	
	private static final String NAMESPACE = "com.graingreat.cart.";
	
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}










