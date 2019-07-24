Feature: Creating a Rest Calculator 
         
	Scenario:Invoking addition
		Given a Rest Api  as "http://localhost:8080/addition?firstoperand=10&secondoperand=10"
		When invoking REST API for addition
		Then expecting result is 20
	
