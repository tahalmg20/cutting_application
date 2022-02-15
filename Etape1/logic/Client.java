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

 class Client extends Generable 
{

    Client(int id , List< Plank> listP){
       super(id , listP);
    }


    public void listInfo(List <Client> listClient , List<String> listInfo){
        for(int i = 0 ; i<listClient.size() ; i++){
            for(int j = 0 ; j<listClient.get(i).listP.size() ; j++){
                for(int k = 0 ; k<listClient.get(i).listP.get(j).nombre ; k++){
                    // listInfo.add("Client id = " +  Integer.toString(listClient.get(i).id) + " planche = " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) + " " );
                     listInfo.add("Client id " +  Integer.toString(listClient.get(i).id) + " planche " +  Integer.toString(listClient.get(i).listP.get(j).id) + "." + Integer.toString(k) + " " + Float.toString(listClient.get(i).listP.get(j).dim.longueur)  + " " + Float.toString(listClient.get(i).listP.get(j).dim.largeur));
            }
        }
    }
    }

    public void listDim(List <Client> listClient , List<String> listInfo  ){
        //List<String> listInfo = new ArrayList<>() ;
        for(int i = 0 ; i<listClient.size() ; i++){
            for(int j = 0 ; j<listClient.get(i).listP.size() ; j++){
                  for(int k = 0 ; k<listClient.get(i).listP.get(j).nombre ; k++){
               // System.out.println("listP >>   " + listClient.get(i).listP.get(j).nombre );
                listInfo.add(Float.toString(listClient.get(i).listP.get(j).dim.longueur)  + " " + Float.toString(listClient.get(i).listP.get(j).dim.largeur) + " ");
                }
            }
        }
        
    }
//     void setId(int id){
//         this.id = id;
//     }
    // int getId(){
    //     return id ;
    // }
//     List<Plank> getListPlanche(){
//         return listP ;
//      }

//     void addplank(Plank plank){
//         this.listP.add(plank);
//     }
//     void setListPlank(List<Plank>  listPlank){
//         this.listP = listPlank ; 
//     }
// }
}