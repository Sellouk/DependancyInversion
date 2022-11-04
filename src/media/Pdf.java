package media;

public class Pdf extends RessourceMultimedia {

    public void afficher(){
        System.out.println("afficher Pdf");
    }


    @Override
    public void consulter() {
        this.afficher();
    }
}
