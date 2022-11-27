Feature: valid user can purchase the men jacket from eCommerce web-site. 
	
Description: "Online user can register luma E-commerce web-site to purchase"
	            "return, deliver, exchange, clearance, sale, etc."
@Sanity    
Scenario Outline: User can login to the application with valid credentials and 
	                       purchase the specific men's jacket.   
                  
	Given User already logged in the application and verify the user information on the landing page 
	When User should be able to select <specific> jacket from men module 
	And Verify the jacket name on the <specific> list 
	And User should be able to select the <size> and <color> and <quantity> then click on the add to cart 
	And User should be able to click on the cart and checkout 
	And User should be able to enter the shipping details and click on the Next 
	And User should be able to verify the shipping address and place the order 
	Then User should be able to verify the order number and get text on the screen "Thank you for your purchase!"
	Examples: 
		|            specific          | size | color | quantity |         
		|Jupiter All-Weather Trainer   |  M   | Blue  |    1     |

