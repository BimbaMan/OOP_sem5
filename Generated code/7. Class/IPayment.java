

/**
 * @author ����
 * @version 1.0
 * @created 27-���-2022 10:21:36
 */
public interface IPayment {

	public boolean checkPayment();

	/**
	 * 
	 * @param id
	 */
	public boolean sendTransaction(int id);

}