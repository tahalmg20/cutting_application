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

//import es.Read ; 

 class Main{


    public static void main(String[] args) throws Exception


    {
        String  file_client = "../clients.xml" ; 
        String  file_supplier =   "../fournisseurs.xml" ; 
        Read read = new Read() ;
        
        List<String> data_client = new ArrayList<>() ; 
        List<String> data_supplier = new ArrayList<>() ; 
       
        List <Client> listClient = new ArrayList<>() ;
        List <Supplier> listSupplier = new ArrayList<>() ;

        read.readXml(file_client , data_client) ;
        read.readXml(file_supplier , data_supplier) ;
      
        Factory_client fc = new Factory_client() ;
        Factory_supplier fs = new Factory_supplier() ;
        
        listClient = fc.generate(data_client);
        listSupplier = fs.generate(data_supplier) ;

       

    
  
        System.out.println("Size of listClient  >   " + listClient.size());
         System.out.println("Size of listSupplier  >   " + listSupplier.size());
      
       


       for(int i = 0 ; i < listClient.size();i++){
        
        listClient.get(i).check_is_valid(listClient.get(i).listP ,listClient.get(i).id,listClient.get(i)) ;
       }
         /*     validation Suppliers */
       System.out.println("we have " +  ConsoleColors.BLUE_BOLD + Integer.toString(listSupplier.size()) + ConsoleColors.RESET + ConsoleColors.GREEN_UNDERLINED + " suppliers " + ConsoleColors.RESET +" \n");
       for(int i = 0 ; i < listSupplier.size();i++){
            
            listClient.get(i).check_is_valid(listSupplier.get(i).listP ,listSupplier.get(i).id, listSupplier.get(i)) ;
       }


    }

    
}


