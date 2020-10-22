
package intro.to.java;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class IntroToJava {
public static Scanner SC = new Scanner(System.in);
 static String plainText;
 static byte[] hash;
   public static void main(String[] args) {
//       method1();
//      method2(); 
//      method3();
//       method4();
 //        method5();
//         byteToHex(); dr.skilton@mbro.ac.uk
         method6();
   }
   
   
   public static void method1() {
       int num1;
       int num2;
       int num3;
       int num4;
       int num5; 
       int answer;
       
       num1 = 10;
       num2 = 25;
       num3 = 40;
       num4 = 55; 
       num5 = 70;
       answer = num5 - num3 + num1 * num2 / num4;
       
       System.out.println("The sum of the five numbers is " + answer); 
       }
    public static void method2() {
        
      String s1,s2;
        System.out.println("Enter string");
        s1 = SC.next();
        System.out.println("Enter string");
        s2 = SC.next();
        System.out.println("your strings are " + s1 + " and " + s2);
    }
    public static void method3() {
        
        boolean boolean1;
        boolean boolean2;
        
        boolean1 = false;
        boolean2 = true;
        
        System.out.println(boolean1 && boolean2);
        
        System.out.println(boolean1 || boolean2);
    }
    public static void method4() {
        
        int num1;
        int num2;
        System.out.println("what is the value of number 1");
        num1 = SC.nextInt();
        
        System.out.println("wha is the value of number 2");
        num2 = SC.nextInt();
        
 
        if(num1 == num2){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Not equal");
        }
        if(num1 != num2){
            System.out.println("numbers are not equal");
        }else { 
            System.out.println("equal");
        }
        if (num1 > num2){
            System.out.println("num1 is greater than num2");
        }else {
            System.out.println("num1 is not greater to num2");   
    }
    
    }
public static void method5(){
System.out.println("welcome to Yeet Nation");

Scanner sc = new Scanner (System.in);
String password;
 System.out.println("Please Enter Your Password"); 
password = sc.next();


if (password.equals("Yeet123456789")){
    System.out.println("Access Granted");    
} else {
    System.out.println("Access Denied");
}


    
    
}  
public static String byteToHex(byte[] hash){
    
   StringBuffer hexString;
    hexString = new StringBuffer();
    for (int i = 0; i < hash.length; i++){ 
     String hex = Integer.toHexString(255 & hash[i]);
     if(hex.length() == 1){
         hexString.append('0');
         
     }
     hexString.append(hex);   
    }
   System.out.println(hexString);
   return hexString.toString();
}
 public static byte[] getHash() throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        return hash = messageDigest.digest(getPlainText().getBytes(StandardCharsets.UTF_8));
    }

    public static void setHash(byte[] hash) {
        IntroToJava.hash = hash;
    }
    
    public static String getPlainText() {   
        return plainText;
    }
     public static void method6(){
       Scanner sc;
    sc = new Scanner(System.in);
       System.out.println("Speed Limit");
       int Speed = sc.nextInt();
       
       sc.close();
       if (Speed >= 70){
           System.out.println("Issue Fine");
          } else{
           System.out.println("No Action");
       }
 
     }




}

      

      
     
          
        
        
        
      
      
      
    
    

