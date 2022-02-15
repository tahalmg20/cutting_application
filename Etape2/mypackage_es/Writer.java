
package mypackage_es;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamWriter;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import logic.ConsoleColors ;



public class Writer implements IWriter{
	XMLStreamWriter writer;
    
		@Override
    public void writerXml(List<String> listCut ) throws Exception {
		String file = "decp.xml";
	
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		FileWriter output = new FileWriter(new File(file));
		writer = outputFactory.createXMLStreamWriter(output);
		
		writer.writeStartElement("decoupes");
		writer.writeCharacters("\n");
		
		
		
		for(int i = 0 ;i < listCut.size();i++){
			
				String []ary ; 
				ary = listCut.get(i).split(",") ; 
			
				
				writer.writeCharacters("\t");
				writer.writeStartElement("decoupe");
				writer.writeCharacters("\t");
				writer.writeCharacters("\n");
				/* client  */
				writer.writeCharacters("\t\t");
				writer.writeEmptyElement(ary[0]);
				writer.writeAttribute(ary[1],ary[2]);
				writer.writeAttribute(ary[3],ary[4]);
			
				/* fournisseur */ 
				writer.writeCharacters("\n");
				writer.writeCharacters("\t\t");
				writer.writeEmptyElement(ary[5]);
				writer.writeAttribute(ary[6], ary[7]);
				writer.writeAttribute(ary[8],ary[9]);


				/*Position */
				writer.writeCharacters("\n");
				writer.writeCharacters("\t\t");
				writer.writeEmptyElement("Position");
				writer.writeAttribute("x", "0");
				writer.writeAttribute("y","0");
			
			
				// end of file
					writer.writeCharacters("\n\t");
				writer.writeEndElement();
				writer.writeCharacters("\n");
				
			
				
		}
				writer.writeEndElement();
			
			writer.flush();
			writer.close();
			System.out.println( ConsoleColors.GREEN_BOLD +  " creation of file decp.xml " + ConsoleColors.RESET );

	}
	

	@Override
	 public void XMLwriter_svg( List<String> listCut_svg  ) throws Exception {
		
		
			
		
		for(int i = 0 ;i < listCut_svg.size();i++){
			String file = "cut_num_" + Integer.toString(i) + ".svg"  ;
	
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		FileWriter output = new FileWriter(new File(file));
				String []ary ; 
				ary = listCut_svg.get(i).split(" ") ; 
			
			
				String L_plank = ary[0] ;
				String l_plank = ary[1] ;
				String L_pannel = ary[2] ;
				String l_pannel  =  ary[3] ;
				String  x = "0" ; 
				String  y = "0" ; 
				output.write("<svg width=\"800\" height=\"600\" >");
				output.write("\n");
				output.write("\t");
				output.write("<rect   width ="+ "\""+ L_pannel +"\"" + " height = " + "\"" +l_pannel +"\"" + " style=\"fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)\" >") ;
				output.write("</rect>");
				output.write("\n");
				output.write("\t");
				output.write("	<rect   x =  " + "\""+ x +"\""+ " y=" + "\"" + y + "\"" + " width ="+ "\""+ L_plank +"\"" + " height = " + "\"" +l_plank +"\"" + " style=\"fill:rgb(0,255,255);stroke-width:5;stroke:rgb(0,0,0)\" >") ;
				output.write("</rect>");
				output.write("\n");
			

				output.write("\n");
				output.write("\t");
				
				output.write("</svg>");
				System.out.println( ConsoleColors.GREEN_BOLD + "creation of cut_num" + Integer.toString(i) + ".svg  done " + ConsoleColors.RESET );
				output.close() ;
			
			
		}
		           
	}



}


 