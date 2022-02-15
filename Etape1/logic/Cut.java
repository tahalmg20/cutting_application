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


 public void generate_cut(List <String> listClient , List<String> listSupplier , List<String> listCut){
    
     //for(int  i = 0 ,  j = 0 ; i <listClient.size() && j <listSupplier.size(); i++ , j++){
       // listCut.add(listClient.get(i) + listSupplier.get(j)) ;
       int  i = 0 ,  j = 0 ;
     while( i <listClient.size() && j <listSupplier.size()){
    
                 
                String [] ary ;
                String [] ary2 ;
                
                ary = listClient.get(i).split(" ") ;
                ary2 = listSupplier.get(j).split(" ") ;
                String [] res  = new String [ary.length - 2] ; 
                String [] res2 = new String[ary2.length - 2 ] ;
                System.out.println("------ary " + Arrays.toString(ary)) ;
                if(Float.parseFloat(ary[ary.length-1]) < Float.parseFloat(ary2[ary2.length - 1] )  && Float.parseFloat(ary[ary.length -2]) < Float.parseFloat(ary2[ary2.length -2 ]) ){
                    
                    for(int  n = 0 ; n < ary.length - 2 ; n++ ){
                        res[n] = ary[n] ;
                    }
                    System.out.println("------res " + Arrays.toString(res)) ;
                    
                    for(int m = 0 ; m <ary2.length - 2 ;  m++){
                        res2[m] = ary2[m] ;
                    }
                    String str = String.join("," , res) ;
                    String str2 = String.join("," , res2) ;
                    System.out.println("------res with join " + str) ;
                    System.out.println("------res2 with join " + str2) ;

                    listCut.add(str + "," +  str2) ;
                    i++ ;
                    //break ; 
                }
                else{
                    j++ ;
                }
                

                 
         }
 }

     

 public void generate_cut_svg(List <String> listClient , List<String> listSupplier , List<String> listCut){
    
    //  for(int  i = 0 ,  j = 0 ; i <listClient.size() && j <listSupplier.size(); i++ , j++){
    //       listCut.add(listClient.get(i) + listSupplier.get(j)) ;
    // }
    int i = 0 , j = 0 ; 
    while(i < listClient.size()&& j< listSupplier.size()){
                String [] ary ;
                String [] ary2 ;
                
                ary = listClient.get(i).split(" ") ;
                ary2 = listSupplier.get(j).split(" ") ;
                if(Float.parseFloat(ary[0]) < Float.parseFloat(ary2[0]) && Float.parseFloat(ary[1]) < Float.parseFloat(ary2[1])){
                     listCut.add(listClient.get(i) + listSupplier.get(j)) ;
                     i++ ; 
                }
                else {
                    j++ ;
                }

    }
 }










}




/* String [] ary ;
                String [] ary2 ;
                
                ary = listClient.get(i).split(" ") ;
                ary2 = listSupplier.get(j).split(" ") ;
                String [] res  = new String [ary.length - 2] ; 
                String [] res2 = new String[ary2.length - 2 ] ;
                System.out.println("------ary " + Arrays.toString(ary)) ;
                if(Float.parseFloat(ary[ary.length-1]) < Float.parseFloat(ary2[ary2.length - 1] )  && Float.parseFloat(ary[ary.length -2]) < Float.parseFloat(ary2[ary2.length -2 ]) ){
                    
                    for(int  n = 0 ; n < ary.length - 2 ; n++ ){
                        res[n] = ary[n] ;
                    }
                    System.out.println("------res " + Arrays.toString(res)) ;
                    
                    for(int m = 0 ; m <ary2.length - 2 ;  m++){
                        res2[m] = ary2[m] ;
                    }
                    String str = String.join("," , res) ;
                    String str2 = String.join("," , res2) ;
                    System.out.println("------res with join " + str) ;
                    System.out.println("------res2 with join " + str2) ;

                    listCut.add(str + "," +  str2) ;
                */















                /* //for(int  i = 0 ,  j = 0 ; i <listClient.size() && j <listSupplier.size(); i++ , j++){
       // listCut.add(listClient.get(i) + listSupplier.get(j)) ;
        int j = 0 ;   int  i = 0 ;
    // while(  i <listClient.size() && j <listSupplier.size()){
        // for(int i = 0 ; i < listClient.size() ; i ++){
        //     for( int j = 0 ; j < listSupplier.size() ; j++){
        while(   j <listClient.size()){
              String [] ary2 ;
               ary2 = listSupplier.get(j).split(" ") ;
               String [] res2 = new String[ary2.length - 2 ] ;
                for(int m = 0 ; m <ary2.length - 2 ;  m++){
                        res2[m] = ary2[m] ;
                    }
                  // String str2 = String.join("," , res2) ;
              
           while( i <listClient.size() ){
                int tmp = 0 ; 
                String [] ary ;
                  ary = listClient.get(i).split(" ") ;
                    String [] res = new String[ary.length - 2 ] ;

                    for(int  n = 0 ; n < ary.length - 2 ; n++ ){
                        res[n] = ary[n] ;
                    }

                
                  
                    if(Float.parseFloat(ary[ary.length-1]) < Float.parseFloat(ary2[ary2.length - 1] )  && Float.parseFloat(ary[ary.length -2]) < Float.parseFloat(ary2[ary2.length -2 ]) ){
                        
                        System.out.println("------float " + Float.parseFloat(ary[ary.length-1]) );
                   
                        System.out.println("------res " + Arrays.toString(res)) ;
                    
                        String str = String.join("," , res) ;
                        String str2 = String.join("," , res2) ;
                        System.out.println("------res with join " + str) ;
                        System.out.println("------res2 with join " + str2) ;
                       listCut.add(str + "," +  str2) ;
                        // i++ ;
                         i++ ;
                    
                } 
                else{
                    //i = 0 ;
                    continue ;
                }
                
                 //i++ ;
                    
                
               
                
                
            }
            //i = 0 ;
            j++ ;
        } 

     
*/