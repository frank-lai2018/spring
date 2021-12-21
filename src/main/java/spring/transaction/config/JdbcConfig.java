package spring.transaction.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan(basePackages = {"spring"})
@EnableTransactionManagement
public class JdbcConfig {
	
	//創建數據庫連接池
	@Bean
	public DruidDataSource getDruidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl("jdbc:mysql://localhost:3306/user_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf-8");
		druidDataSource.setUsername("root");
		druidDataSource.setPassword("1234");
		druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return druidDataSource;
	}
	
	//創建JdbcTemplate
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}
	
	//創建事務管理器
	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource);
		return transactionManager;
	}

}
