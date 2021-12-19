package spring.jdbcTemplate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import spring.jdbcTemplate.dao.UserDAO;
import spring.jdbcTemplate.entity.User;
import spring.jdbcTemplate.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
	
	//注入DAO
	@Autowired
	private UserDAO userDAO;

	public int add(User user) {
		return userDAO.add(user);
	}

	public int update(User user) {
		return userDAO.update(user);
	}

	public int delete(String userId) {
		return userDAO.delete(userId);
	}

	public User select(String userId) {
		return userDAO.select(userId);
	}

	public int count() {
		return userDAO.count();
	}

	public List<User> findAll() {
		return userDAO.findAll();
	}

	public int[] batchInsert(List<Object[]> users) {
		return userDAO.batchInsert(users);
	}

	public int[] batchUpdate(List<Object[]> users) {
		return userDAO.batchUpdate(users);
	}

	public int[] batchDelete(List<Object[]> userIds) {
		return userDAO.batchDelete(userIds);
	}

}
