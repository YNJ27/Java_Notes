class arithmetic{

    public static void main(String str[]){
        //we have "+, - , * , / and %" binary operators
        int num1 = 7;
        int num2 = 3;

        int num3 = 7/3;
        System.out.println(num3);

        double num4 = 7/3;
        System.out.println(num4);

        double num5 = (double)7/ 3;
        System.out.println(num5);

        //We have ++ and -- increment operators
        int num = 5;
        // num++;
        ++num;

        //Using both the above syntax you get the same output
        System.out.println(num);

        //But there's a difference
        int integer = 5;
        int result = integer++;
        // int result = ++integer;

        System.out.println(result);
    }
}