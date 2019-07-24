package com.amdocs.RESTAPI;

import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT,classes=RestapiApplication.class)
public class StepDef {
String url;
Double result;

@Given("a Rest Api  as {string}")
public void a_Rest_Api_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	url=string;
    throw new cucumber.api.PendingException();
}

@When("invoking REST API for addition")
public void invoking_REST_API_for_addition() {
    // Write code here that turns the phrase above into concrete actions
	RestTemplate restTemplate=new RestTemplate();
    throw new cucumber.api.PendingException();
}

@Then("expecting result is {int}")
public void expecting_result_is(Integer int1) {
	assertEquals(int1,result,0.01);
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
