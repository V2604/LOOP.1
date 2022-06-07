package programs;

public class CONTINUE {
    public static void main(String args[]){
        int[] numbers={10, 20, 30, 40, 50};
        for(int x:numbers)
        {
            if(x==40){
                continue;
            }
            System.out.print(x);
            System.out.println("\n");
        }
    }
}
