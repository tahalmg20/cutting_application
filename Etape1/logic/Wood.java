
package logic ;
import java.util.List;
import java.util.Locale;

import org.w3c.dom.DOMException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;

  class Wood{
    int id;
    int nombre ;
    String date;
    float prix ;
    Dimension dim ;

Wood(int id , int nombre ,String date ,Float prix , Dimension dim){
        this.id = id ;
        this.nombre = nombre;
        this.date = date;
        this.prix = prix;
        this.dim = dim ; 
    }

    // Wood(){
    //     this.id = id ;
    //     this.nombre = nombre;
    //     this.date = date;
    //     this.prix = prix;
    //     this.dim = dim ; 
    // }

    void setId(int id){
        this.id = id ;
    }

    void setNombre(int nombre){
        this.nombre = nombre;
    }

    void setDate(String date){
        this.date = date;
    }

    void setPrix(Float prix){
        this.prix = prix ;
    }
    void setDim(Dimension dim){
        this.dim = dim;
    }

    Dimension getDim(){
        return dim ;
    }
    
    String getDate(){
        return date ; 
    }
     int getId(){
        return  id ;
     }

    int getNombre(){
        return nombre ;
     }

    // void setDate(String date){
    //     this.date = date;
    // }

    Float getPrix(){
        return prix ;
    }
    public void infoDim(Wood wood , String[]info ){
        //String [] info  = new String[2] ; 
        info[0] = Float.toString(wood.getDim().getL());
        info[1] = Float.toString(wood.getDim().getl()) ; 
        //return info ;
    }

    
// public String[] isValide(int id , int price , int number , int L , int l );
// {
//     String format ="dd.mm.yy" ; 
//     Locale locale = Locale.ENGLISH ; 
//     LocalDateTime ldt = null ;
//     DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format,locale) ; 
//     String[] invalide  ;
//     invalide = new String[4] ;
    
//     String value = obj.getDate(); 
//     int i = 1 ;
//     int validateDate = 0 ; 
//     if(obj.getPrix() < 0 ){
//         invalide[i] = "price" ; 
//         i++ ;
//     }
//     if(obj.getDim().getL() < 0 && obj.getDim().getl() < 0 ){
//         invalide[i] = "Dimension" ; 
//         i++ ; 
//     }
//     if(obj.getId() < 0 ){
//         invalide[i] = "id" ; 
//         i++ ; 
//     }
//     if(obj.getNombre() < 0 ){
//         invalide[i] = "number" ; 
//         i++ ; 
//     }
//     return invalide ;

// }

//     try{
//         ldt = LocalDateTime.parse(value, formatter) ; 
//         String result = ldt.format(formatter) ; 
//         //return String.valueOf(result.equals(value)).split("");
//     } catch (DateTimeParseException e ) {
//         try{
//             LocalDate ld = LocalDate.parse(value,formatter);
//             String result = ld.format(formatter) ;
//             //return String.valueOf(result.equals(value)).split(""); 
//         }   catch (DateTimeParseException exp ){
//                 try{
//                 LocalTime lt = LocalTime.parse(value,formatter) ; 
//                 String result = lt.format(formatter);
//                // return String.valueOf(result.equals(value)).split("");
//             }   catch (DateTimeParseException e2 ){

//                 }

//             }
//         }
//        // System.out.println("hahowa ki9ra f invalide ");
//         return invalide ;
//     }
    

 }

