package restFullBooker;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createBooking {


    public static void main(String[] args) {

        //build request
     //RequestSpecification requestSpecification= RestAssured.given();
      //RequestSpecification requestSpecification= RestAssured.given();
     //RequestSpecification requestSpecification= RestAssured.given().log().all();
     // RequestSpecification RequestSpecification =RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com");



              RestAssured.
        given().
              log().
              all().
              baseUri("https://restful-booker.herokuapp.com")
              .basePath("/booking")
              .body("{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}")
              .contentType(ContentType.JSON)
       .when()
                      .post()
        .then()
              .log()
              .all()
                      .statusCode(200);


        //hit request and get response

        //Response response = requestSpecification.post();
        //validate response

       // ValidatableResponse validResp=response.then().log().all();

        //validResp.statusCode(200);

    }
}
