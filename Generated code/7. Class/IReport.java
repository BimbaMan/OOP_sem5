

/**
 * @author Иван
 * @version 1.0
 * @created 25-дек-2022 17:36:20
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