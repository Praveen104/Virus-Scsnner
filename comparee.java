package virus_scanner;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kajal Tulsyan
 */
public class comparee {
    public static void main(String args[])
    {
        String s1="Sachin";  
        String s2="Sachin";  
        String s3=new String("Sachin");    
        String s4="Saurav";  
        System.out.println(s1.equals(s2));//true  
        System.out.println(s1.equals(s3));//true  
        System.out.println(s1.equals(s4));//false  
 }
}
