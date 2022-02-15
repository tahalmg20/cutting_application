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

 class Test{


    public static void main(String[] args) 


    {

        //String  file_client = "../testXML/clientsd.xml" ; 
        //String  file_supplier = "../../fournisseurs.xml" ; 
        String  file_client = "clients1.xml" ; 
        Read read = new Read() ;
        List<String> data = new ArrayList<>() ; 
        // read.readXml(file , data) ;
        // for(int i = 0 ; i <data.size();i++){
        //     System.out.println("infos   >>  " + data.get(i));
        // }

    //     float L = 0 ; 
    //     float l = 0 ;
    //     Wood w = new Wood(0,0,null,(float)(0.0),new Dimension(L,l)) ;
             List<String> data_client = new ArrayList<>() ; 
    //     List<String> data_supplier = new ArrayList<>() ; 
    //     List<Wood> listvide = new ArrayList<>() ;
    //     //List <Generable> listObject = new ArrayList<>() ; 
             List <Client> listClient = new ArrayList<>() ;
    //     List <Supplier> listSupplier = new ArrayList<>() ;
           read.readXml(file_client , data_client) ;
    //     read.readXml(file_supplier , data_supplier) ;
    //    // Generable g = new Generable(0 , listvide); 
         Factory_client fc = new Factory_client() ;
    //     Factory_supplier fs = new Factory_supplier() ;
    //     //listObject = g.generate(data) ; 
          listClient = fc.generate(data_client);
    //     listSupplier = fs.generate(data_supplier) ;

    //     // System.out.println("Size of listObject >   " + listObject.size());
    //     // System.out.println("Size of listObjectin Client 0 >  " + listObject.get(0).listP.size());
    //     // System.out.println("Size of listObject in Client 1 >  " + listObject.get(1).listP.size());

        System.out.println("Size of listClient  >   " + listClient.size());
         System.out.println("Size of listwood in Client 1 >  " + listClient.get(0).listP.size());
    //     System.out.println("Size of listwood in Client 1 >  " + listClient.get(1).listP.size());
            System.out.println("----------***** id   " + listClient.get(1).listP.get(0).id   + "*** date  > " +listClient.get(1).listP.get(0).date ) ;
    //     System.out.println("Size of listSupplier  >   " + listSupplier.size());
    //     System.out.println("Size of 0 element in listpannel in listSupplier  >   " + listSupplier.get(0).listP.size());
    //     //System.out.println("Size of listwood in Client 0 >  " + listClient.get(0).listP.size());
    //     //System.out.println("Size of listwood in Client 1 >  " + listClient.get(1).listP.size());
         
    //    System.out.println("--------------------client 1   > id >   " + listClient.get(1).listP.get(0).nombre);
         //for(int index = 0 ; index < listClient.size() ; index++){
           // for(int j = 0 ; j < listClient.get(index).listP.size(); j++){
             // System.out.println("infos if its valid  > : " + w.isValid(listClient.get(index).listP.get(j)) );
             //System.out.println("infos if its valid  > : " + w.isValid(listClient.get(index).listP.get(j)) );
           // }
       //  }
         System.out.println("type of the object in listPlank is ? >>  : " + listClient.get(0).listP.get(0).getClass());

    //     // System.out.println("type of the object in listwood in listObject is ? >>  : " + listObject.get(0).listP.get(0).getClass());
    //     // System.out.println("test of instance of ? >>  : " + (listObject.get(0) instanceof Client ));
    //    // Generable l = new Client(0,null);
    //    // System.out.println("test of generabel null instance of ? >>  : " + (l  instanceof Client ));

    //    String [] test ;
    //    test = new String[4] ; 
    //    List <String> list_invalid = new ArrayList <>() ; 
    //    //listClient.get(0).check_is_valid(listClient.get(0).listP) ;
    //    //System.out.println( "la dimension de premier element   >> " + listClient.get(0).listP.get(0).dim.longueur ) ;
    //    //test = invalidate_result(listClient.get(0).listP.get(0).id ,listClient.get(0).listP.get(0).prix ,listClient.get(0).listP.get(0).nombre,listClient.get(0).listP.get(0).dim.longueur ,listClient.get(0).listP.get(0).dim.largeur);
    }
    
}