package ohtu.verkkokauppa;

public class Viitegeneraattori implements ViitegeneraattorinRajapinta {
    
    private int seuraava;
    public Viitegeneraattori() {
        this.seuraava = 1;
    }
//
//    private static Viitegeneraattori instanssi;
//
//    public static Viitegeneraattori getInstance() {
//        if (instanssi == null) {
//            instanssi = new Viitegeneraattori();
//        }
//
//        return instanssi;
//    }
//    
//    private int seuraava;
//    
//    private Viitegeneraattori(){
//        seuraava = 1;    
//    }
    
    @Override
    public int uusi(){
        return seuraava++;
    }
}
