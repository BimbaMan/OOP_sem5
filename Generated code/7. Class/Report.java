

/**
 * @author Иван
 * @version 1.0
 * @created 27-дек-2022 10:21:36
 */
public class Report implements IReport, IPrinter {

	public Report(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param reportId
	 */
	public File getReport(object reportId){
		return null;
	}

	/**
	 * 
	 * @param date
	 */
	public object getExpenseReport(DateTime date){
		return null;
	}

	/**
	 * 
	 * @param date
	 */
	public object getIncomeReport(DateTime date){
		return null;
	}

	/**
	 * 
	 * @param date
	 */
	public object getMostProfitableReport(DateTime date){
		return null;
	}

	/**
	 * 
	 * @param date
	 */
	public object getSalesReport(DateTime date){
		return null;
	}

	/**
	 * 
	 * @param report
	 */
	public boolean printReport(object report){
		return false;
	}
}//end Report