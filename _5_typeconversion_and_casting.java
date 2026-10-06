class typecasting{

    public static void main(String str[]){
    //1) Small int value into byte
        int a = 12;
        // byte b = a;  //....it is not allowed

        byte b = (byte) a;      //Explicit -> Type catsing
        System.out.println(b);

    //2) Big int value into byte
        int a1 = 257;
        byte b1 = (byte) a1; //If the int value is bigger than byte, it performs modulo by the range of byte i.e 256
        System.out.println(b1);

    //3) byte into int
        byte b2 = 127;
        int a2 = b2;              //Implicit -> Type Conversion
        System.out.println(a2);

    //4) float to int
        float real = 5.6f;
        // int num = real;
        int num = (int) real;    //Explicit , but we will loose the point values
        System.out.println(num);

    //5) ***Type promotion***
        byte b_1 = 10;
        byte b_2 = 30;
        int result = b_1 * b_2;    //We know ideally byte x byte should give byte, but 300 doesn't lies in byte's range
                                   //So its type gets promoted to int
        System.out.println(result);
    }

}