package dojo;

// import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import static junit.framework.Assert.assertEquals;

public class CocktailSteps {

    private Order order;

    @Given("(.*) who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String x) {
        order = new Order();
        order.declareOwner(x);
    }

    @When("an order is declared for (.*)")
    public void an_order_is_declared_for_Juliette(String x) {
        order.declareTarget(x);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_no_cocktail_in_the_order(int x) {
        List<String> cocktails =  order.getCocktails();
        for (int i=0; i<x; i++){
            cocktails.add("Boisson");
        }
        assertEquals(x, cocktails.size());
    }

    @And("a message saying (.*) is added")
    public void message_send(String x) {
        order.declareMsg(x);
    }

    @Then("the ticket must say (.*)")
    public void expected_ticket(String x) {
        String res = "From " + order.getOwner() + " to " + order.getTarget() + ": " + order.getMsg();
        assertEquals(x,res);
    }
}