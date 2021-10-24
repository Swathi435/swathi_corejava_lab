package swathi_corejava_lab;

public class getsorted {
	
		public static void main(String args[]){  
		int i=200, reverse=0; 
		String s=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		int number = 200100 ;
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);

}
}