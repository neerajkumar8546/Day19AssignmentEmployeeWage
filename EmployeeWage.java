public class EmployeeWage
{
	public static void main(String[] args)
	{
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		
		int EmpHrs=0;
		int EmpWage=0;

		double check=Math.floor(Math.random()*10)%2;
		if(check==IS_FULL_TIME)
		{
			EmpHrs=8;
		}
		else
		{
			EmpHrs=0;
		}
		EmpWage=EmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage = "+EmpWage);
	}
}
