package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {

    public StatisticsTest() {

    }

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    Statistics stats;

    @Before
    public void setUp() {
        // luodaan Staatistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void searchTest() {
        Player pelaaja = stats.search("Semenko");
        String nimi = pelaaja.getName();
        assertEquals("Semenko", nimi);
    }

    @Test
    public void searchNullTest() {
        Player pelaaja = stats.search("Selanne");

        assertEquals(null, pelaaja);
    }

    @Test
    public void teamOikeaMaaraPelaajiaTest() {
        String joukkue = "EDM";
        List<Player> testilista = stats.team(joukkue);
        int koko = testilista.size();
        assertEquals(3, koko);

    }

    @Test
    public void teamOikeaPelaajaTest() {
        String joukkue = "PIT";
        List<Player> testilista = stats.team(joukkue);
        String nimi = testilista.get(0).getName();
        assertEquals(nimi, "Lemieux");

    }

    @Test
    public void topScorersOikeaNimiTest() {
        List<Player> parhaat = stats.topScorers(1);
        String nimi = parhaat.get(0).getName();
        assertEquals(nimi, "Gretzky");
    }


}
