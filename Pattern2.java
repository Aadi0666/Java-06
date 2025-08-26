public class Pattern2{
    public static void main(String[] args){
        int n =5;
        for(int row=n;row>=0;row--){
            for(int star=1;star<=row;star++){
                System.out.println("*"+"");
                
            }
            System.out.println();
        }
    }
}