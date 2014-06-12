package exceptions;

public class ExceptionsTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExceptionsTester tester = new ExceptionsTester();
		try {
			tester.rethrowException("Bz");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	/**
	 * @param exceptionName
	 *            Name of the exception to match
	 */
	public void rethrowException(String exceptionName) throws Ex_A, Ex_B, Ex_C,
			Exception {
		try {
			switch (exceptionName) {
			case "A":
				throw new Ex_A("I am exception A");
			case "B":
				throw new Ex_B("I am exception B");
			case "C":
				throw new Ex_C("I am exception C");
				// breaks are not needed

			default:
				throw new Exception("I am just an exception");
			}

		} catch (Ex_A | Ex_B | Ex_C e) {
			/**
			 * This is the new way to handle multiple exceptions in a single
			 * block, pretty practical when the exceptions are treated in the
			 * same way.
			 * 
			 */
			throw e;
		} catch (Exception e) {
			/**
			 * Notice that Exception has to be handled in a separate block. If
			 * 'Exception' is added to the previous catch block there is going
			 * to be a compile error since Exception is the parent class of
			 * Ex_A, Ex_B and Ex_C
			 * */
			throw e;
		}
	}

}
