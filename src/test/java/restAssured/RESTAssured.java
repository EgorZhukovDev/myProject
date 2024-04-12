package restAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
// Для использования equalTo при проверке body.
// Можно заменить на org.hamcrest.Matchers.equalTo

public class RESTAssured {

    @Test // GET-запрос на https://postman-echo.com/get?foo1=bar1&foo2=bar2
    public void get(){
        RestAssured.baseURI = "https://postman-echo.com";
        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1", equalTo("bar1"));
    }

    @Test // GET-запрос с извлечением переменной из body
    public void getWithExtract() {
        RestAssured.baseURI = "https://postman-echo.com";

        Response response = given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("args.foo1", equalTo("bar1"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .extract()
                .response();

        String headersHost = response.path("headers.host");
        System.out.println(headersHost);
        response.prettyPrint(); // вывести в консоль полностью body ответа
    }

    @Test // POST-запрос
    public void postWithJsonBody() {
        RestAssured.baseURI = "https://httpbin.org";
        JSONObject requestBody = new JSONObject() // если в POST-запросе параметры отправляются в формате json
                .put("name", "test name")
                .put("age", 18)
                .put("hobby", "sport");

        Response response = given()
                .body(requestBody.toString())
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", containsString("test name")) // проверка значений параметров(data и headers.Content-Length)
                .body("headers.Content-Length", equalTo("64"))
                .extract().response();
        response.prettyPrint();
        String origin = response.path("origin");
        System.out.println(origin);
    }
}
