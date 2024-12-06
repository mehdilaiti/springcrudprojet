public class Main {
    public static void main(String[] args) {
        facture fct = new facture(1, "eau" , 12 , 45 , 16);
        System.out.println(fct.idclient  +  fct.name);

      fct.calcul();
    }
}