package logic ;
import mypackage_es.* ;
import java.util.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

 class Cut 
{
    int client_id ; 
    int supplier_id ; 
    int plank_id ; 
    int pannel_id ; 


 Cut( int client_id , int supplier_id, int plank_id , int pannel_id ) {
     this.client_id =client_id ; 
     this.supplier_id = supplier_id ; 
     this.plank_id = plank_id ; 
     this.pannel_id = pannel_id ; 
 }



         public static void tri(float[] tab)
            {
                for (int i = 0; i < tab.length - 1; i++)  
                {
                    int index = i;  
                    for (int j = i + 1; j < tab.length; j++)
                    {
                            if (tab[j] > tab[index]){ 
                                index = j;
                            }
                    }
        
                    float max = tab[index];
                    tab[index] = tab[i]; 
                    tab[i] = max;
                }
            }



     public void sorting(List<String> listClient ,List<String>list_new_client ){
         float [] tab = new float[listClient.size()] ;
         
         for(int  i = 0 ; i < listClient.size(); i++ ){
              String [] ary ;
                
            ary = listClient.get(i).split(" ") ;
            tab[i] = Float.parseFloat(ary[ary.length - 2]) ;

         }
         tri(tab) ; 
        
        int i = 0 ;
        int j = -1 ;
        
         while(  j < tab.length-1 ){
               
           
            i = 0;
            j++;
           while(i < listClient.size()){  
               String [] ary ;
               ary = listClient.get(i).split(" ") ;
              
                if(tab[j] == Float.parseFloat(ary[ary.length - 2]) ){
                    list_new_client.add(listClient.get(i));
                   
                    tab[j] = -1;
                    ary[ary.length - 2 ] = "-1";
                    break;
                    

                }else{
                    i++;
                   
                }
                
            }
           

         }
           
     }





     public void sorting_for_svg(List<String> listClient ,List<String>list_new_client ){
         float [] tab = new float[listClient.size()] ;
         
         for(int  i = 0 ; i < listClient.size(); i++ ){
              String [] ary ;
                
            ary = listClient.get(i).split(" ") ;
            tab[i] = Float.parseFloat(ary[0]) ;

         }
         tri(tab) ; 
        
        int i = 0 ;
        int j = -1 ;
       
         while(  j < tab.length-1 ){
               
          
            i = 0;
            j++;
           while(i < listClient.size()){  
               String [] ary ;
               ary = listClient.get(i).split(" ") ;
              
                if(tab[j] == Float.parseFloat(ary[ary.length - 2]) ){
                    list_new_client.add(listClient.get(i));
                   
                    tab[j] = -1;
                    ary[0] = "-1";
                    break;
                    

                }else{
                    i++;
                   
                }
                
            }
         }
            

     }



 public void generate_new_cut(List <String> listClient , List<String> listSupplier , List<String> listCut){
    
    
       int  i = 0 ,  j = 0 ;
       int f  = 0 ; 
     while( i <listClient.size() && j <listSupplier.size()  ){
          
                 
                String [] ary ;
                String [] ary2 ;
                
                ary = listClient.get(i).split(" ") ;
                ary2 = listSupplier.get(j).split(" ") ;
                String [] res  = new String [ary.length - 2] ; 
                String [] res2 = new String[ary2.length - 2 ] ;
                
                f = 0 ;
                while(f  < Float.parseFloat(ary2[ary2.length -2 ])){
               
                    if(Float.parseFloat(ary[ary.length-1]) < Float.parseFloat(ary2[ary2.length - 1] )  && Float.parseFloat(ary[ary.length -2]) < Float.parseFloat(ary2[ary2.length -2 ]) && f  < Float.parseFloat(ary2[ary2.length -2 ]) ){
                        
                        for(int  n = 0 ; n < ary.length - 2 ; n++ ){
                            res[n] = ary[n] ;
                        }
                      
                        
                        for(int m = 0 ; m <ary2.length - 2 ;  m++){
                            res2[m] = ary2[m] ;
                        }
                        String str = String.join("," , res) ;
                        String str2 = String.join("," , res2) ;
                        
                        String [] ary3 ; 
                        
                        
                        listCut.add(str + "," +  str2 + ",Position,x,0,y," + Integer.toString(f) ) ;

                    
                        i++ ;

                        
                    }else{
                    
                        j++ ;
                    }
                 f += Float.parseFloat(ary[ary.length-2]) ;
            }
                
                

                 
         }
 }




 public void generate_new_cut_svg(List <String> listClient , List<String> listSupplier , List<String> listCut){
    
    
    int i = 0 , j = 0 ; 
    float f = 0 ;
    while(i < listClient.size()&& j< listSupplier.size()){
                String [] ary ;
                String [] ary2 ;
              
                ary = listClient.get(i).split(" ") ;
                ary2 = listSupplier.get(j).split(" ") ;
           
                f = 0 ;
               
                while(f  < Float.parseFloat(ary2[0])){
                     
                    if(Float.parseFloat(ary[1]) + f   < Float.parseFloat(ary2[0])   && Float.parseFloat(ary[1]) < Float.parseFloat(ary2[1])){
                       
                        listCut.add(listClient.get(i) + listSupplier.get(j) + " " + Float.toString( f) ) ;
                        //System.out.println("chek cutSVG number :  " + Integer.toString(i) + " >>>  " + listClient.get(i) + listSupplier.get(j) + " " + Float.toString(  Float.parseFloat(ary2[1]) -  f));
                        i++ ; 
                          f += Float.parseFloat(ary[1]) ;
                        
                   

                                            
                    }
                    else {
                       f = 0 ;
                        j++ ;
                        break ;
                       
                       
                    }
                  
                   
                  
                    
                    
                }

    }
 }






}

