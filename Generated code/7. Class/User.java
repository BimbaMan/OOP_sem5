

/**
 * @author Иван
 * @version 1.0
 * @created 27-дек-2022 10:21:37
 */
public class User extends Status Role UnauthorizedUser {

	private DateTime blockDate;
	private String login;
	private String name;
	private BigInteger passwordHash;
	private DateTime registerDate;
	private Role role;
	private Status status;
	private String surname;
	private int userId;

	public User(){

	}

	public void finalize() throws Throwable {

	}
}//end User