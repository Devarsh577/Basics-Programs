class Copydemo {  
    public static void main(String[] args) {  
        
        char[] copyFrom = { 'f', 'd', 'e', 'v', 'a', 'r', 's',  
                'h', 'j' };  
          
         char[] copyTo = new char[7];  
          
         System.arraycopy(copyFrom, 1, copyTo,0, 7);  
          
         System.out.println(String.valueOf(copyTo));  
    }  
}  