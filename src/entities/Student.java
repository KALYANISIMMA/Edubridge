package entities;
import java.util.Scanner;
public  class Student extends Person {
    //String firstName, lastName,gender,city;
    int rollNum,marks,count;
    String grade,attendance;
    Scanner sc=new Scanner(System.in);
	
   public Student() {
	   
   }
    public void insert() {
    	
    	System.out.println("enter first name");
    	setFirstName(sc.next());
    	System.out.println("enter last name");
    	setLastName(sc.next());
    	System.out.println("enter roll num");
    	rollNum=sc.nextInt();
    	System.out.println("enter gender");
    	setGender(sc.next());
    	System.out.println("enter department");
    	setDepartment(sc.next());
    	System.out.println("enter city");
    	setCity(sc.next());
    	System.out.println("enter marks out of 100");
    	marks=sc.nextInt();
    	System.out.println("enter attendane percentage");
    	attendance =sc.next();
    	System.out.println("\n");
    	if(marks>80) {
    		grade="A";
    	}
    	else if(marks>60) {
    		grade="B";
    	}
    	else if(marks>40) {
    		grade="C";
    	}
    	else if(marks>=32) {
    		grade="D";
    	}
    	else if(marks<33) {
    		grade="fail";
    	}
    	
    }
	
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("first name : "+getFirstName()+"\n"+"last name  : "+getLastName()+"\n"+
				"roll number: "+rollNum+"\n"+"gender     : "+getGender()+"\n"+"department : "+
				getDepartment()+"\n"+"city       : "+getCity()+"\n"+"marks      : "+marks+"\n"+"attendane  : "+attendance+"\n"+"grade      : "+grade);
		
	}
    
	public int searchByFirstName(Student[] arr,String fn){
    	count=0;
    	for(int i=0;i<arr.length;i++) {
			String name=arr[i].getFirstName();
			if(name.equals(fn)) {
				arr[i].display();
				System.out.println("-".repeat(30));
				count+=1;
				//return arr[i];
			}
			
		}
		return count;
	}
    public int searchByLastName(Student[] arr,String ln) {
    	int count1=0;
    	for(int i=0;i<arr.length;i++) {
			String name=arr[i].getLastName();
			if(name.equals(ln)) {
				 arr[i].display();
				 System.out.println("-".repeat(30));
				 count1+=1;
			}
			
		}
		return count1;
	}
	
	public Student searchByRollNum(Student[] arr, int rollnum2) {
		for(int i=0;i<arr.length;i++) {
			int roll=arr[i].rollNum;
			if(roll==rollnum2) {
				return arr[i];
			}
			
		}
		return null;
		
	}
	
	
}
