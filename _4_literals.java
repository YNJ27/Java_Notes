class literals{

    public static void main(String a[]){

        int binary = 0b10101;
        System.out.println(binary);

        int hexadecimal = 0x6a;
        System.out.println(hexadecimal);

        int num = 10_00_00_000; //java allows putting underscores
        System.out.println(num);

        double b = 12e10; 
        System.out.println(b); //will be displayed as "1.2e11"

        char c = 'a';
        c++;
        System.out.println(c);

//Just take a note that the default value of boolean is false, but it can better understood when we learn oop
    }
}