

/**
 * @author Иван
 * @version 1.0
 * @created 27-дек-2022 10:21:36
 */
public interface IReport {

	/**
	 * 
	 * @param date
	 */
	public object getExpenseReport(DateTime date);

	/**
	 * 
	 * @param date
	 */
	public object getIncomeReport(DateTime date);

	/**
	 * 
	 * @param date
	 */
	public object getMostProfitableReport(DateTime date);

	/**
	 * 
	 * @param date
	 */
	public object getSalesReport(DateTime date);

}