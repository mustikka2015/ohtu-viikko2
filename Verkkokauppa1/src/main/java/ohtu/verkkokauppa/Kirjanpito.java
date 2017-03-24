
package ohtu.verkkokauppa;

import java.util.ArrayList;
import java.util.List;

public class Kirjanpito implements KirjanpidonRajapinta {
//    private static Kirjanpito instance;
    private ArrayList<String> tapahtumat;
    
    public Kirjanpito() {
        
        this.tapahtumat = new ArrayList<String>();
//        if ( instance==null) {
//            instance = new Kirjanpito();
//        }
        
//        return instance;
    }
    
//    private ArrayList<String> tapahtumat;

//    private Kirjanpito() {
//        tapahtumat = new ArrayList<String>();
//    }
    
    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }       
}
