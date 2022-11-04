package media;

public class Dvd extends RessourceMultimedia {
    public void regarder(){
        System.out.println("Regarder DVD");
    }


    @Override
    public void consulter() {
        this.regarder();
    }
}
