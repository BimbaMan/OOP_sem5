

/**
 * @author Иван
 * @version 1.0
 * @created 27-дек-2022 10:21:36
 */
public class AuthorizedUser extends User {

	public SoldedGamingKeyboard m_SoldedGamingKeyboard;

	public AuthorizedUser(){

	}

	public void finalize() throws Throwable {

	}
	public boolean addGamingKeyboardToShoppingBasket(){
		return false;
	}

	public boolean deleteGamingKeyboardFromShoppingBasket(){
		return false;
	}

	public boolean editGamingKeyboardInShoppingBasket(){
		return false;
	}

	public List<GamingKeyboard> filterGamingKeyboard(){
		return null;
	}

	public List <GamingKeyboard> getGamingKeyboardFromCatalog(){
		return null;
	}

	public List <GamingKeyboard> getShoppingBasket(){
		return null;
	}

	public void makeOrder(){

	}

	public void signOut(){

	}
}//end AuthorizedUser