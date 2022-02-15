
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
			//for(int j = 0 ; j <listCut.get(i).size(); j++ ) {
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

				System.out.println("-----hola---- ");
			//	writer.writeCharacters("\n");
			//	writer.writeCharacters("\t\t");
				// writer.writeEmptyElement("Position");
				// writer.writeAttribute("x",Float.toString( listSupplier.get(i).listP.get(j).dim.longueur));
				// writer.writeAttribute("y", Float.toString(listSupplier.get(i).listP.get(j).dim.largeur));
				// end of file
					writer.writeCharacters("\n\t");
				writer.writeEndElement();
				writer.writeCharacters("\n");
				
			
				//writer.writeEndElement();
		}
				writer.writeEndElement();
			//close
			writer.flush();
			writer.close();
	}
	//  public void XMLwriter_svg( List<String> listCut_svg  ) throws Exception {
	// 	String file = "test.svg";
	
	// 	XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
	// 	FileWriter output = new FileWriter(new File(file));
	// 	writer = outputFactory.createXMLStreamWriter(output);
		
		

	// 	writer.writeStartDocument();
	// 	String L_plank = Float.toString(plank.dim.longueul); 
	// 	String l_plank = Float.toString(plank.dim.largeur) ; 
	// 	String L_pannel =  Float.toString(pannel.dim.longueur);
	// 	String l_pannel  =  Float.toString(pannel.dim.largeur) ; 

	// 	output.write("<svg width=\"400\" height=\"400\" >");
	// 	output.write("\n");
	// 	output.write("\t");
	// 	output.write("<rect width ="+ "\""+ L_plank +"\"" + " height = " + "\"" +l_plank +"\"" + " style=\"fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)\" >") ;
	// 	output.write("</rect>");
	// 	output.write("\n");
	// 	output.write("\t");
	// 	output.write("	<rect width ="+ "\""+ L_pannel +"\"" + " height = " + "\"" +l_pannel +"\"" + " style=\"fill:rgb(0,255,255);stroke-width:5;stroke:rgb(0,0,0)\" >") ;
	// 	output.write("</rect>");
	// 	output.write("\n");
	// 	output.write("\t");
	// 	//writer.write(<rect height = "L_pannel" height = "l_pannel"style="fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)">) ;
	// 	//output.write("</rect>");

	// 	output.write("\n");
	// 	output.write("\t");
	// 	//output.write("</rect>");
	// 	output.write("</svg>");
	// 	// output.write("</svg>");
	// 	// output.write("</svg>");
	// 	output.close() ;
	// 	//output.fflush();
		
	// }


	@Override
	 public void XMLwriter_svg( List<String> listCut_svg  ) throws Exception {
		
		//writer = outputFactory.createXMLStreamWriter(output);
			
		
		for(int i = 0 ;i < listCut_svg.size();i++){
			String file = "test.svg_" + i ;
	
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		FileWriter output = new FileWriter(new File(file));
			//for(int j = 0 ; j <listCut.get(i).size(); j++ ) {
				String []ary ; 
				ary = listCut_svg.get(i).split(" ") ; 
				System.out.println("SPLIT IN SVG >>>>>   " + Arrays.toString(ary));
				//writer.writeStartDocument();
				String L_plank = ary[0] ;
				String l_plank = ary[1] ;
				String L_pannel = ary[2] ;
				String l_pannel  =  ary[3] ;

				output.write("<svg width=\"800\" height=\"600\" >");
				output.write("\n");
				output.write("\t");
				output.write("<rect width ="+ "\""+ L_pannel +"\"" + " height = " + "\"" +l_pannel +"\"" + " style=\"fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)\" >") ;
				output.write("</rect>");
				output.write("\n");
				output.write("\t");
				output.write("	<rect width ="+ "\""+ L_plank +"\"" + " height = " + "\"" +l_plank +"\"" + " style=\"fill:rgb(0,255,255);stroke-width:5;stroke:rgb(0,0,0)\" >") ;
				output.write("</rect>");
				output.write("\n");
				output.write("\t");
				//writer.write(<rect height = "L_pannel" height = "l_pannel"style="fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)">) ;
				//output.write("</rect>");

				output.write("\n");
				output.write("\t");
				//output.write("</rect>");
				output.write("</svg>");
				// output.write("</svg>");
				// output.write("</svg>");
				output.close() ;
				//output.fflush();
		}
		           
	}



}


 