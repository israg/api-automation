package models.request;

public class GenerateClientLibraryRequest {

    public Spec spec;
    public Options options;
    public String swaggerUrl;
    public AuthorizationValue authorizationValue;
    public boolean usingFlattenSpec;
    public SecurityDefinition securityDefinition;

    private GenerateClientLibraryRequest(Builder builder) {
        spec = builder.spec;
        options = builder.options;
        swaggerUrl = builder.swaggerUrl;
        authorizationValue = builder.authorizationValue;
        usingFlattenSpec = builder.usingFlattenSpec;
        securityDefinition = builder.securityDefinition;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class AuthorizationValue{
        public String value;
        public String type;
        public String keyName;
        public UrlMatcher urlMatcher;

        private AuthorizationValue(Builder builder) {
            value = builder.value;
            type = builder.type;
            keyName = builder.keyName;
            urlMatcher = builder.urlMatcher;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static final class Builder {
            private String value;
            private String type;
            private String keyName;
            private UrlMatcher urlMatcher;

            private Builder() {
            }

            public Builder withValue(String val) {
                value = val;
                return this;
            }

            public Builder withType(String type) {
                type = type;
                return this;
            }

            public Builder withKeyName(String val) {
                keyName = val;
                return this;
            }

            public Builder withUrlMatcher(UrlMatcher val) {
                urlMatcher = val;
                return this;
            }

            public AuthorizationValue build() {
                return new AuthorizationValue(this);
            }
        }
    }

    public static class Options{
        public String additionalProp1;
        public String additionalProp2;
        public String additionalProp3;

        private Options(Builder builder) {
            additionalProp1 = builder.additionalProp1;
            additionalProp2 = builder.additionalProp2;
            additionalProp3 = builder.additionalProp3;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static final class Builder {
            private String additionalProp1;
            private String additionalProp2;
            private String additionalProp3;

            private Builder() {
            }

            public Builder withAdditionalProp1(String val) {
                additionalProp1 = val;
                return this;
            }

            public Builder withAdditionalProp2(String val) {
                additionalProp2 = val;
                return this;
            }

            public Builder withAdditionalProp3(String val) {
                additionalProp3 = val;
                return this;
            }

            public Options build() {
                return new Options(this);
            }
        }
    }

    public static class SecurityDefinition{
        public String type;
        public String description;

        private SecurityDefinition(Builder builder) {
            type = builder.type;
            description = builder.description;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static final class Builder {
            private String type;
            private String description;

            private Builder() {
            }

            public Builder withType(String val) {
                type = val;
                return this;
            }

            public Builder withDescription(String val) {
                description = val;
                return this;
            }

            public SecurityDefinition build() {
                return new SecurityDefinition(this);
            }
        }
    }

    public static class Spec{
    }

    public static class UrlMatcher{
    }

    public static final class Builder {
        private Spec spec;
        private Options options;
        private String swaggerUrl = "http://petstore.swagger.io/v2/swagger.json";
        private AuthorizationValue authorizationValue;
        private boolean usingFlattenSpec = true;
        private SecurityDefinition securityDefinition;

        private Builder() {
        }

        public Builder withSpec(Spec val) {
            spec = val;
            return this;
        }

        public Builder withOptions(Options val) {
            options = val;
            return this;
        }

        public Builder withSwaggerUrl(String val) {
            swaggerUrl = val;
            return this;
        }

        public Builder withAuthorizationValue(AuthorizationValue val) {
            authorizationValue = val;
            return this;
        }

        public Builder withUsingFlattenSpec(boolean val) {
            usingFlattenSpec = val;
            return this;
        }

        public Builder withSecurityDefinition(SecurityDefinition val) {
            securityDefinition = val;
            return this;
        }

        public GenerateClientLibraryRequest build() {
            return new GenerateClientLibraryRequest(this);
        }
    }
}
