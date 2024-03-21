
import java.util.*;

public class No3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack myStack = new Stack();
        System.out.print("masukkan input String : ");
        String input = sc.next();
        //int i = 0;
        for (char a : input.toCharArray()) {
            myStack.push(a);
        }
        System.out.println("hasil reverse String menggunakan Stack");
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop());
        }
        
    }

}
