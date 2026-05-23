package Week1;

import java.util.Scanner;

public class Calculator {
    //declaring the variable named value
    private double value;
    //initializing the variable to 0.0 in the constructor named Calculator
    public Calculator() {
        value = 0.0;
    }
    //method add
    public void add (double val){
        value+=val;
    }
    //method subtract
    public void sub(double val){
        value-=val;
    }
    //method multiply
    public void multiply(double val){
        value*=val;
    }
    //method division
    public void division(double val){
        if (val==0){
            System.out.println("Error: Cannot divide by zero.");
        } else {
            value/=val;
        }
    }
    //method clear
    public void clear(){
        value=0.0;
    }
    //getter method to return the value
    public double getValue(){
        return value;
    }
    //main method
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        //Creating an instance to Calculator
        Calculator Calc1 = new Calculator();
        //declaring variables
        double num1, num2;
        //initializing num1 and num2 with Scanner class
        System.out.println("Enter a num1 here: ");
        num1 = scnr.nextDouble();
        System.out.println("Enter num2 here: ");
        num2 = scnr.nextDouble();

        //Using the reference variable we called Calc1 that is referencing the data in Calculator, we include .getValue
        //to access and return the new results of the variable value
        System.out.println("\nInitial number: " + Calc1.getValue());

        //Adding the num1 to initial value we call the reference variable Calc1 with method add with num1 as parameter
        Calc1.add(num1);

        //Printing the results of add method
        System.out.println( "After adding num1: " + Calc1.getValue());

        //now that value has the new stored data, we utilize the multiply method with the '3' as it's parameter giving
        //val the new value of '3'
        //which looks like this --> val+=value * 3 --> 3*=(num1)
        Calc1.multiply(3);

        //print the results of 3*=num1
        System.out.println("After multiplying by 3: " + Calc1.getValue());

        //Subtracting 2 for the current value
        //2-=value
        Calc1.sub(num2);

        //printing the new value
        System.out.println("After subtracting num2: " + Calc1.getValue());

        //Divide the current value by 2
        //2/=value
        Calc1.division(2);

        //printing the new value
        System.out.println("After dividing by 2: " + Calc1.getValue());

        //Clearing the calculator
        //by calling the clear method to bring the value back to zero
        //and utilizing .getValue to return the value
        Calc1.clear();
        System.out.println("After clearing the calculator: " + Calc1.getValue());

        //closing scanner
        scnr.close();


    }
}
