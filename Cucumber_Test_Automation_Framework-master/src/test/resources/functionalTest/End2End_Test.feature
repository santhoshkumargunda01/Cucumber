Feature: End to End Functional Test

Scenario: Product Search and add to shopping cart
		Given user is on Home Page
		When he search for "Head first java"
		And choose to buy the first item
		And Add product to shopping cart
		And User clicks on shopping cart
		And Cliks on proceed to check out
		Then User should be asked to login before checkout


   