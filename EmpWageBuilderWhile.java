public class EmpWageBuilderWhile{
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static int calcEmpWageforCompany(String company,int empRate,int numOfDays, int maxHrs)
{
int empHrs=0, totalEmpHrs=0, totalWorkingDays=0,totalEmpWage=0,empWage=0;

while(totalEmpHrs <= maxHrs && totalWorkingDays< numOfDays){
int empCheck=(int)Math.floor(Math.random()*10)%3;
totalWorkingDays++;

switch (empCheck){
  case IS_PART_TIME:
    empHrs=4;
  break;
  case IS_FULL_TIME:
empHrs=8;
   break;
  default:
   empHrs=0;
}
totalEmpHrs+=empHrs;
empWage=empHrs*empRate;
System.out.println("Emp Wage: "+empWage);
totalEmpWage+= empWage;
}
System.out.println("Total Emp Wage for company "+company+" is : "+totalEmpWage);
return totalEmpWage;


 }



public static void main(String[] args)
{
int totalWage=calcEmpWageforCompany("DMart",20,2,10);
calcEmpWageforCompany("Reliance",10,4,2);

}
}
