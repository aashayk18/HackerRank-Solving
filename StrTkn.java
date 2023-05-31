import java.util.*;

public class StrTkn {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        if(s.trim().equals("")) {
            System.out.println(0) ;
        } 
        else{
            
            String[] arr = s.trim().split("[\\s!,?._'@]+");
            
            System.out.println(arr.length);
            
            for (String a : arr) {
                System.out.println(a);
            }      
                  
        }
        
        sc.close();
    }
}

