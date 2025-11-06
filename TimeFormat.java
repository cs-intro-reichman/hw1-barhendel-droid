public class TimeFormat {
    public static void main(String[] args) {
        if (args.length == 0) return;

        String fulltime = args[0];
        if (fulltime.length() != 5 || fulltime.charAt(2) != ':') return;

        int hours;
        int minutes;
        try {
            hours = Integer.parseInt(fulltime.substring(0, 2));
            minutes = Integer.parseInt(fulltime.substring(3, 5));
        } catch (NumberFormatException e) {
            return;
        }

        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) return;

        int displayHour;
        String period;
        if (hours < 12) {
            displayHour = hours; 
            period = "AM";
        } else {
            displayHour = (hours == 12) ? 12 : hours - 12;
            period = "PM";
        }

        System.out.println(displayHour + ":" + String.format("%02d", minutes) + " " + period);
    }
}