package spring.jdbcTemplate.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(value = {"spring.jdbcTemplate"})
public class JdbcConfig {
	
	DataSource dataSource;
	
//	@Bean
//	public JdbcTemplate getJdbcTemplate() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(dataSource);
//		return jdbcTemplate;
//	}

}
