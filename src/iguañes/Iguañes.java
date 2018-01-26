/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iguañes;

/**
 *
 * @author EQUIPO29-LSE
 */
public class Iguañes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
         String CA[]={"1","1","1","2","2","3","7","7","8","10","10","10","10"};
       
        for (int i = 0; i <CA.length; i++) 
            for (int j = 0; j < CA.length-1; j++) {
                if(i!=j){
                    if(CA[i]==CA[j]){ 
                        
                        CA[i]="";
                        
                    }
                }
                
            }
           
    int A= CA.length;
        for (int t = 0; t <=A-1; t++) {
            if (CA[t]!=""){
                System.out.println(CA[t]);
            
        }
                   
               } 
            }
        }
        
              
            
                
    
            
            

