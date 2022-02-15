
package logic ;

import java.util.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

 
class Generable {
   
    int id;
    List<? extends Wood> listP;

    Generable(int id , List<? extends Wood> listP){
        this.id  = id ; 
        this.listP = listP ;
    }

    public void check_is_valid(  List<? extends Wood> listWood , int id ,Object obj ){
           
              Validate v = new Validate() ; 
              String wood_type = null ; 
              if(obj.getClass() == Client.class ){
                  wood_type = "planks" ; 
              }else if(obj.getClass() == Supplier.class){
                  wood_type = "pannels" ; 
              }
              System.out.println( " with id :  >>  " +  id  + " has " + Integer.toString(listWood.size()) +" "+  wood_type );
              for(int i = 0 ; i< listWood.size() ; i++ ){
                   
                    System.out.println(  wood_type +   ConsoleColors.YELLOW_BOLD  + " with id " + listWood.get(i).id +  ConsoleColors.RESET  +" has an invalid table "+ Arrays.toString(v.invalidate_result(listWood.get(i).id ,listWood.get(i).prix ,listWood.get(i).nombre,listWood.get(i).date,listWood.get(i).dim))) ;
            }
           
    }

 
    public int nbre_wood(Generable user){
        int res = 0 ; 
        for(int i = 0 ; i < user.listP.size();i++){
            res = res + user.listP.get(i).nombre ; 
        }
        return res ;
    }



}