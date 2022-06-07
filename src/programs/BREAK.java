package programs;

public class BREAK {
    public static void main(String args[]){
        int [] numbers={10,20,30,40,50};

        for(int x: numbers){
            if(x==40){
                break; //control comes out of loop
            }
            System.out.print(x);
            System.out.println("\n");
        }
    }
}
