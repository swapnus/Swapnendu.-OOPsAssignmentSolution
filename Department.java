package com.greatlearning.oops;

public class Superdepartment {
String departmentName;
String getTodaysWork;
String getWorkDeadline;
String isTodayAHoliday;

{
	departmentName= "Super Department";
	getTodaysWork= "No work as of now";
	getWorkDeadline= "NIL";
	isTodayAHoliday= "Today is not a Holiday";
	
}
}

package com.greatlearning.oops;

public class Admindepartment extends Superdepartment {

	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	
	{departmentName= "Admin Department";
	getTodaysWork= "Complete Your Document Submission";
	getWorkDeadline= "Complete by EOD";
	
	}	
	
}

package com.greatlearning.oops;

public class HRdepartment extends Superdepartment {

	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String getactivity;
	
	{departmentName= "HR Department";
	getTodaysWork= "Fill today's worksheet & mark your attendence";
	getWorkDeadline= "Complete by EOD";
	getactivity= "Team Lunch";
	
	}	 
	
	

}

package com.greatlearning.oops;

public class Techdepartment extends Superdepartment {

		String departmentName;
		String getTodaysWork;
		String getWorkDeadline;
		String TechStackinformation;
		
		{departmentName= "Tech Department";
		getTodaysWork= "Complete Coding module 1";
		getWorkDeadline= "Complete by EOD";
		TechStackinformation= "Core Java";
		
		}	 

}

package com.greatlearning.oops;

public class Main {

	public static void main(String[] args) {
		
		Admindepartment Adminobj= new Admindepartment();
		System.out.println ("Welcome to");
		System.out.println(Adminobj.departmentName);
		System.out.println(Adminobj.getTodaysWork);
		System.out.println(Adminobj.getWorkDeadline);
		System.out.println(Adminobj.isTodayAHoliday);

		HRdepartment HRobj= new HRdepartment();
		System.out.println ("Welcome to");
		System.out.println(HRobj.departmentName);
		System.out.println(HRobj.getactivity);
		System.out.println(HRobj.getTodaysWork);
		System.out.println(HRobj.getWorkDeadline);
		System.out.println(HRobj.isTodayAHoliday);
		
		
		Techdepartment Techobj=new Techdepartment();
		System.out.println (" Welcome to");
		System.out.println(Techobj.departmentName);
		System.out.println(Techobj.getTodaysWork);
		System.out.println(Techobj.getWorkDeadline);
		System.out.println(Techobj.TechStackinformation);
		System.out.println(Techobj.isTodayAHoliday);
		
		}