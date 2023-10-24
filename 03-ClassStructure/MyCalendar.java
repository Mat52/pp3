public class MyCalendar {

    static int day = 24;
    static int month = 10;
    static int year = 2023;
    static int[] daysInMonth = {31,29,31,30,31,30,31,31,30,31,30,31};


    public static void main(String[] args) {
        System.out.println(myDate()); 
        System.out.println(days()); 
    }

    static String myDate(){
        return (year + "-" + month + "-" + day).toString();
    }

    static int days(){
        int days = day;
        for (int i = month-1; i>0; i--){
                days = days+daysInMonth[i];
        }
        return days;
            
    }

}
