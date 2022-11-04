package media;

public class LecteurMultimedia {
    public LecteurMultimedia() {
    }

    public void consulter(RessourceMultimedia rs){
        rs.consulter();

    }

    public static void main(String[] args) {

        LecteurMultimedia lm = new LecteurMultimedia();
        lm.consulter(new Pdf());
        lm.consulter(new Dvd());
        lm.consulter(new Mp3());


    }
}
