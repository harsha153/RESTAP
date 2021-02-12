Feature: Creating a tgws4yiohrqviq3h5ui3yh8u4yh8u3q4yh8
         
	Scenario:Invoking addition
		Given a Rest Api  as "http://localhost:8080/addition?firstoperand=10&secondoperand=10"
		When invoking REST API for addition
		Then expecting result is 20
	
