package lab16;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class TrelloCRUDTest {
    private static final String CREATE_BOARD_URL = "https://api.trello.com/1/boards/?name=%s&key=%s&token=%s";
    private static final String GET_BOARD_URL = "https://api.trello.com/1/boards/%s?key=%s&token=%s";
    private static final String BOARD_NAME = "username-co";
    private static final String KEY = "e90b0487f91148400a38394ee2efb92f";
    private static final String TOKEN = "052c806882b4afd61bb6b2458d18a18d64eababf51c3e6c9a10d6caee1342b0f";
    private String boardId;
    @Test
    public void createBoard() {
        Response response = given().when()
                .contentType("application/json")
                .log().all()
                .post(String.format(CREATE_BOARD_URL, BOARD_NAME, KEY, TOKEN));
        response.then()
                .assertThat()
                .statusCode(200);
        boardId = response.getBody().jsonPath().get("id");
    }

    @Test(dependsOnMethods = "createBoard")
    public void getBoard() {
        given().when()
                .contentType("application/json")
                .log().all()
                .get(String.format(GET_BOARD_URL, boardId, KEY, TOKEN))
                .then()
                .assertThat()
                .statusCode(200);
    }

}
