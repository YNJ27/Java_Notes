class ifelse{

    public static void main(String str[]){
        //Code to get the largest number among 3 numbers
        int a = 1, b = 12, c = 10;

        if(a >= b && a >= c){
            System.out.println("a");
        }

        else if(b >= c){             //***No need to check "b >= a"
            System.out.println("b");
        }

        else{
            System.out.println("c");
        }
    }
}