

    public static String getSmallestAndLargest(String s, int k) {
        
        String smallest = "z";
        String largest = "";
        
            for(int i=0; i<=s.length()-k; i++){
                
            String a = (s.substring(i,k+i));
            
            if(a.compareTo(smallest)<0){
                smallest = a; 
            }
                
            if(a.compareTo(largest)>0){
                largest = a;
            }
        }
        
    return smallest + "\n" + largest;

    }

