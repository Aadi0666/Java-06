public class Pattern3{
    public static void main(String[] args){
        int n=5;
        for(int row=1;row<=n-row;row++){

            for(int space=1;space<=row;space++){
                System.out.println(" ");
            }
            for(int star=1;star<=5;star++){
                System.out.println("* ");
            }
        }
    }
}