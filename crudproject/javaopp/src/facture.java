public class facture {
    int idclient;
    String name;
    int prixtotal , prixunitaire , quantite ;

    public facture(int id, String nom ,int pt, int pu, int q ) {

        idclient = id;
        name = nom;
        prixtotal = pt ;
        prixunitaire = pu ;
        quantite = q ;

    }

    public void  calcul(){
        prixtotal= prixunitaire*quantite;
        System.out.println(prixtotal);
    }


}