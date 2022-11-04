package media;

public class Mp3 extends RessourceMultimedia {
    public void ecouter(){
        System.out.println("ecouter MP3");
    }


    @Override
    public void consulter() {
        this.ecouter();
    }
}
