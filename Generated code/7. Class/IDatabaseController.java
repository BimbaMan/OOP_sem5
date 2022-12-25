

/**
 * @author Иван
 * @version 1.0
 * @created 25-дек-2022 17:36:20
 */
public interface IDatabaseController {

	/**
	 * 
	 * @param entity
	 */
	public void addEntity(object entity);

	/**
	 * 
	 * @param entity
	 */
	public void deleteEntity(object entity);

	/**
	 * 
	 * @param entity
	 */
	public void editEntity(object entity);

	/**
	 * 
	 * @param param
	 */
	public object getAllList(String param);

	/**
	 * 
	 * @param param
	 */
	public object getEntity(String param);

	/**
	 * 
	 * @param param
	 */
	public object getList(String param);

	/**
	 * 
	 * @param param
	 */
	public object getListByCriteria(String param);

}