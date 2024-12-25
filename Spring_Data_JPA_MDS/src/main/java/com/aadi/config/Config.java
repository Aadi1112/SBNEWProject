package com.aadi.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

	@ConfigurationProperties("spring.datasource.mysql")
	@Bean
	public DataSourceProperties dataSourceProperties() {

		return new DataSourceProperties();
	}

	
	@Bean
	public DataSource dataSource() {

//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//		dataSource.setUrl(dataSourceProperties().getUrl());
//		dataSource.setUsername(dataSourceProperties().getUsername());
//		dataSource.setPassword(dataSourceProperties().getPassword());
//
//		dataSource.setDriverClassName(dataSourceProperties().getDriverClassName());

		return dataSourceProperties().initializeDataSourceBuilder().build();

	}
}
