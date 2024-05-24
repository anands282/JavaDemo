public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9_999) {
            return false;
        }
        if (year % 4 == 0) { // if year is divisible by 4, go to next step.
            if (year % 100 != 0) { // if year is not divisible by 100, it's a leap year, so return true.
                return true;
            } else { // if year was divisible by 100, let's check if it's divisible by 400.
                if (year % 400 == 0) { // if it's divisible by 400, it's leap year.
                    return true;
                } else { // otherwise, it's not a leap year, so return false.
                    return false;
                }
            }
        } else { // year is not divisible by 4, so it's not a leap year.
            return false;
        }
    }
}