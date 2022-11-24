Feature: Users able to login application and parches the cloth

@Sanity 
Scenario Outline: Users can login application with valid username an password 
	Given User is already in-home page and verify user information 
	When User can select Jackets from men dropdown 
	And User can verify <Sweater> is on the screen and click on it 
	And User can select the <size> and select the <color> 
	And User can select the <Quantity > 
	And User can click on addToCart 
	And User can click on upper right corner cart and click on Checkout 
	And User can add address and click on ship here 
	And User can select shipping method and click on next 
	And User able to click on place order 
	Then User can verify the Your order number and text on the screen "Thank you for your purchase!" 
	
	Examples: 
	|           Sweater         |size|color|Quantity|
	|Jupiter All-Weather Trainer|  M |Green|     1  |
	
	
	
	
	
 