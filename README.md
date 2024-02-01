## Food-Truck-Finder   
### User Story: Find the food truck  
- 	Card:   
    As a user, I hope to find the nearest food truck through APP.   
- 	Talk:    
  Product: This back-end function can be described as: the user can quickly locate the nearest food car through this function.  
  Dev: How to determine the concept of "nearest".Map distance or straight line distance of latitude and longitude coordinates?  
  Product: This is a good question, we will introduce the map function during the first phase.  
  Dev: What specific information need to be returned to the user about the food truck? because there is so much data about the food truck.  
  Product: Food truck name, address and food menu.  
  Product: In addition, food truck must be open.  
  Dev: Ok!  I think it may be best to record the user's information.  
  Product: Sure.  

- 	Acceptance standard:   
  If I am a user, I find the name, food menu and address of the nearest food truck through my own location. And the food car is required to be open. The standard of distance is the latitude and longitude coordinates, not the distance of the traffic line.
 
![image](https://github.com/yangbao/Food-Truck-Finder/assets/4555259/98904221-d684-4816-be50-a126ccff0366)

## Environmental requirements
### Hardware requirements

![image](https://github.com/yangbao/Food-Truck-Finder/assets/4555259/e4674f90-45a0-429d-83e8-e245fed988e2)
### Software requirements
- jdk15
- IDEA
- MAVEN
- MySQL 8
- Tencent Cloud
- Tencent Map
  
## Project Structure

![image](https://github.com/yangbao/Food-Truck-Finder/assets/4555259/bd2f55f3-923a-4062-aea4-6fca579b2d8e)

bff-customer: apply for frontend function
common: basic componet
gateway: gateway for miro-service
hxds-cst: user module
hxds-maps : supply map service
hxds-mis-api: Operation backstage

## Technical architecture





