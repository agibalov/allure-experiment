package me.loki2302;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@Title("The Tests")
@Description("Some fancy tests here")
public class AppTest {
    @Title("Check if 1 and 2 is actually 3")
    @Description("Adding numbers, test one")
    @Features("The Feature One")
    @Issues({@Issue("MYISSUE-1"), @Issue("MYISSUE-2")})
    @TestCaseId("TESTCASE-111")
    @Test
    public void oneAndTwoShouldBeThree() {
        log("About to add 1 and 2...");
        assertEquals(3, 1 + 2);
        log("Added 1 and 2");
    }

    @Title("Check if 2 and 3 is actually 5")
    @Description("Adding numbers, test two")
    @Features("The Feature One")
    @TestCaseId("TESTCASE-111")
    @Test
    public void twoAndThreeShouldBeFive() {
        assertEquals(5, 2 + 3);
        attachment();
    }

    @Attachment(value = "dummy.html", type = "text/html")
    public String attachment() {
        return "<p>Hello there " + new Date() + "</p>";
    }

    @Step("{0}")
    private void log(String what) {}
}
