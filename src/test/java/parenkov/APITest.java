package parenkov;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class APITest {

    @Test
    @Tag("api")
    public void loginTest() { // изменить название

//        step("Add an item with custom specs to the Shopping Cart by API", () -> {
//            Response response =
//                    given()
//                            .contentType("application/x-www-form-urlencoded; charset=UTF-8")
//                            .body("product_attribute_74_5_26=82" +
//                                    "&product_attribute_74_6_27=85" +
//                                    "&product_attribute_74_3_28=87" +
//                                    "&product_attribute_74_8_29=88" +
//                                    "&product_attribute_74_8_29=89" +
//                                    "&product_attribute_74_8_29=90" +
//                                    "&addtocart_74.EnteredQuantity=2")
//                            .cookie("Nop.customer=69589107-6373-41bd-891d-47fb44277adc;")
//                            .when()
//                            .post("/addproducttocart/details/74/1")
//                            .then()
//                            .statusCode(200)
//                            .body("success", is(true))
//                            .body("message", is("The product has been added to your " +
//                                    "<a href=\"/cart\">shopping cart</a>"))
//                            .extract().
//                            response();
//            System.out.println("Quantity: " + response.path("updatetopcartsectionhtml"));
//            System.out.println(response.asString());
//        });

    }
}
