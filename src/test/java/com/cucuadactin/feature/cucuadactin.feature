Feature: Hotel Booking In Adactin Application

Scenario: Login Page
Given user Launch The Application
When user Enter The Username In Username Filed
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Scenario: Search Hotel
Given user Select The Location
When user Select The Hotel Name
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Checkin Date
And user Enter The Checkout Date
And user Select The Number Of Adults
Then Click the Submit Button And It Navigates To Select Hotel Page

Scenario: Select Hotel
Given Click The Checkbox
Then Click Ok And It Navigates To Book Hotel Page

Scenario: Booking Hotel
Given user Enter The First Name
When user Enter The Last Name
And user Enter The Address
And user Enter The Credit Card Number
And user Select The Card Type
And user Select The Month
And user Select The Year
And user Enter The Cvv
Then Click the Submit Button

