package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

@QuarkusTest
public class WorkflowTest {

    @Test
    public void testWorkflow() {
        given()
          .body("{\"eia\":\"OK\"}")
          .header("Content-Type", "application/json")
          .when()
          .post("/validation-pipeline")
          .then()
             .statusCode(200);
    }
}
