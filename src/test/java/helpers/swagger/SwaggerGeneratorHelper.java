package helpers.swagger;

import client.RestAssuredClient;
import config.APIConstant;
import io.restassured.response.Response;
import models.request.GenerateClientLibraryRequest;

public class SwaggerGeneratorHelper extends RestAssuredClient {

    public SwaggerGeneratorHelper() {
        super(APIConstant.SwaggerGen.BASE_URL);
    }

    public Response getServers() {
        return get("gen/servers", null, null, null);
    }

    public Response generateClientLibrary(String language, String keyName, String type, String value) {
        GenerateClientLibraryRequest.AuthorizationValue authorizationValue = GenerateClientLibraryRequest.AuthorizationValue.newBuilder()
                .withKeyName(keyName)
                .withType(type)
                .withValue(value)
                .build();
        GenerateClientLibraryRequest generateClientLibraryRequest = GenerateClientLibraryRequest.newBuilder()
                .withAuthorizationValue(authorizationValue).build();
        return post("gen/clients/" + language, null, null, generateClientLibraryRequest);
    }

    public Response getClientsByLanguage(String language) {
        return get("gen/clients/" + language, null, null, null);
    }
}
