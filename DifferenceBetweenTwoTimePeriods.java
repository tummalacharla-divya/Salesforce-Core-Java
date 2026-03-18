//Example: Calculate Difference Between Two Time Periods
class Time{
	int hours;
	int minutes;
	int seconds;
	public Time(int hours,int minutes,int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public static void main(String[] args){
		Time start=new Time(12,34,55);
		Time stop=new Time(8,12,15);
		Time diff;
		
		diff=difference(start,stop);
		
		System.out.printf(" difference Time: %d:%d:%d - ",start.hours,start.minutes,start.seconds);
		System.out.printf("%d:%d:%d ",stop.hours,stop.minutes,stop.seconds);
		System.out.printf("= %d:%d:%d",diff.hours,diff.minutes,diff.seconds);
	}
	public static Time difference(Time start,Time stop){
		Time diff=new Time(0,0,0);
		
		if(start.seconds>stop.seconds){
			--stop.minutes;
			stop.seconds+=60;
		}
		diff.seconds=stop.seconds-start.seconds;
		
		if(start.minutes>stop.minutes){
			--stop.hours;
			stop.minutes+=60;
		}
		diff.minutes=stop.minutes-start.minutes;
		diff.hours=stop.hours-start.hours;
		
		return diff;
	}
}