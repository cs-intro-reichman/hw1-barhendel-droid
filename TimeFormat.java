// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String fulltime = (args[0]);
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		if (hours < 12 ); {
			System.out.println(fulltime + " AM");
		} else if (hours == 12) {
			System.out.println(fulltime + " PM");
		} else {
			hours = hours - 12;
			System.out.println(hours + ":" + String.format("%02d", minutes) + " PM");
		}
		
	}
}