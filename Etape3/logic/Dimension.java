package logic ;

 class Dimension{
    Float longueur ;
    Float largeur ;

    Dimension(Float  longueur , Float largeur){
        this.longueur = longueur ;
        this.largeur = largeur;
    }

    void setL(Float L){
        this.longueur = L;
    }
    void setl(Float l){
        this.largeur = l;
    }
    
    Float getl(){
      return largeur;
    }
    Float getL(){
      return longueur;
    }
}