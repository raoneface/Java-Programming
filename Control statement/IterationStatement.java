
public class IterationStatement {
    // for while and do while
    public static void main(String[] args) {
        int n = 10;
        while(n<20){
            System.out.println("tick"+ n);
            n++;
        }
        int i, j;
        i=100;
        j=200;
        while(++i < --j){
            System.out.println(i);
        }

        do{
            System.out.println(i);
            i++;
        }while(i<200);

        for(int j = 0 ; j < 10 ; j++){
            System.out.println(j);
        }
    }    
}
