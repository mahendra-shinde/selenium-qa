package demo2;

public class MainDate {

	public static void main(String[] args) {
		Date d1 = new Date(31,6,2020);
		System.out.println("Is it Valid? "+ validateDate(d1));
	}
	
	static boolean validateDate(Date d) {
		
		int maxDaysFeb = 28; 
		if(isLeap(d.getYear())) {
			maxDaysFeb = 29;
		}
		
		int maxDaysOther = 31;
		//if(d.getMonth() >=1 && d.getMonth() <=12 ) {
		if(d.getMonth()< 1 || d.getMonth() > 12) {
			return false;
		}else {
//			int mon = d.getMonth();
//			if ( mon == 4 || mon == 6 || mon == 9 || mon == 11) {
//				maxDaysOther = 30;
//			}
			// if month in in range 4,6,9,11 then max days would be 30
			switch(d.getMonth()) {
				case 4:
				case 6:
				case 9:
				case 11:
					maxDaysOther=30;
					break;
			}
		}
		
		if(d.getMonth() == 2 && d.getDay() <= maxDaysFeb && d.getDay() >= 1 ) {
			return true;
		}else if(d.getMonth() !=2 && d.getDay() >=1 && d.getDay()<= maxDaysOther) {
			return true;
		}else{
			return false;
		}
		
		
	}
	
	static boolean isLeap(int year) {
		if(year%100==0 && year%400==0) {
			return true;
		}else if(year%4==0) {
			return true;	// Stop the execution right here
		}else {
			return false;
		}
	}

}
