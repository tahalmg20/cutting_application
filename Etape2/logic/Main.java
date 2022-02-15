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


import java.awt.Color;
import javax.swing.* ; 
import java.awt.event.* ;

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

       



    Cut cut =new Cut(0,0,0,0);
     List<String> listcl = new ArrayList<>() ; 
     List<String> listsupp = new ArrayList<>() ; 
      List<String> listcl_dim = new ArrayList<>() ; 
     List<String> listsupp_dim = new ArrayList<>() ;
      List<String> listCut = new ArrayList<>() ;
      List<String> listCut_svg = new ArrayList<>() ;

    
    Client cc = new Client(0,null);
    Supplier ss = new Supplier (0,null);
    cc.listInfo(listClient,listcl);
    ss.listInfo(listSupplier,listsupp);

    cc.listDim(listClient,listcl_dim);
    ss.listDim(listSupplier,listsupp_dim);

    cut.generate_cut(listcl ,listsupp , listCut);
    cut.generate_cut_svg(listcl_dim ,listsupp_dim , listCut_svg);
    
    Writer w = new Writer() ; 

       JFrame frame = new JFrame("Welcome to our Main test");
      final JTextArea textArea = new JTextArea();
      textArea.setBounds(50, 50, 180, 20);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 500);
      JButton button_svg = new JButton(" Press to Create svg files ");
       button_svg.setBackground(Color.BLUE);
      JButton button_xml = new JButton(" Press to Create xml file ") ;
      button_xml.setBackground(Color.GREEN);
      button_svg.setBounds(100, 100, 220, 40);
      button_xml.setBounds(100, 200, 220, 40);

      button_svg.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            textArea.setText(" svg creation Done");
          
           try{
              w.XMLwriter_svg(listCut_svg); 
         }catch (Exception f){
             f.printStackTrace();
         }
            //new Solution(listClient, listSupplier, cuts);
        }
        
      });
      button_xml.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            textArea.setText(" xml creation Done");
           
           try{
              w.writerXml(listCut); 
         }catch (Exception f){
             f.printStackTrace();
         }
            //new Solution(listClient, listSupplier, cuts);
        }
        
      });
      frame.add(button_svg);
      frame.add(button_xml);
      frame.add(textArea);
      frame.setLayout(null);
      frame.setVisible(true);
     
   
    }
    
}


