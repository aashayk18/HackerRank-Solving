import java.util.Scanner;
import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        ArrayList<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            
            L.add(sc.nextInt());
            
        }
        
        int Q = sc.nextInt();     
        
        for(int j = 0; j < Q; j++){
            
            String s=sc.next();
            
            if(s.equals("Insert")){
                L.add(sc.nextInt(),sc.nextInt());   
            }
            else if (s.equals("Delete")){
                L.remove(sc.nextInt());
            }       
        }
            sc.close();
            L.forEach(i->System.out.print(i+" "));
        }
    }  
      
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        
        // BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        // int num[] = new int [N];
        
        // ArrayList<Integer> num_new = new ArrayList<Integer>();
        
        // String[] inp;
        
        
        // inp = b.readLine().split(" ");
        
        // for (int i = 0; i< inp.length; i++) {
        //     num[i] = Integer.parseInt(inp[i]);
        // }
        
        // int Q = sc.nextInt();
        
        // for (int j = 0; j < Q * 2; j++) {
        //     String Q1 = sc.nextLine();    
        //     if (Q1 == "Insert") {
        //         int ins[] = new int[2];
                
        //         String[] ins_inp; 
                
        //         ins_inp = b.readLine().split(" ");
        //         for (int i = 0; i<2; i++) {
        //             ins[i] = Integer.parseInt(ins_inp[i]);
        //         }
                
        //         num[ins[0]] = ins[1];
        //     } 
        //     else if (sc.nextLine() == "Delete") {
        //         int del_ind = sc.nextInt();
        //         for (int i: num) {
        //             num_new.add(i);
        //         }
        //         num_new.remove(del_ind);
        //     }
            
        // }
        // sc.close();
        // System.out.println(num_new);
        
