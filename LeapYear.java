//program for leap year
public class LeapYear {

    public static void main(String[] args) {
        int year = 2024; // Year to check for leap year

        // Check if year is a leap year and print result
        isLeapYear(year);
    }

    public
 
static
 
void
 
isLeapYear(int year)
 
{
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
