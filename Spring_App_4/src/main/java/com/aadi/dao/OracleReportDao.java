package com.aadi.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
@Primary
public class OracleReportDao implements ReportDao {

	@Override
	public void getData() {
		
		System.out.println("getting data from oracle DB...");
		
	}

}
