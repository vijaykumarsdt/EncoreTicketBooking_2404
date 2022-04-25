Feature: Ticket Booking

  Scenario: Encore Ticket Booking  
    
    Given the use opens the Encore ticket booking URL
    And Search for the paly with product id 6362 or play name 
    Then Select number of Seats
    Then Click on Find Tickets
    And Select the Month and Date as per the availability from the given API
    And Select the Show time
    Then Click on Pick Your Tickets button
    Then Click on the allocated seats taken from API
    Then go to the Payment Section and Complete the Payments
    And Close the Browser