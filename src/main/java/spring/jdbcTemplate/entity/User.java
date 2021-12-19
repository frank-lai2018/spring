package spring.jdbcTemplate.entity;

public class User {

	private String userId;
	private String username;
	private String ustatus;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUstatus() {
		return ustatus;
	}
	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=").append(userId).append(", username=").append(username).append(", ustatus=")
				.append(ustatus).append("]");
		return builder.toString();
	}
	
	
}
