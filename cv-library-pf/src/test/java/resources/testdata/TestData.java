package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="resultData")
    public Object[][] getData() {

        Object[][] data = new Object[][]{

                {"Tester", "Harrow, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                {"Test manager", "London","5 miles","30000","40000","Per annum","Permanent" ,"Permanent Test Manager jobs in London"}


        };
       // log.info("data provider "+data.toString()+"<br>");
        return data;
    }

}
/*
|jobTitle |location | distance |salaryMin |salaryMax |salaryType |jobType |result |
|Tester |Harrow | up to 5 miles |30000 |500000 |Per annum | Permanent |Permanent
Tester jobs in Harrow on the Hill|
 */