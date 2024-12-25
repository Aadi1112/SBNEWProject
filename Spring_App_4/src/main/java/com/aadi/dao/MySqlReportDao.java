package com.aadi.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MySqlReportDao implements ReportDao  {

	@Override
	public void getData() {
		
		System.out.println("getting data from Mysql DB...");
		
	}

}
