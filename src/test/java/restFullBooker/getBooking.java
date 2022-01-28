package restFullBooker;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
public class getBooking {
    public static void main (String args[])
    {

   // build request
        //RequestSpecification requestSpecification= RestAssured.given().log().all();

       // RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/")
        ValidatableResponse response= RestAssured.
                        given().
                        log().
                        all().
                        baseUri("https://restful-booker.herokuapp.com/").
                        basePath("booking/{id}").
                        pathParam("id","1").
                        get().
                        then().
                        log().
                        all().
                        statusCode(200);

 //   hit the API and receive  a response

       //Response response= requestSpecification.get();

  //  validate the response

     // ValidatableResponse validatableResponse= response.then().log().all();
   //     validatableResponse.statusCode(200);





    }


}
