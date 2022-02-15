package mypackage_es ; 

//import ./logic ;
import java.util.*;

public interface IWriter {
    List<String> data_cut = new ArrayList<>() ;
    public void writerXml(List<String> listCut)throws Exception ; 
     public void XMLwriter_svg( List<String> listCut_svg  ) throws Exception ;
}