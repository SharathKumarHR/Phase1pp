
//3. using protected access specifiers

public class accessSpecifiers3 {

	protected void display() 
{ 
    System.out.println("This is protected access specifier"); 
} 


//create another package

public class accessSpecifiers12 extends accessSpecifiers3 {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3();   
	       obj.display();  
	}

}
}