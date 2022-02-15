
package logic ;
import java.util.*;

import org.w3c.dom.DOMException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;




 class Validate implements IValidate{    //implements IValidate

   
    public  String invalidate_result(int id , float price , int number , String date,Dimension dim){
         //String[] invalide ["","","",""] ;
         String[] invalide  ;
        invalide = new String[6];
        invalide[0] = validable_id(id);
        invalide[1] = validable_number(number);
        invalide[2] = validable_price(price);
        invalide[3] = validable_date(date);
        invalide[4] = validable_dimension(dim.longueur ,dim.largeur);
        // for( int i = 0 ; i< 5 ; i++){
        //     if (invalide[i] != ""){
        //         invalide[i] = ConsoleColors.RED_BOLD  + invalide[i] +ConsoleColors.RESET   ; 
        //     }
        // }
     
        invalide[5] = ConsoleColors.RESET ;
        StringBuilder builder = new StringBuilder();
        for(String s : invalide) {
            builder.append(s);
        }
        String str = builder.toString();
        if(str.isEmpty() == true){
           
            str =  ConsoleColors.YELLOW_BOLD + "check is Valid " +ConsoleColors.RESET ; 
        }
         //System.out.println("hola " + str.length() )  ;
        //System.out.println("Array toSTRING -------->>>> " + str);

          
        return str ;
        
    }

    public String  validable_price(float price){
        String str = "" ;
        if(price < 0 ){
            str = ConsoleColors.RED_BOLD +"Price" +ConsoleColors.RESET; 
            
        }
        return str ; 
    }
     public String  validable_id(int id){
        String str = "" ;
        if(id < 0 ){
            str =   ConsoleColors.RED_BOLD +"ID" +ConsoleColors.RESET; 
        }
       
         return str ; 
    }

     public String  validable_number(int number){
        String str = "" ;
        if(number< 0 ){
            str =  ConsoleColors.RED_BOLD +"Price" +ConsoleColors.RESET; 
        }
         return str ; 
    }
     public String  validable_dimension(float L , float l){
        String str = "" ;
        if(l < 0 || L < 0 ){
            str =  ConsoleColors.RED_BOLD +"" +ConsoleColors.RESET; 
        }
         return str ; 
    }

    public String validable_date(String value){
        String format ="dd.mm.yy" ; 
        Locale locale = Locale.ENGLISH ; 
        LocalDateTime ldt = null ;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format,locale) ; 
        boolean bool = true ; 
         String str =  "";
          
        

        try{
            ldt = LocalDateTime.parse(value, formatter) ; 
            String result = ldt.format(formatter) ; 
            bool = result.equals(value) ; 
            //return String.valueOf(result.equals(value)).split("");
        } catch (DateTimeParseException e ) {
            try{
                LocalDate ld = LocalDate.parse(value,formatter);
                String result = ld.format(formatter) ;
                bool = result.equals(value) ; 
                //return String.valueOf(result.equals(value)).split(""); 
            }   catch (DateTimeParseException exp ){
                    try{
                    LocalTime lt = LocalTime.parse(value,formatter) ; 
                    String result = lt.format(formatter);
                    bool = result.equals(value) ; 
                // return String.valueOf(result.equals(value)).split("");
                }   catch (DateTimeParseException e2 ){

                    }

                }
            }
        // System.out.println("hahowa ki9ra f invalide ");
           if(bool == false){
               str ="Date";
           }
           return str ; 
        }
    

}