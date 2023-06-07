
import java.awt.Component;
import javax.swing.JOptionPane;



public class Helper {


    

    // Helper method to check if two time periods overlap
    public boolean isTimeOverlapping(String start1, String end1, String date1, String empName1, String start2, String end2, String date2, String empName2) {
        
        String startTimeString1 = start1;
        String[] startParts1 = startTimeString1.split(":");
        String startHourString1 = startParts1[0].trim();
        int startTime1 = Integer.parseInt(startHourString1);//start
        
        String endTimeString1 = end1;
        String[] endParts1 = endTimeString1.split(":");
        String endHourString1 = endParts1[0].trim();
        int endTime1 = Integer.parseInt(endHourString1);//end
        
        String startTimeString2 = start2;
        String[] startParts2 = startTimeString2.split(":");
        String startHourString2 = startParts2[0].trim();
        int startTime2 = Integer.parseInt(startHourString2);//existinstart
        
        String endTimeString2 = end2;
        String[] endParts2 = endTimeString2.split(":");
        String endHourString2 = endParts2[0].trim();
        int endTime2 = Integer.parseInt(endHourString2);//end
        
        String dateValue1 = date1; //date
        String dateValue2 = date2; //existindate

        if (startTime1 >= endTime1) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, "Please check end time again", "Input Error", JOptionPane.ERROR_MESSAGE);
            return (true);
        }else if (startTime1 == endTime1) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent, "Please check end time again", "Input Error", JOptionPane.ERROR_MESSAGE);
            return (true);
        }
        
        return !(endTime1 <= startTime2 || startTime1 >= endTime2 || !dateValue2.equals(dateValue1) || !empName1.equals(empName2));
        // Check if the time periods overlap
        
    }

}

