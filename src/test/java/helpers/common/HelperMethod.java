package helpers.common;

import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class HelperMethod {

    public static void checkStatus(Response res, int statusCode) {
        assertEquals("Status Check Fail!", statusCode, res.getStatusCode());
    }
}
