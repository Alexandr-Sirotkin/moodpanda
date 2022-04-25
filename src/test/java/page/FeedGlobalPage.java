package page;

import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

public class FeedGlobalPage {

  private static final String  YOUR_DASHBOARD_LINK = "//a[@href='/dashboard']";

  public DashboardPage clickYourDashboardLink() {
    $(By.xpath(YOUR_DASHBOARD_LINK)).click();
    return new DashboardPage();
  }
}
