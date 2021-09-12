package StepDefinition;

import Ui_Pages.youTubePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class youTube {

    youTubePage youTubePage = new youTubePage();

    @Given("^User Opens youtube$")
    public void openYouTube() {
        System.out.println("Ayushman");
        //youTubePage.openYouTube();
    }

    @And("^Search (Prashant Dhawan|Ayushman|Parth|Automation Videos)$")
    public void searchInYouTube(String Search) {
        //youTubePage.searchInYouTube(Search);
    }

}
