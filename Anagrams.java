

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] A = a.toUpperCase().toCharArray();
        char[] B = b.toUpperCase().toCharArray();
        
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);        
        return new String(A).equals(new String(B)) ? true : false;
    }

