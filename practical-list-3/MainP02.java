// Parent class with a method to check if a year is leap or not
class Year {
    public boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

// Child class inheriting from the Year class
class LeapYearChecker extends Year {
    public void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

public class MainP02 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        int yearToCheck = 2024; // Change this to the desired year
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        leapYearChecker.checkLeapYear(yearToCheck);
    }
}
