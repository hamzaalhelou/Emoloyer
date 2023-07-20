/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M
 */
public class Employer {
    public String name;
    public final int salary=2088;
    public static String religion ="مسلم";
    
    public Employer(String name){
        this.name = name;
    }
    public void printInfo(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("religion:"+religion);
        System.out.println(".....................");
    }
    public static void Em(){
        religion = "مسلم";
    }
   
    
    
}
