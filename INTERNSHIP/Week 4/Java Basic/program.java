import java.util.*;

public class program {  // class
    
    static String passOrfail(int mark) { // method
        
        if(mark<21/*operator*/){  // control statement
            return "Fail";
        }else{
            return "Pass";
        }
    }
    
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String studentName;  // data type and variable
		studentName = sc.nextLine();
		int studentMark;
		studentMark = sc.nextInt();
		
        String result = passOrfail(studentMark);
        
        System.out.println(studentName+" "+result+"ed in exam.");
	    
	}
}
