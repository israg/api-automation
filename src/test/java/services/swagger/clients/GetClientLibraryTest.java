package services.swagger.clients;

import helpers.common.HelperMethod;
import helpers.swagger.SwaggerGeneratorHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetClientLibraryTest {

    SwaggerGeneratorHelper swaggerGeneratorHelper = new SwaggerGeneratorHelper();
    String language = "ada";
    String keyName = "test";
    String type = "token";
    String value = "test";

    @BeforeTest
    public void background() {
        Response generateClientResponse = swaggerGeneratorHelper.generateClientLibrary(language, keyName, type, value);
    }

    @Test
    public void getClientLibraryHappyPath() {
        Response response = swaggerGeneratorHelper.getClientsByLanguage(language);
        HelperMethod.checkStatus(response, 200);

        Assert.assertEquals(response.jsonPath().getString("projectName.description"), "GNAT project name", "Description value is not as expected");
    }
}
