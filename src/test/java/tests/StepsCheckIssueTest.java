package tests;

import org.junit.jupiter.api.Test;
import pages.CheckIssuePages;

import static io.qameta.allure.Allure.step;


public class StepsCheckIssueTest extends config.TestBase {

    String  url = "https://github.com",
            repository = "amd/scalapack",
            issueNumber = "4";

    CheckIssuePages act = new CheckIssuePages();

    @Test
    void issueTestWithSteps() {
        step("Open the main page", (s) -> {
            act.openPage(url);
        });
        step("Find "+repository+" repository", (s) -> {
            act.findRepository(repository);
        });
        step("Open the Issue tab", (s) -> {
            act.openIssuesTab();
        });
        step("Verify Issue number ("+ issueNumber +")", (s) -> {
            act.checkIssueNumber(issueNumber);
        });
    }

}
