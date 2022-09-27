package schoolmng;
import java.util.Scanner;
import entities.Student;
import entities.Teacher;
public class Menu {
    static Student stu=new Student();
    static Student[] arr;
    static Teacher emp=new Teacher();
    static Teacher[] array;
	public static void options(){
		
		Scanner sc=new Scanner(System.in);
		
		int option1=0,option2=0,option3=0, records;
		String firstname,lastname;
		do {
			System.out.println("Choose one option");
			System.out.println("1. Student");
			System.out.println("2. Teacher");
			System.out.println("3. Exit");
			option1=sc.nextInt();
			
			switch(option1) {
			case 1:
				do {
				System.out.println("Choose one option");
				System.out.println("1. Insert Student Records");
				System.out.println("2. Display All Student Records");
				System.out.println("3. Search Student Record By Roll Number");
				System.out.println("4. Search Student Record By First Name");
				System.out.println("5. Search Student Record By Last Name");
				
				System.out.println("6. Exit");
				System.out.println("-".repeat(30));
				option2=sc.nextInt();
				
					switch(option2) {
					case 1:
						System.out.println("Insert no of records");
						records=sc.nextInt();
						stu=new Student();
						arr=new Student[records];
						
						for(int i=0;i<records;i++) {
							arr[i]=new Student();
							arr[i].insert();
						}
						System.out.println("-".repeat(30));
						break;
					case 2:
						try {
						for(int i=0;i<arr.length;i++) {
							arr[i].display();
							System.out.println("-".repeat(30));
						}
						}catch(NullPointerException e) {
							System.out.println("No records found");
							System.out.println("-".repeat(30));
						}
						break;
					case 3:
						System.out.println("Enter roll number");
						int rollnum=sc.nextInt();
						try {
						    Student output=stu.searchByRollNum(arr,rollnum);
						    if(output==null) {
							    System.out.println("No records found");
						    }
						    else {
							    output.display();
							    System.out.println("-".repeat(30));
						    }
						}catch(NullPointerException e) {
							System.out.println("No records found");
							System.out.println("-".repeat(30));
						}
						break;
					case 4:
						System.out.println("Enter first name");
						firstname=sc.next();
						try {
						    int result=stu.searchByFirstName(arr,firstname);
						    if(result==0) {
							    System.out.println("No records found");
							    System.out.println("-".repeat(30));
						    }
						   
						}catch(NullPointerException e) {
							System.out.println("No records found");
							System.out.println("-".repeat(30));
						}
						break;
					case 5:
						System.out.println("Enter last name");
						lastname=sc.next();
						try {
						    int result1=stu.searchByLastName(arr,lastname);
						    if(result1==0) {
							    System.out.println("No records found");
							    System.out.println("-".repeat(30));
						    }
						    
						}catch(NullPointerException e) {
							System.out.println("No records found");
							System.out.println("-".repeat(30));
						}
						break;
					case 6:
						System.out.println("Thank you...Have a good day");
						System.out.println("-".repeat(30));
						System.exit(0);
						
						
					}
					
						
					
				}while(option2<=6);
				break;
			case 2:
				do {
					System.out.println("Choose one option");
					System.out.println("1. Insert Teacher Records");
					System.out.println("2. Display All Teacher Records");
					System.out.println("3. Search Teacher Record By Id");
					System.out.println("4. Search Teacher Record By First Name");
					System.out.println("5. Search Teacher Record By Last Name");
					
					System.out.println("6. Exit");
					System.out.println("-".repeat(30));
					option3=sc.nextInt();
					
						switch(option3) {
						case 1:
							System.out.println("Insert no of records");
							int records1=sc.nextInt();
							emp=new Teacher();
							array=new Teacher[records1];
							
							for(int i=0;i<records1;i++) {
								array[i]=new Teacher();
								array[i].insert();
							}
							System.out.println("-".repeat(30));
							break;
						case 2:
							try {
							for(int i=0;i<array.length;i++) {
								array[i].display();
								System.out.println("-".repeat(30));
							}
							}catch(NullPointerException e) {
								System.out.println("No records found");
								System.out.println("-".repeat(30));
							}
							break;
						case 3:
							System.out.println("Enter Id");
							int id=sc.nextInt();
							try {
							    Teacher output=emp.searchById(array,id);
							    if(output==null) {
								    System.out.println("No records found");
							    }
							    else {
								    output.display();
								    System.out.println("-".repeat(30));
							    }
							}catch(NullPointerException e) {
								System.out.println("No records found");
								System.out.println("-".repeat(30));
							}
							break;
						case 4:
							System.out.println("Enter first name");
							String firstname1=sc.next();
							try {
							    int result=emp.searchByFirstName(array, firstname1);
							    if(result==0) {
								    System.out.println("No records found");
								    System.out.println("-".repeat(30));
							    }
							   
							}catch(NullPointerException e) {
								System.out.println("No records found");
								System.out.println("-".repeat(30));
							}
							break;
						case 5:
							System.out.println("Enter last name");
							String lastname1=sc.next();
							try {
							    int result1=emp.searchByLastName(array,lastname1);
							    if(result1==0) {
								    System.out.println("No records found");
								    System.out.println("-".repeat(30));
							    }
							    
							}catch(NullPointerException e) {
								System.out.println("No records found");
								System.out.println("-".repeat(30));
							}
							break;
						case 6:
							System.out.println("Thank you...Have a good day");
							System.out.println("-".repeat(30));
							System.exit(0);
							
							
						}
						
							
						
					}while(option2<=6);
					break;
			case 3:
				System.out.println("Thank You...Have a good day");
				System.out.println("-".repeat(30));
				System.exit(0);
			}
				
		 }while(option1!=3);

	

}
}
