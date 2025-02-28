import java.util.Scanner;

public class Complex
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter real part of first complex number: ");
		int real1 = scanner.nextInt();
		
		System.out.print("Enter imaginary part of first complex number: ");
		int imag1 = scanner.nextInt();
		
		System.out.print("Enter real part of second complex number: ");
		int real2 = scanner.nextInt();
		
		System.out.print("Enter imaginary part of second complex number: ");
		int imag2 = scanner.nextInt();
		int real3 = real1 + real2;
		int imag3 = imag1 + imag2;
		System.out.println("Sum: " + real3 + " + " + imag3 + "i");

		scanner.close();
		
		
	}
}
