package com.aadi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aadi.dao.ReportDao;

@Service
public class ReportService {

//	@Autowired
//	@Qualifier("oracleDao")
	ReportDao dao;

	@Autowired
	public void setDao(ReportDao dao) {
		this.dao = dao;

	}
	
	

	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated....");

	}

}
