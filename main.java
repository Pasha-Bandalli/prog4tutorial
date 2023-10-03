// Maven
<dependency>
<groupId>com.flagsmith</groupId>
<artifactId>flagsmith-java-client</artifactId>
<version>5.0.0/version>


// Gradle
implementation 'com.flagsmith:flagsmith-java-client:5.0.0'



FlagsmithClient flagsmith = FlagsmithClient
    .newBuilder()
    .setApiKey("j4MgafpcGpCFh7wNjMv88J")
    .build();

Flags flags = flagsmith.getEnvironmentFlags();

// Check for a feature
boolean isEnabled = flags.isFeatureEnabled("my_cool_feature");

// Or, use the value of a feature
Object featureValue = flags.getFeatureValue("banner_size");