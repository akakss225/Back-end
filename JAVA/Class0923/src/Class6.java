import java.util.Calendar;

public class Class6 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println("year : " + year);
		
		int month = now.get(Calendar.MONTH) + 1; // month는 인덱스넘버로 return됨.
		System.out.println("month : " + month);
	
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println("day : " + day);
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayOfWeek : " + dayOfWeek);
		
		int hour = now.get(Calendar.HOUR);
		System.out.println("hour : " + hour); // 12시간 표기법
		
		int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
		System.out.println("hourOfDay : " + hourOfDay); // 24시간 표기법
		
		int min = now.get(Calendar.MINUTE);
		System.out.println("minute : " + min);
		
		int sec = now.get(Calendar.SECOND);
		System.out.println("second : " + sec);
		
		int milsec = now.get(Calendar.MILLISECOND);
		System.out.println("millisecond : " + milsec);
		
		
		
	}

}
