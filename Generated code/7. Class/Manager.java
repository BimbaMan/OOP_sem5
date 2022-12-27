

/**
 * @author Иван
 * @version 1.0
 * @created 27-дек-2022 10:21:36
 */
public class Manager extends MainController User {

	public Manager(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param KeyboardId
	 */
	public boolean addGamingKeyboardToCatalog(int KeyboardId){
		return false;
	}

	/**
	 * 
	 * @param KeyboardItem
	 */
	public boolean addGamingKeyboardToStock(int KeyboardItem){
		return false;
	}

	/**
	 * 
	 * @param KeyboardId
	 */
	public boolean deleteGamingKeyboardFromCatalog(int KeyboardId){
		return false;
	}

	/**
	 * 
	 * @param KeyboardId
	 * @param GmaingKeyboard
	 */
	public boolean editGamingKeyboardInCatalog(int KeyboardId, keyboard GmaingKeyboard){
		return false;
	}

	/**
	 * 
	 * @param index
	 */
	public List<Orders> getGamingKeyboardFromCatalog(int index){
		return null;
	}

	/**
	 * 
	 * @param index
	 */
	public List<Orders> getGamingKeyboardFromStock(int index){
		return null;
	}

	/**
	 * 
	 * @param index
	 */
	public List<Orders> getOrders(int index){
		return null;
	}

	public void signOut(){

	}
}//end Manager