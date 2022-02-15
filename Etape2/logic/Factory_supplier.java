package logic  ; 

import java.util.*;

 class Factory_supplier{

   public List<Supplier> generate (List<String> data){
        List<Supplier> listObjet = new ArrayList<>() ; 
        String user = data.get(1) ; 
         //System.out.println("user " + user) ;
        for(int index = 0 ; index < data.size() ; index++){
            List<String> user_data = new ArrayList<>() ; 
            int i = index+1 ;
            //System.out.println(data.get(index)+"/"+user);

            if(data.get(index) == user){
                while( i < data.size() && data.get(i) != user ){
                      //System.out.println("----------------");
                        user_data.add(data.get(i));
                        i++ ; 
                }
                Supplier g = create_user(user_data) ; 
               
                listObjet.add(g) ; 
            }
        }
        //System.out.println("size of listObjet " + listObjet.size()) ;
        return listObjet ;
    }
    public Supplier create_user(List<String> user_data ) { 
         //System.out.println("size of user_data in create_user > "+user_data.size());

            List<Pannel> listPannel= new ArrayList<>() ;
            //System.out.println("----create user: "+user_data.size());
            int id =  Integer.parseInt(user_data.get(0));
            String Pannel = user_data.get(1) ; 
            for(int index = 0 ; index < user_data.size() ; index++){
                List<String> Pannel_data = new ArrayList<>() ; 
                int i = index+1 ;
                if(user_data.get(index) == Pannel ){
                    while( i < user_data.size() && user_data.get(i) != Pannel ){
                        Pannel_data.add(user_data.get(i));
                        i++ ; 
                    }
                }
              
                Pannel p ;
            //System.out.println("sfdgsfd"+Pannel_data.get(0));
            if(Pannel_data.size()!=0){
                p = create_Pannel(Pannel_data ) ;
                listPannel.add(p) ; 
                }
            }
            Supplier g = new Supplier(id , listPannel) ; 
            
            return g ; 

        
    }



public Pannel create_Pannel(List<String> Pannel_data ) { 
    //System.out.println("heho"+Pannel_data.size());
        int id =  Integer.parseInt(Pannel_data.get(0)); 
        int number =  Integer.parseInt(Pannel_data.get(1));
        String date  =  Pannel_data.get(2);
        float price =  Float.parseFloat(Pannel_data.get(3));
        float L = 0 ;
        float l = 0 ; 
         Pannel p = new Pannel(0,0,null,(float)(0.0),new Dimension(L,l));
        //List<Pannel> listPannel= new ArrayList<>() ;
        for(int index = 0 ; index < Pannel_data.size() ; index++){
            if(Pannel_data.get(index) == "dim" ){
                L = Float.parseFloat(Pannel_data.get(index+1) );
                l = Float.parseFloat(Pannel_data.get(index+2) ) ; 
                Dimension dim = new Dimension(L , l) ; 
                p = new Pannel(id,number,date,price,dim);
                break ;
            }
            
            
        }
       
        return p ;
    }
}
        
      
  