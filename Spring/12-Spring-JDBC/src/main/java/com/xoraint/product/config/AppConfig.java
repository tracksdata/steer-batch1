package com.xoraint.product.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScans({@ComponentScan("com.xoraint.product.dao")})
@PropertySource(value = "application.properties")
@EnableTransactionManagement
public class AppConfig {
	
	@Value("${name}") // SpringEL
	private String personName;
	
	@Autowired
	private Environment env;
	
	private Properties props;
	
	// Step 1: load database connection :: DataSource
	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db-driver"));
		dataSource.setUrl(env.getProperty("db-url"));
		dataSource.setUsername(env.getProperty("db-user"));
		dataSource.setPassword(env.getProperty("db-password"));
		//dataSource.getConnection().setAutoCommit(false);
		return dataSource;
	}
	
	
	// transaction management config
	@Bean(name = "platformTransactionManager")
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(mysqlDataSource());
		//System.out.println(">>>>>> Transaction:: " + transactionManager.getDataSource());
		return transactionManager;
	}
	
	
	
	
	
	
	

}
