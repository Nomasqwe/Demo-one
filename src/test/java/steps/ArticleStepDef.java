package steps;

import api.Article;
import impl.ArticleServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import service.ArticleService;
import java.util.*;

import static context.RunContext.RUN_CONTEXT;

public class ArticleStepDef {
    ArticleService articleService = new ArticleServiceImpl();

    @Given("Get Articles {string} Request")
    public void getArticlesRequest(String url) {
        List<Article> articleList = articleService.getArticles(url);
        System.out.println(articleList);

    }

    @Then("Response code is {string}")
    public void responseCodeIs(String status) {
        ValidatableResponse response = RUN_CONTEXT.get("responce", ValidatableResponse.class);
        int actualStatus = response.extract().statusCode();
        int expectStatus = Integer.parseInt(status);
        Assert.assertEquals(actualStatus, expectStatus);
    }
}
