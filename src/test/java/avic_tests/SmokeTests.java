package avic_tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTests {

    @Test
    public void CheckTextNextToImageOnImagePage () {
        getHomePage().clickButtonToImagePage();
        assertEquals(getImagePAge().textImageOnImagePage(), "Зображення");
    }
}
