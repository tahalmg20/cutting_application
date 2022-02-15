// package logic ;
// import mypackage_es.* ;
// import java.util.*;

// import javax.xml.stream.XMLInputFactory;
// import javax.xml.stream.XMLStreamConstants;
// import javax.xml.stream.XMLStreamException;
// import javax.xml.stream.XMLStreamReader;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.util.ArrayList;
// import java.util.List;

// //  class Cut 
// // {
// //     int client_id ; 
// //     int supplier_id ; 
// //     int plank_id ; 
// //     int pannel_id ; 


// //  Cut( int client_id , int supplier_id, int plank_id , int pannel_id ) {
// //      this.client_id =client_id ; 
// //      this.supplier_id = supplier_id ; 
// //      this.plank_id = plank_id ; 
// //      this.pannel_id = pannel_id ; 
// //  }

// //  public void generate_cut(List <Client> listClient , List<Supplier> listSupplier , List<String> listCut){
    
// //         //List<String> listCut = new ArrayList<>() ; 
// //      for(int i = 0 , n = 0 ; i<listClient.size() && n<listSupplier.size()  ; i++ , n++){
// //          int j =0 ;
// //          int m = 0 ;
// //          //for(int n = 0 ; n < listSupplier.size() ; n++ ){
// //             //for(int  j = 0 ,  m = 0 ; j <listClient.get(i).listP.size() && m <listSupplier.get(i).listP.size(); j++ , m++){
// //             while( j <  listClient.get(i).listP.size() ){
// //                  while(  m <listSupplier.get(n).listP.size() ){
                

// //                     int  k = 0 ;
// //                     int l = 0 ;
// //                     //if(listClient.get(i).listP.get(j).nombre > listSupplier.get(i).listP.get(j).nombre ) {
// //                     // while (l != listClient.get(i).listP.get(j).nombre && k != listSupplier.get(n).listP.get(m).nombre ){
// //                     //     listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(l) );
// //                     //     listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(i).listP.get(m).id) + "." + Integer.toString(k) );
// //                     //     l++ ; 
                        
// //                     //     k++ ;
                        
                    
// //                     //  } 
// //                     System.out.println("***HOLA***");
// //                     //}


// //                 //   if(listClient.get(i).listP.get(j).nombre > listSupplier.get(i).listP.get(j).nombre ) {
// //                     // while (l != listClient.get(i).listP.get(j).nombre && k != listSupplier.get(n).listP.get(m).nombre ){
// //                     //     listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(l) );
// //                     //     listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(n).listP.get(m).id) + "." + Integer.toString(k) );
                        
                       
// //                     //     // if(k  == listSupplier.get(n).listP.get(m).nombre ){
// //                     //     //    m++ ;
// //                     //     // }
                                               
// //                     //     // else if(l  == listClient.get(i).listP.get(j).nombre ){
// //                     //     //     k++ ;
// //                     //     //     l = 0 ;
// //                     //     // }
// //                     //     // else{
// //                     //     //     k++ ;
// //                     //     //     l++ ;
// //                     //     // }
// //                     //     k++ ; 
// //                     //     l++ ;
// //                     //  } 



// //                     // while(l != listSupplier.get(i).listP.get(j).nombre ){
// //                     //      listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(l) );
// //                     //     while (k != listClient.get(i).listP.get(j).nombre ){
                        
                            
// //                     //         listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(i).listP.get(m).id) + "." + Integer.toString(k) );
// //                     //         k++ ;
// //                     //     } 
// //                     //     l++ ; 
// //                     // }



                
                        
// //                         while (k < listClient.get(i).listP.get(j).nombre ){
// //                             while( l< listSupplier.get(n).listP.get(m).nombre ){
                        
// //                             listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) ); 
// //                             listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(n).listP.get(m).id) + "." + Integer.toString(l) );
// //                             l++ ;
// //                             }
// //                             k++;
                            
// //                         } 
                       
// //                         // k++ ;
                    
                    
// //                     m++ ;
// //                  }
// //                  j++ ;
// //             }
// //           }
// //          }
// //     // }
// //      //return listCut ;
// // //}


//  public void generate_cut(List <Client> listClient , List<Supplier> listSupplier , List<String> listCut){
    
//         //List<String> listCut = new ArrayList<>() ; 
//      //for(int i = 0 , n = 0 ; i<listClient.size() && n<listSupplier.size()  ; i++ , n++){
//          int i = 0;
//          int n = 0;
//          boolean value = false;

//      while(i<listClient.size() && n<listSupplier.size() ){
         
//         //  for(int n = 0 ; n < listSupplier.size() ; n++ ){
//             System.out.println("sizes are (cli,supp) " +listClient.size()+listSupplier.size() );
//             for(int  j = 0 ,  m = 0 ; j <listClient.get(i).listP.size() && m <listSupplier.get(n).listP.size(); j++ , m++){
           
//                    //if( n == listClient.get())
//                    int l =  0 ,k = 0 ;
//                     while (  k< listClient.get(i).listP.get(j).nombre && l  < listSupplier.get(n).listP.get(m).nombre  ){


           
//                        if( l    == listSupplier.get(n).listP.get(m).nombre  ){
//                            System.out.println("-- on est en LLLLLLLL") ;
//                              m++ ;
//                              l = 0 ;
//                             //n++;
//                             if(n == listSupplier.size())
//                              {
                                
//                                 System.out.println("-- on est en NNNNNNN ---") ;
//                                  value = true;
//                              }
                             
                
//                        }


//                          if( k   == listClient.get(i).listP.get(j).nombre ){
//                             j++ ;
//                             k = 0 ;
//                             //i++;
//                             if(i == listClient.size())
//                              {
                                 
//                                   System.out.println("-- on est en IIIIII    ---") ;
//                                  value = true;
//                              }
//                             System.out.println("    @@@     >>    " + Integer.toString(k));
//                             break ;
//                         }

//                         //  if( k    == listSupplier.get(n).listP.get(m).nombre && m < listCut.size() == 9 ){
//                         //     m++ ;
//                         //     k = 0 ;
//                         //     //break ;
//                         //   //System.out.println("***HOLA***");
//                         // }
                        
//                         //  if( k    == listSupplier.get(n).listP.get(m).nombre &&  listCut.size() == 9 ){
//                         //     listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(n).listP.get(m).id) + "." + Integer.toString(k) );
//                         //     break ;
//                         //   //System.out.println("***HOLA***");
//                         // }
                            
//                             listCut.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) );
//                             listCut.add("Supplier id = "  +Integer.toString(listSupplier.get(n).id) + " panneau = " +  Integer.toString(listSupplier.get(n).listP.get(m).id) + "." + Integer.toString(l) );
//                         //l < listClient.get(i).listP.get(j).nombre && listClient.get(i).id < listClient.size() - 1 
//                     //k++;
                           
//                     //System.out.println("***HOLA***");
//                     if(value == true)
//                         break;
//                     k++ ;
//                     l++;
//                     }
//                     if(value == true)
//                         break;

//                     if(j  - 1 == listClient.get(i).listP.size() ){
//                             i++ ;
//                         }

//                         if(m - 1  == listSupplier.get(n).listP.size() ){
//                             n++ ;
//                         }
                        
//             }


               
//      }
     

//  }

// //  int number(List<Su)




// // }
