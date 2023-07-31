package myFirstJavaProgram;

public class Demo {

	public static void main(String[] args) {
		int dayValue = 4;

        String dayOfWeek = getDayOfWeek(dayValue);

        if (dayOfWeek != null) {
            System.out.println("Value of the day: " + dayValue);
            System.out.println("Day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid Day");
        }

        System.out.println("Good Bye!");
	}
	
	public static String getDayOfWeek(int dayValue) {
        String dayOfWeek;

        switch (dayValue) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = null; // Invalid day value
        }

        return dayOfWeek;
	}
}

