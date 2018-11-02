package com.graingreat.dao;

import org.apache.ibatis.session.SqlSessionFactory;

public class MybatisPointDao implements PointDao {
	
	private static final String NAMESPACE = "com.graingreat.point.";
	
	private SqlSessionFactory sqlSessionFactory;

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
}










