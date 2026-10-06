class primitive_datatypes{
    public static void main(String a[]){
        int num = 23;
        byte num1 = 127;
        short num2 = 378;
        long num3 = 5749947557695691l;
        //                          *  to show that it is a long you need to append 'l' at at the end

        double r = 2.4;
        float r1 = 3.6f;  //by default decimal numbers are of double type, so you need to explicitly
                          //append 'f' to show that it is a float

        char c = 'y';  //In java char is of 2 bytes and it follows UNICODE, instead of ASCII

        boolean check = true; //In java booleans aren't expressed in terms of 1 and 0.

        System.out.println(check);
        System.out.println(r);
    }
}