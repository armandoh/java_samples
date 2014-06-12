package switch_string;

public class StringSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringSwitch task = new StringSwitch();
		task.testSwitchWithStrings();
	}

	private void testSwitchWithStrings() {

		String op = "DECEMBER";
		String msg = null;

		switch (op) {

		case "JANUARY":
			msg = "The month after holidays";
			break;
		case "FEBRUARY":
			msg = "The second month of the year";
			break;
		case "MARCH":
			msg = "The third month of the year";
			break;
		case "APRIL":
			msg = "The fourth month of the year";
			break;
		case "MAY":
			msg = "The family month, the fifth month of the year";
			break;
		case "JUNE":
			msg = "The sixth month of the year";
			break;
		case "JULY":
			msg = "The seventh month of the year";
			break;
		case "AUGUST":
			msg = "The eighth month of the year";
			break;
		case "SEPTEMBER":
			msg = "The ninth month of the year";
			break;
		case "OCTOBER":
			msg = "The tenth month of the year";
			break;
		case "NOVEMBER":
			msg = "The eleventh month of the year";
			break;
		case "DECEMBER":
			msg = "The nice month of holidays, the last one of the year";
			break;

		default:
			msg = "Can not recognize your month.";
			break;
		}

		System.out.println(msg);

	}

}
