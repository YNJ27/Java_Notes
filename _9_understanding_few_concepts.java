import java.util.Scanner;

class Demo{
    public static void main(String a[]){
        int num1 = 10;
        int num2 = 20;

        //This works because in java when you concatenate a variable of any type with a string
        //that variable gets converted to a string before the concatenation

        System.out.println("Result: " + num1+num2); //Will give unexpected result

        System.out.println("Result: " + (num1 + num2));

//-------------------------------------------------------------------------------------
        //Learning how to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine(); //Important to omit the '\n' when you pressed enter after providing age

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your gender(M/F/O): ");
        char gender = scanner.next().charAt(0);

        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}