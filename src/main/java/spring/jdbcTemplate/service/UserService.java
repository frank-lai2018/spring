package spring.jdbcTemplate.service;

import java.util.List;

import spring.jdbcTemplate.entity.User;

public interface UserService {

	public int add(User user);
	public int update(User user);
	public int delete(String userId);
	public User select(String userId);
	
	public int count();
	
	public List<User> findAll();
	
	public int[] batchInsert(List<Object[]> user);
	public int[] batchUpdate(List<Object[]> user);
	public int[] batchDelete(List<Object[]> userIds);
	
}
