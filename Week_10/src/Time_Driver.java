
public class Time_Driver {

	public static void main(String[] args) {
		Time myTime = new Time(6, 6, 37);
		Time newTime = new Time();
		newTime.setHour(16);
		newTime.setMinute(16);
		newTime.setSeconds(37);
		Time.add(myTime, newTime);
//		printTime(newTime);
//		printTime(myTime);
		System.out.println(myTime);
		System.out.println(newTime);
		System.out.println(myTime.equals(newTime));
		System.out.println(myTime == newTime);
		
		Time addedTime = Time.add(myTime, newTime);
		System.out.println(addedTime);

	}

	public static void printTime(Time time)
	{
		System.out.println(time.getHour() + ":" 
				+ time.getMinute() + ":" + time.getSeconds());
	}
}
