package week1.day4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371, number, remainder, total = 0;

        number = num;
        while (number != 0)
        {
        	remainder = number % 10;
            total = total + remainder*remainder*remainder;
            number=number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }

	}

