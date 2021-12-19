package spring.jdbcTemplate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.jdbcTemplate.entity.User;

@Repository
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int add(User user) {
		String sql = "insert into t_user values(?,?,?)";
		String[] args= {user.getUserId(),user.getUsername(),user.getUstatus()};
		return jdbcTemplate.update(sql, args);
	}

	public int update(User user) {
		String sql = "update t_user set username = ?,ustatus = ? where user_id =?";
		String[] args= {user.getUsername(),user.getUstatus(),user.getUserId()};
		return jdbcTemplate.update(sql, args);
	}

	public int delete(String userId) {
		String sql = "delete t_user  where user_id =?";
		String[] args= {userId};
		return jdbcTemplate.update(sql, args);
	}

	public User select(String userId) {
		String sql = "select * from t_user where user_id = ?";
		String[] args= {userId};
		return jdbcTemplate.queryForObject(sql, User.class);
	}

	public int count() {
		String sql = "select count(*) from t_user";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	public List<User> findAll() {
		String sql = "select * from t_user";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>());
	}

	public int[] batchInsert(List<Object[]> users) {
		String sql = "insert into t_user values(?,?,?)";
		return jdbcTemplate.batchUpdate(sql, users);
	}

	public int[] batchUpdate(List<Object[]> users) {
		String sql = "update t_user set username = ?,ustatus = ? where user_id =?";
		return jdbcTemplate.batchUpdate(sql, users);
	}

	public int[] batchDelete(List<Object[]> userIds) {
		String sql = "delete t_user  where user_id =?";
		return jdbcTemplate.batchUpdate(sql, userIds);
	}
}
