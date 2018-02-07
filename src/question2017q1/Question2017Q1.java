/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2017q1;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Scanner;

/**
 *
 * @author dileeparajapaksa
 */
public class Question2017Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }
    
    public static void calcDIT() throws ClassNotFoundException
    {
     
        //String retType_className = "";
      
        //int max = 0;
      // int count = 0;
 
// Diliyas Code        
        Scanner sc = new Scanner(System.in);
        String input_class = sc.nextLine();
        
        
        Class _class= Class.forName(input_class);  
        Method[] _methods = _class.getMethods();
        
        ArrayList<Class> _returnTypes= new ArrayList<Class>()  ;
         
         for(Method m:_methods)
         {
             _returnTypes.add(m.getReturnType());
         }
         
         int _ditCount=0;
         Class tempClass=null;
         
         for(Class c: _returnTypes)
         {            
             if(c.getSuperclass()!=null)
             {             
                while(!tempClass.equals(Object.class))
                {
                    _ditCount++;
                    tempClass=c.getSuperclass();
                 }
             }
             System.out.println("Depth of Inheritancefor "+c.getName()+" is : "+_ditCount);
             _ditCount=0;
         }
      }
}
// End of Diliyas Code     






 // Bingas Code
  /*
    for (int i =0; i< _methods.length; i++)
        {
            Class <?> retType = _methods[i].getReturnType();
            if (retType_className.equals(""))
            {
            retType_className = retType.getName();
            }
            while (!retType.equals(Object.class))
            {
                if (max<count)
                {
                    max = count;
                }
            }
            
            count =0;
            retType_className = "";
        }
             System.out.println("Name of max DIT class is "+retType_className+"Depth of Inheritancefor "+count);
   
// End of Bingas Code
    }
}

*/
