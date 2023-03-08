// Equivalence Testing with Arrays
import java.util.ArrayList;
public class HomeWork4 {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList();
        ArrayList<Integer> B=new ArrayList();
        A.add(1);
        B.add(1);
        B.add(2);
        if(A.equals(B))
            System.out.println("They are equals");
        else System.out.println("They are not equals");
    }
}
