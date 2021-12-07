package parenkov;

import io.restassured.response.Response;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import parenkov.config.APITestConfig;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class APITest extends TestBase {

    @Test
    @Tag("api_test")
    @DisplayName("Adding a product to the Shopping Cart")
    public void addItemToShoppingCartTest() {
        // для передачи cookie в виде системной переменной через терминал:
        // gradle clean api_test -Dcookie=6aca33e1-f9db-4f9a-8139-40406680d2ce

        apiconfig = ConfigFactory.create(APITestConfig.class, System.getProperties());
        Response response =
                given()
                        .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                        .body("product_attribute_16_5_4=14" +
                                "&product_attribute_16_6_5=15" +
                                "&product_attribute_16_3_6=19" +
                                "&product_attribute_16_4_7=44" +
                                "&product_attribute_16_8_8=22" +
                                "&addtocart_16.EnteredQuantity=1")
                        .cookie("Nop.customer=" + apiconfig.getCookie() + ";")
                        .when()
                        .post(apiconfig.getBaseUrl() + "/addproducttocart/details/16/1")
                        .then()
                        .statusCode(200)
                        .body("success", is(true))
                        .body("message", is("The product has been added to your " +
                                "<a href=\"/cart\">shopping cart</a>"))
                        .extract()
                        .response();
        System.out.println("Quantity: " + response.path("updatetopcartsectionhtml"));
        System.out.println(response.asString());
    }
}
