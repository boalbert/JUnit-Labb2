# JUnit - Labb 2
## Javaverktyg och Byggmiljöer

Test går att köra via kommando `mvn test`.

CalculatorTest.java innehåller (m.m.)

* @Test
* @DisplayName
* @Disabled
* AssertEquals
* AssertTrue

TextProcessorTest.java innehåller (m.m.)

* @RepeatedTest
* @BeforeEach
* @AfterEach
* AssertNotNull

pom.xml

```xml
  <dependencies>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.4.0</version>
      <scope>test</scope>
    </dependency>

// Inkluderas för att köra @ParameterizedTest
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-params</artifactId>
      <version>5.4.0</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
```

