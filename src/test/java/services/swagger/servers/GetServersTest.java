package services.swagger.servers;

import helpers.common.HelperMethod;
import helpers.swagger.SwaggerGeneratorHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetServersTest {

    SwaggerGeneratorHelper swaggerGeneratorHelper = new SwaggerGeneratorHelper();

    @Test
    public void getServersHappyPath() {
        Response response = swaggerGeneratorHelper.getServers();
        HelperMethod.checkStatus(response, 200);
    }
}
