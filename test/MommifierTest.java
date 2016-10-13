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
    public void shouldNotMommifierStringWithNoVowel() throws Exception {
        assertEquals("xyz", mommyfier.mommyfy("xyz"));
    }

    @Test
    public void shouldMommifierStringWithVowel() throws Exception {
        assertEquals("hmommys", mommyfier.mommyfy("his"));
    }

    @Test
    public void shouldMommifierStringWithTwoVowel() throws Exception {
        assertEquals("hmommyd", mommyfier.mommyfy("head"));
    }
}
