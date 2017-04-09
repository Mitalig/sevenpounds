Feature: Dashboard Functionality 

Scenario Outline: To test the Dashboard Functionality 
	Given You are on Dashboard page 
	When You are on Menu 
	Then Check Menu and Login options with "<userName>" and "<password>" 
	Examples: 
		|userName|password|
		|ashu271989@gmail.com|24374767|
		
		
		
		
   