package logic  ; 

import java.util.*;

 class Factory_client {

   public List<Client> generate (List<String> data){
        List<Client> listObjet = new ArrayList<>() ; 
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
                Client g = create_user(user_data) ; 
               
                listObjet.add(g) ; 
            }
        }
        //System.out.println("size of listObjet " + listObjet.size()) ;
        return listObjet ;
    }
    public Client create_user(List<String> user_data ) { 
         //System.out.println("size of user_data in create_user > "+user_data.size());

            List<Plank> listPlank= new ArrayList<>() ;
            //System.out.println("----create user: "+user_data.size());
            int id =  Integer.parseInt(user_data.get(0));
            String Plank = user_data.get(1) ; 
            //System.out.println("-*-*-* String Plank  " + user_data.get(1));
           //System.out.println("-*-*-* user data size " + user_data.size());
            for(int index = 1 ; index < user_data.size() ; index++){
               
                List<String> Plank_data = new ArrayList<>() ; 
                int i = index+1 ;
                if(user_data.get(index) == Plank ){
                    
                    while( i < user_data.size() && user_data.get(i) != Plank ){
                        Plank_data.add(user_data.get(i));
                        i++ ; 
                    }
               //if(Plank_data.size()!=0){
                Plank p ;
                //System.out.println( index + " eme iteration " +  "--fen---before---create_plank > size   *" + listPlank.size()) ;
                p = create_Plank(Plank_data ) ;
                listPlank.add(p) ;
                //System.out.println(  index + " eme iteration " + "--fen---after---create_plank > size   *" + listPlank.size()) ;
               // }
                //System.out.println("--fen-- size   *" + listPlank.size()) ;
                    //}
                }
              
               
           // System.out.println("sfdgsfd"+Plank_data.get(0));
            // if(Plank_data.size()!=0){
            //     Plank p  ;
            //     p = create_Plank(Plank_data ) ;
            //     listPlank.add(p) ;
            //     System.out.println("--fen-- *") ;
            //     }
            }
            Client g = new Client(id , listPlank) ; 
            
            return g ; 

        
    }



public Plank create_Plank(List<String> Plank_data ) { 
    //System.out.println("heho "+Plank_data.size());
        int id =  Integer.parseInt(Plank_data.get(0)); 
        int number =  Integer.parseInt(Plank_data.get(1));
        String date  =  Plank_data.get(2);
        float price =  Float.parseFloat(Plank_data.get(3));
        float L = 0 ;
        float l = 0 ; 
         Plank p = new Plank(0,0,null,(float)(0.0),new Dimension(L,l));
        //List<Plank> listPlank= new ArrayList<>() ;
        for(int index = 0 ; index < Plank_data.size() ; index++){
            if(Plank_data.get(index) == "dim" ){
                L = Float.parseFloat(Plank_data.get(index+1) );
                l = Float.parseFloat(Plank_data.get(index+2) ) ; 
                Dimension dim = new Dimension(L , l) ; 
                p = new Plank(id,number,date,price,dim);
                //break ;
            }
            
            
        }
       
        return p ;
    }
}
        
      
  