package StepDefinations;

import Ui_Pages.youTubePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class youTube {

    youTubePage youTubePage = new youTubePage();

    @Given("User Opens youtube")
    public void openYouTube() {
        youTubePage.openYouTube();
    }

    @And("Search (Prashant Dhawan|Ayushman|Parth)$")
    public void searchInYouTube(String Search) {
        youTubePage.searchInYouTube(Search);
    }

}
