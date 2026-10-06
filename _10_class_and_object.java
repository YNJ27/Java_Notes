class Calculator{
    int a;  //.................... instanse variable

    public void greeting(){
        System.out.println("Welcome to my Calculator.");
    }

    public int add(int n1, int n2){  //n1 and n2 are local variables of method "add"
        return (n1 + n2);
    }
}

class OOP{
    public static void main(String a[]){
        int num1 = 5, num2 = 2;

        Calculator calci; //unlike cpp, this syntax will not create a object, 
                          //this is just a refernce variable


        //In java object are always created on heap
        Calculator calc = new Calculator(); //This will return the address of the object 
        //      reference
        //      variable 

//JVM creates objects for you, but you need to provide it the class (or constructor) i.e the blueprint

        calc.greeting();
        int result = calc.add(5, 2);

        System.out.println("Result: " + result);

        //num1, num2, calci, calc and result are all local variables of method "main"
    }
}