package mypackage_es ;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


 
public class Read implements IRead 
{
    
        //System.out.println("Client ID > : " + clients.get(0).getId());

        // System.out.println("LIST IS  :  " + clients.size());
        // System.out.println("* Client ID > : " + clients.get(0).getId());
        // System.out.println("** Client >  planche >  id " + clients.get(0).getListPlanche().get(0).getInfo().getId() );
        // System.out.println("** Client > planche > nombre  " + clients.get(0).getListPlanche().get(0).getInfo().getNombre());
        // System.out.println("** Client > planche > Date >> " + clients.get(0).getListPlanche().get(0).getInfo().getDate()) ; 
        // System.out.println("*** Client > sa planche > sa longueur   : > " + clients.get(0).getListPlanche().get(0).getInfo().getDim().getL());
        // System.out.println("*** Client > sa planche > sa largeur   : > " + clients.get(0).getListPlanche().get(0).getInfo().getDim().getl());
      
    
        
       public void readXml(String filename,List<String> data)
        {
            
          
            try
            {
                FileInputStream file = new FileInputStream(filename);
                XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(file);
                while(reader.hasNext())
                {
                     // System.out.println("len of reader : " + reader.getLength());
                        // System.out.println("READER IS ON : " + reader.getName().toString());

                    if(reader.next() == XMLStreamConstants.START_ELEMENT)
                    {
                        data.add(reader.getName().toString());
                        for(int index = 0 ; index < reader.getAttributeCount() ; index++){
                            data.add(reader.getAttributeValue(index));
                        }
                    }
                }
            }
                catch (FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (XMLStreamException e)
                {
                    e.printStackTrace();
                }
           
            
        }

    
}