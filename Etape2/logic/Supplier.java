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


class Supplier extends Generable 
{

    Supplier(int id , List< Pannel> listP){
       super(id , listP);
    }


    public void listInfo(List <Supplier> listSupplier , List<String> listInfo){
        
        for(int i = 0 ; i<listSupplier.size() ; i++){
            for(int j = 0 ; j<listSupplier.get(i).listP.size() ; j++){
                for(int k = 0 ; k<listSupplier.get(i).listP.get(j).nombre ; k++){
                    listInfo.add("Supplier id " +  Integer.toString(listSupplier.get(i).id) + " panneau " +  Integer.toString(listSupplier.get(i).listP.get(j).id) + "." + Integer.toString(k) + " " + Float.toString(listSupplier.get(i).listP.get(j).dim.longueur)  + " " +  Float.toString(listSupplier.get(i).listP.get(j).dim.largeur) );
            }
        }
    }
    }


    public void listDim(List <Supplier> listSupplier, List<String> listInfo ){
         //List<String> listInfo = new ArrayList<>() ;
        for(int i = 0 ; i<listSupplier.size() ; i++){
            for(int j = 0 ; j<listSupplier.get(i).listP.size() ; j++){
                 for(int k = 0 ; k<listSupplier.get(i).listP.get(j).nombre ; k++){
                    // listInfo.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) + " " );
                    listInfo.add(Float.toString(listSupplier.get(i).listP.get(j).dim.longueur)  +" " +  Float.toString(listSupplier.get(i).listP.get(j).dim.largeur) );
                 }
            }
        }
       
    }

}
//     void setId(int id){
//         this.id = id;
//     }

//     void addplank(Pannel pannel){
//         this.listP.add(pannel);
//     }
// }s
