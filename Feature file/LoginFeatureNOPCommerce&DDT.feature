
Feature: Login in Open Cart 

Scenario: Successful login in NOP Commerce with valid credential

Given User launch microsoft edge
When user enter url "https://admin-demo.nopcommerce.com/login"
And user enter email as "admin@yourstore.com" and password as "admin"
And click on the login page
Then title page should be "Dashboard / nopCommerce administration"
And click on the logout page
Then title page should be "Your store. Login"
And close the browser 

#Scenario Outline: Successful Login in NOP Commerce with valid credential DDT
#
#Given User launch microsoft edge
#When user enter url "https://admin-demo.nopcommerce.com/login"
#And user enter email as "<email>" and password as "<password>"
#And click on the login page
#Then title page should be "Dashboard / nopCommerce administration"
#And click on the logout page
#Then title page should be "Your store. Login"
#And close the browser 
#
#Examples:
#|email|password|
#|admin@yourstore.com|admin|
#|admin@yourstore.com|Admin2|


#https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F