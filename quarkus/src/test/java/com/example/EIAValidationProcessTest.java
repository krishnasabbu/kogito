package com.example;

import com.example.model.EIARequest;
import com.example.model.EIAResponse;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@QuarkusTest
public class EIAValidationProcessTest {

    @Test
    public void testEIAValidationApproved() {
        EIARequest request = new EIARequest(
                "PRJ-001",
                "Solar Farm Project",
                "RENEWABLE",
                "LOW",
                "Desert Area",
                "Green Energy Corp"
        );

        given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/eia-validation/submit")
                .then()
                .statusCode(200)
                .body("status", equalTo("APPROVED"))
                .body("validationResult", equalTo("APPROVED"))
                .body("cipValidationRequired", equalTo(false))
                .body("processInstanceId", notNullValue());
    }

    @Test
    public void testEIAValidationRequiresCIP() {
        EIARequest request = new EIARequest(
                "PRJ-002",
                "Industrial Complex",
                "INDUSTRIAL",
                "HIGH",
                "Urban Area",
                "Heavy Industries Ltd"
        );

        given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/eia-validation/submit")
                .then()
                .statusCode(200)
                .body("validationResult", equalTo("REQUIRES_CIP"))
                .body("cipValidationRequired", equalTo(true))
                .body("processInstanceId", notNullValue());
    }

    @Test
    public void testEIAValidationRejected() {
        EIARequest request = new EIARequest(
                "PRJ-003",
                "Test Project",
                "OTHER",
                "", // Empty environmental impact should cause rejection
                "Test Location",
                "Test Company"
        );

        given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/eia-validation/submit")
                .then()
                .statusCode(200)
                .body("status", equalTo("REJECTED"))
                .body("validationResult", equalTo("REJECTED"))
                .body("processInstanceId", notNullValue());
    }

    @Test
    public void testInvalidRequest() {
        EIARequest request = new EIARequest();
        // Missing required projectId

        given()
                .contentType(ContentType.JSON)
                .body(request)
                .when()
                .post("/eia-validation/submit")
                .then()
                .statusCode(400)
                .body("error", equalTo("Project ID is required"));
    }
}