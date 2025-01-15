// Sum up stuff
// Kate Lozova 
// October 11, 2024
// Project Description: 
// Given two numbers, calculate the sum and print the sum. 
// sum = one + two   
// sum is equal to the value of one added to the value of two
// In this assignment I would like you to use Sum.java to create a 
// method that you will pass parameters to the program SumRunner.java. 
// You will write the code for the methods: setNums, Sum, 
// and Print in Sum.java and instantiate the same methods in SumRunner.java. 
// When you run SumRunner.java your program will add two numbers together. 
// Please submit both Sum and SumRunner with additional test cases

public class Sum { 
    private int one;
    private int two;

    public void setNums(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int getSum() { 
        return one + two;
    }

    public void printSum() {
        System.out.println("The sum of " + one + " and " + two  + " is: " + getSum());

    }

}