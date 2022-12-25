

/**
 * @author Иван
 * @version 1.0
 * @created 25-дек-2022 17:36:21
 */
public class Transaction implements IPayment {

	private String bankNumberReciever;
	private String bankNumberSender;
	private DateTime date;
	private int id;
	private int sum;
	public SoldedGamingKeyboard m_SoldedGamingKeyboard;

	public Transaction(){

	}

	public void finalize() throws Throwable {

	}
	public String getBankNumberReceiver(){
		return "";
	}

	/**
	 * 
	 * @param id
	 */
	public String getBankNumberSender(int id){
		return "";
	}

	public DateTime getDate(){
		return null;
	}

	/**
	 * 
	 * @param newDate
	 */
	public int getID(Date newDate){
		return 0;
	}

	public int getSum(){
		return 0;
	}

	public boolean checkPayment(){
		return false;
	}

	/**
	 * 
	 * @param id
	 */
	public boolean sendTransaction(int id){
		return false;
	}
}//end Transaction