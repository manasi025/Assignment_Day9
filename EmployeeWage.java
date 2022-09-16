package com.day9;

public class EmployeeWage {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private  String company;
	private static int empRatePerHour;
	private static int numOfWorkingDays;
	private static int maxHoursPerMonth;
	private int totalEmpWage;

	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public static void computeEmpWage() { 
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, empWage = 0;
		while (totalEmpHrs <= maxHoursPerMonth  && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random() * 10) % 3;
			if(totalEmpHrs >= 96  && empCheck == IS_FULL_TIME) {
				System.out.println("Max working hour Reached. You can do only part time");
			}
			switch (empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				empWage = empHrs * empRatePerHour ;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." +  " Emp Full Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);
				break;
			case IS_PART_TIME:
				empHrs = 4;
				empWage = empHrs * empRatePerHour;
				System.out.println("Day : " + totalWorkingDays + " Employee is Present." + " Emp Part Time Wage is: " + empWage + " and Working Hrs is : " + totalEmpHrs);	
				break;
			default:
				empHrs = 0;
				System.out.println("Day : " + totalWorkingDays + " Employee is Absent." );
			}
			totalEmpHrs += empHrs;
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: " + totalEmpWage);	 
	}

	@Override
	public String toString() {
		return "EmpWage [company=" + company + ", totalEmpWage=" + totalEmpWage  +"]";
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		EmployeeWage idea = new EmployeeWage("Idea", 20, 40, 100);
		EmployeeWage jio = new EmployeeWage("Jio", 15, 20, 200);
		EmployeeWage airtel = new EmployeeWage("Airtel", 20, 30, 200);	
		idea.computeEmpWage();
		System.out.println(idea);
		jio.computeEmpWage();
		System.out.println(jio);
		airtel.computeEmpWage();
		System.out.println(airtel);
	}
	
	

}
