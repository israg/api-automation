package services.swagger.clients;

import constant.SwaggerConstant;
import helpers.common.HelperMethod;
import helpers.swagger.SwaggerGeneratorHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GenerateClientLibraryTest {

    SwaggerGeneratorHelper swaggerGeneratorHelper = new SwaggerGeneratorHelper();
    String language = "ada";
    String keyName = "test";
    String type = "token";
    String value = "test";

    @Test
    public void generateClientLibraryError() {
        Response response = swaggerGeneratorHelper.generateClientLibrary(language, keyName, type, value);
        HelperMethod.checkStatus(response, SwaggerConstant.unknownError.statusCode);

        Assert.assertEquals(response.jsonPath().getString("type"), SwaggerConstant.unknownError.type);
        Assert.assertEquals(response.jsonPath().getString("message"), SwaggerConstant.unknownError.message);
    }

    @Test(dataProvider = "generateClientLibraryFail")
    public void generateClientLibraryFail(String language, String keyName, String type, String value, int statusCode, String errorType, String errorMessage) {
        Response response = swaggerGeneratorHelper.generateClientLibrary(language, keyName, type, value);
        HelperMethod.checkStatus(response, statusCode);

        Assert.assertEquals(response.jsonPath().getString("type"), errorType);
        Assert.assertEquals(response.jsonPath().getString("message"), errorMessage);
    }

    @DataProvider(name = "generateClientLibraryFail")
    public Object[][] generateClientLibraryFailProvider() {
        return new Object[][]{
                {null, keyName, type, value, SwaggerConstant.unknownError.statusCode, SwaggerConstant.unknownError.type, SwaggerConstant.unknownError.message},
                {language, null, type, value, SwaggerConstant.unknownError.statusCode, SwaggerConstant.unknownError.type, SwaggerConstant.unknownError.message}
        };
    }

}
