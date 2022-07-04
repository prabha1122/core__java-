import java.util.*;
abstract class HospitalStaff
{
	String name;
	int age;
	int salary;
	String pos;
	static int count=0;
	HospitalStaff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n Enter name :");
		name=sc.nextLine();
		System.out.print("\n Enter Age :");
		age=sc.nextInt();
            
		
		
	}
	public void display()
	{
		System.out.println("\nNAME:"+name+ "\nAGE:"+age+ "\nSALARY:"+salary+"\nPosition:"+pos);	
	}
	public abstract void riseSalary();	
	
	
}

final class Dean extends HospitalStaff {
	public Dean(){
		salary=100000;
		pos="dean";
	}
	public void riseSalary(){
           
		salary=salary+50000;
		
	}
}

final class Gynocologist extends HospitalStaff{
	public Gynocologist(){
		salary=80000;
		pos="gynocologist";
	}
	public void riseSalary(){
           
		salary=salary+30000;
           
		
	}
}
final class Cardialogist extends HospitalStaff{
	public Cardialogist(){
		salary=70000;
		pos="cardialogist";
	}
	public void riseSalary(){
           
		salary=salary+20000;
		
	}
}
final class Psychologist extends HospitalStaff {
	public Psychologist (){
		salary=10000;
		pos="pychologist";
	}
	public void riseSalary(){
           
		salary=salary+5000;
		
	}
}

public class Project {
	public static void main(String args[])
	{
		int ch1=0,ch2=0;
		
		ArrayList<HospitalStaff> list=new ArrayList<HospitalStaff>();
		
		do{ 
		System.out.println("--------------------------------");
		System.out.println("1.Create");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);
		ch1=sc1.nextInt();

			if(ch1==1){
			do{
				System.out.println("--------------------------------");
				System.out.println("1.Dean");
				System.out.println("2.Gynocogist");
				System.out.println("3.Cardialogist");
                        System.out.println("4.Pychologist");
				System.out.println("5.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
					case 1:
						
						list.add( new Dean() );
						
						break;
						
					case 2:
						list.add(new Gynocologist());
						break;
					
					case 3:
						list.add(new Cardialogist());
						break;
                              case 4:
						list.add(new Psychologist());
						break;
					}
			}while(ch2!=5);
		}
		if(ch1==2)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				HospitalStaff y=(HospitalStaff) i.next();
				y.display();
			}
			
		}
		if(ch1==3)
		{
			Iterator i=list.iterator();
			while(i.hasNext())
			{
				HospitalStaff y=(HospitalStaff) i.next();
				y.riseSalary();
                        
			}
		}
		}while(ch1!=4);
		
	}
}