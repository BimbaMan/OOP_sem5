

/**
 * @author Иван
 * @version 1.0
 * @created 25-дек-2022 17:36:20
 */
public class PaySystem implements IPayment {

	public PaySystem(){

	}

	public void finalize() throws Throwable {

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
}//end PaySystem