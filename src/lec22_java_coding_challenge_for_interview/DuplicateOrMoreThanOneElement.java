package lec22_java_coding_challenge_for_interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateOrMoreThanOneElement {
    public static void main(String[] args) {
// Need to solve by Nasir
        String [] name= {"java", "Selenium", "hello", "java", "Selenium", "java"};
        // 1. use inner loop, use for loop
        // mistake happen in length
        for(int i= 0;i< name.length;i++ ){
            for(int j =i+1; j< name.length; j++){
        // mistake: name[i].equals(name[j])
                if(name[i].equals(name[j])){
                    System.out.println("The duplicate element is :" + name[i]);
                }
            }
        }
        
        
        
        
        
        
        System.out.println("*********** Another way ************");       
        // 2. use HashSet, HashSet only take the unique value
        Set<String>  store = new HashSet<String>();
        for(String names : name){
            if(store.add(names)== false){
                System.out.println("The duplicate element is : " + names);
            }
        }

    }
}
