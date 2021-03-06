// datetime/DisplayingMonthName.java
package datetime;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Problem Description: 
 * >> How to display name of a month in (MMM) format ?
 * Solution: 
 * >> This example shows how to display the current month in the (MMM) format with the help of 
 * >> Calender.getInstance() method of Calender class and fmt.format() method of Formatter class.
 *
 * @author kyoku-ryu
 * @version 0.1
 * @since 2016/09/27
 */
public class DisplayingMonthName {

    /**
     * DisplayingMonthName Execute Method.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
    }

}
