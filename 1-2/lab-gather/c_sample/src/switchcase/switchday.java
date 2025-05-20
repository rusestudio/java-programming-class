package switchcase;

public class switchday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int day = 4;                // declare and initialize an integer variable
		        String dayString;           // declare a string variable

		        switch (day) {              // start a switch statement based on the value of 'day'
		            case 1:                 // if 'day' is 1:
		                dayString = "Monday";    // assign "Monday" to 'dayString'
		                break;              // exit the switch statement
		            case 2:                 // if 'day' is 2:
		                dayString = "Tuesday";   // assign "Tuesday" to 'dayString'
		                break;              // exit the switch statement
		            case 3:                 // if 'day' is 3:
		                dayString = "Wednesday"; // assign "Wednesday" to 'dayString'
		                break;              // exit the switch statement
		            case 4:                 // if 'day' is 4:
		                dayString = "Thursday";  // assign "Thursday" to 'dayString'
		                break;              // exit the switch statement
		            case 5:                 // if 'day' is 5:
		                dayString = "Friday";    // assign "Friday" to 'dayString'
		                break;              // exit the switch statement
		            case 6:                 // if 'day' is 6:
		                dayString = "Saturday";  // assign "Saturday" to 'dayString'
		                break;              // exit the switch statement
		            case 7:                 // if 'day' is 7:
		                dayString = "Sunday";    // assign "Sunday" to 'dayString'
		                break;              // exit the switch statement
		            default:                // if 'day' does not match any of the cases above:
		                dayString = "Invalid day";  // assign "Invalid day" to 'dayString'
		                break;              // exit the switch statement
		        }

		        System.out.println(dayString);  // print the value of 'dayString' to the console

		    }
		

	

}
