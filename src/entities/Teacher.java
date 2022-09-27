package entities;
import java.util.Scanner;
public class Teacher extends Person {
	Scanner sc=new Scanner(System.in);
	int id,experience,awards,count;
	
	@Override
	public void insert() {
		System.out.println("first name");
    	setFirstName(sc.nextLine());
    	System.out.println("last name");
    	setLastName(sc.nextLine());
    	System.out.println("Id");
    	id=sc.nextInt();
    	System.out.println("gender");
    	setGender(sc.next());
    	System.out.println("department");
    	setDepartment(sc.next());
    	System.out.println("Experience");
    	experience=sc.nextInt();
    	System.out.println("No Of Awards");
    	awards=sc.nextInt();
    	System.out.println("city");
    	setCity(sc.next());
    	
    	System.out.println("\n");
		
	}

	@Override
	public void display() {
		System.out.println("first name  : "+getFirstName()+"\n"+"last name   : "+getLastName()+"\n"+
				"Id          :  "+id+"\n"+"gender      : "+getGender()+"\n"+"department  : "+
				getDepartment()+"\n"+
				"Experience  : "+experience+"  years"+"\n"+"No of Awards: "+awards+"\n"
				+"city        : "+getCity());
		
	}

	public int searchByFirstName(Teacher[] array, String fn) {
		count=0;
    	for(int i=0;i<array.length;i++) {
			String name=array[i].getFirstName();
			if(name.equals(fn)) {
				array[i].display();
				System.out.println("-".repeat(30));
				count+=1;
				//return arr[i];
			}
			
		}
		return count;
	}

	public int searchByLastName(Teacher[] array, String ln) {
		int count1=0;
    	for(int i=0;i<array.length;i++) {
			String name=array[i].getLastName();
			if(name.equals(ln)) {
				 array[i].display();
				 System.out.println("-".repeat(30));
				 count1+=1;
			}
			
		}
		return count1;
	}
	public Teacher searchById(Teacher[] array, int id) {
		for(int i=0;i<array.length;i++) {
			int id1=array[i].id;
			if(id1==id){
				return array[i];
			}
			
		}
		return null;
		
	}

	

}
