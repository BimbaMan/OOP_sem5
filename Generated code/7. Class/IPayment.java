

/**
 * @author ����
 * @version 1.0
 * @created 25-���-2022 17:36:20
 */
public interface IPayment {

	public boolean checkPayment();

	/**
	 * 
	 * @param id
	 */
	public boolean sendTransaction(int id);

}