import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MommifierTest {

    private Mommyfier mommyfier;

    @Before
    public void setUp() throws Exception {
        mommyfier = new Mommyfier();
    }

    @Test
    public void shouldNotMommifierEmptyString() throws Exception {
        Mommyfier mommyfier = new Mommyfier();
        assertEquals("", mommyfier.mommyfy(""));
    }

    @Test
    public void shouldNotMommifierConsonantString() throws Exception {
        assertEquals("s", mommyfier.mommyfy("s"));
    }

    @Test
    public void shouldMommifierVowel() throws Exception {
        assertEquals("mommy", mommyfier.mommyfy("a"));
    }

    @Test
    public void shouldNotMommifierStringWithoutVowel() throws Exception {
        assertEquals("xyz", mommyfier.mommyfy("xyz"));
    }

    @Test
    public void shouldMommifierStringWithSingleVowel() throws Exception {
        assertEquals("hmommys", mommyfier.mommyfy("his"));
    }

    @Test
    public void shouldMommifierStringWithContinousVowel() throws Exception {
        assertEquals("hmommyd", mommyfier.mommyfy("head"));
    }

    @Test
    public void shouldMommifierStringWithSeveralVowel() throws Exception {
        assertEquals("mommyhmommydmommy", mommyfier.mommyfy("aheada"));
    }

    @Test
    public void shouldNotMommifierStringWithVowelCountNotMoreThanThirtyPercent() throws Exception {
        assertEquals("ahihhxyzbde", mommyfier.mommyfy("ahihhxyzbde"));
    }
}
