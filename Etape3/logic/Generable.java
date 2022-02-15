
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
            //List <String> list_invalid = new ArrayList <>() ; 
              Validate v = new Validate() ; 
              String wood_type = null ; 
              if(obj.getClass() == Client.class ){
                  wood_type = "planks" ; 
              }else if(obj.getClass() == Supplier.class){
                  wood_type = "pannels" ; 
              }
              System.out.println( " with id :  >>  " +  id  + " has " + Integer.toString(listWood.size()) +" "+  wood_type );
              for(int i = 0 ; i< listWood.size() ; i++ ){
                    //System.out.println("test >>  " +listWood.get(i).nombre );
                    //list_invalid.add(v.invalidate_result(listWood.get(i).id ,listWood.get(i).prix ,listWood.get(i).nombre,listWood.get(i).dim)) ;
                    System.out.println(  wood_type +   ConsoleColors.YELLOW_BOLD  + " with id " + listWood.get(i).id +  ConsoleColors.RESET  +" has an invalid table "+ v.invalidate_result(listWood.get(i).id ,listWood.get(i).prix ,listWood.get(i).nombre,listWood.get(i).date,listWood.get(i).dim)) ;
            }
            //return list_invalid ; 
    }

 
    public int nbre_wood(Generable user){
        int res = 0 ; 
        for(int i = 0 ; i < user.listP.size();i++){
            res = res + user.listP.get(i).nombre ; 
        }
        return res ;
    }


    // public void listInfo(List <Generable> listClient , List<String> listInfo){
    //     for(int i = 0 ; i<listClient.size() ; i++){
    //         for(int j = 0 ; j<listClient.get(i).listP.size() ; j++){
    //             for(int k = 0 ; k<listClient.get(i).listP.get(j).nombre ; k++){
    //                 listInfo.add( listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) ));
    //         }
    //     }
    // }
    // }

    //  public int wood_bool(Wood wood , List<Wood> woodlist){
    //      int res = 0 ;
        
    //         if (listwood.get(woodlist.size() - 1 ).id == wood.id){
    //             res = 1 ;
    //         }
    //          return res ;
    //     }
    

    
//     public List<Generable> generate (List<String> data){
//         List<Generable> listObjet = new ArrayList<>() ; 
//         String user = data.get(1) ; 
//          System.out.println("user " + user) ;    
//         for(int index = 0 ; index < data.size() ; index++){
//             List<String> user_data = new ArrayList<>() ; 
//             int i = index+1 ;
//             //System.out.println(data.get(index)+"/"+user);

//             if(data.get(index) == user){
//                 while( i < data.size() && data.get(i) != user ){
//                       //System.out.println("----------------");
//                         user_data.add(data.get(i));
//                         i++ ; 
//                 }
//                 Generable g = create_user(user_data) ; 
               
//                 listObjet.add(g) ; 
//             }
//         }
//         //System.out.println("size of listObjet " + listObjet.size()) ;
//         return listObjet ;
//     }
//     public Generable create_user(List<String> user_data ) { 
//          //System.out.println("size of user_data in create_user > "+user_data.size());

//             List<Wood> listWood= new ArrayList<>() ;
//             //System.out.println("----create user: "+user_data.size());
//             int id =  Integer.parseInt(user_data.get(0));
//             String wood = user_data.get(0) ; 
//             for(int index = 0 ; index < user_data.size() ; index++){
//                 List<String> wood_data = new ArrayList<>() ; 
//                 int i = index+1 ;
//                 if(user_data.get(index) == wood ){
//                     while( i < user_data.size() && user_data.get(i) != wood ){
//                         wood_data.add(user_data.get(i));
//                         i++ ; 
//                     }
//                 }
              
//                 Wood p ;
//             //System.out.println("sfdgsfd"+wood_data.get(0));
//             if(wood_data.size()!=0){
//                 p = create_wood(wood_data ) ;
//                 listWood.add(p) ; 
//                 }
//             }
//             Generable g = new Generable(id , listWood) ; 
            
//             return g ; 

        
//     }

//    /* public void create_wood(List<String> user_data ,Generable g) { 
//         int id =  Integer.parseInt(wood_data.get(0));
//          int number =  Integer.parseInt(wood_data.get(1));
//          String date  =  wood_data.get(2);
//          Float price =  Float.ParseFloat(wood_data.get(3));
//         List<Wood> listWood= new ArrayList<>() ;
//         for(int index = 0 ; index < user_data.size() ; index++){
//             List<String> wood_data = new ArrayList<>() ; 
//             if(user_data.get(i) == woo ){
//                 while( i < user_data.size() && user_data.get(i) != wood ){
//                     wood_data.add(get(i));
//                     i++ ; 
//                 }
//             }
//             Wood p = new Wood();
           
//             listWood.add(p) ; 
//         }
//         //Generable g = new Generable(id , listWood) ; 
        
//         //return listWood ; 

    
//     }*/




// public Wood create_wood(List<String> wood_data ) { 
//     System.out.println("heho"+wood_data.size());
//         int id =  Integer.parseInt(wood_data.get(1)); 
//         int number =  Integer.parseInt(wood_data.get(2));
//         String date  =  wood_data.get(3);
//         float price =  Float.parseFloat(wood_data.get(4));
//         float L = 0 ;
//         float l = 0 ; 
//          Wood p = new Wood(0,0,null,(float)(0.0),new Dimension(L,l));
//         //List<Wood> listWood= new ArrayList<>() ;
//         for(int index = 0 ; index < wood_data.size() ; index++){
//             if(wood_data.get(index) == "dim" ){
//                 L = Float.parseFloat(wood_data.get(index+1) );
//                 l = Float.parseFloat(wood_data.get(index+2) ) ; 
//                 Dimension dim = new Dimension(L , l) ; 
//                 p = new Wood(id,number,date,price,dim);
//                 break ;
//             }
            
            
//         }
       
//         return p ;
//     }
// }
        
      
  

//     // public void create_dim(List<String> wood_data,Wood p){
//     //      int id =  Integer.parseInt(wood_data.get(0));
//     //      int number =  Integer.parseInt(wood_data.get(1));
//     //      String date  =  wood_data.get(2);
//     //      Float price =  Float.ParseFloat(wood_data.get(3));
        
//     // }

}