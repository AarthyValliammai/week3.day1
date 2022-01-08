package week3.day1;

public class Calculator {
    public void add(int A,int B) {
    	int add=A+B;
    	System.out.println(add);
    }
    public void add(int A,int B,double C) {
    	double add=A+B+C;
    	System.out.println(add);
    }
    public void multiply(int A,int B) {
    	int multiply=A*B;
    	System.out.println(multiply);
    }
    public void multiply(int A,double B) {
    	double multiply=A*B;
    	System.out.println(multiply);
    }
    public void subtract(int A,int B) {
    	int subtract=A-B;
    	System.out.println(subtract);
    }
    public void subtract(int A,double B) {
    	double subtract=A-B;
    	System.out.println(subtract);
    }
    public void divide(int A,int B) {
    	double divide=A/B;
    	System.out.println(divide);
    }
    public void divide(double A,int B) {
    	double divide=A/B;
    	System.out.println(divide);
    }
    	public static void main(String[] args) {
    		Calculator calc=new Calculator();
    		calc.add(5,10);
    		calc.add(5, 10,5.5);
    		calc.multiply(5, 5);
    		calc.multiply(5, 4.5);
    		calc.subtract(100, 20);
    		calc.subtract(100, 75.25);
    		calc.divide(92, 5);
    		calc.divide(90.5, 2);
    }
		

	}
