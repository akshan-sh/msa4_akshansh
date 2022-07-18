Feature: Gillette automation with cucumber framework
	@test1
  Scenario: Checking for Gillete MACH3 Turbo text
    Given The driver is initialized
    And I am on the gillette homepage
    When I hover on Products and click on MACH3 under brands
    Then I find the text Gillette MACH3 Turbo is present on the directed page
   	And I close the browser
   	
	@test2
  Scenario Outline: Searching for Razor on the homepage
    Given The driver is initialized
    And I am on the gillette homepage
    When I search for the <searchQuery>
    Then I find the text Results For Razor appears at top of the search results
    And I close the browser

    Examples: 
      | searchQuery |
      |     Razor 	|
      
	@test3
	Scenario: Checking for Facial Hair Styles: The Anchor Beard text on the Learn page
		Given The driver is initialized
    And I am on the gillette homepage
    When I click on Styling under Learn in the footer section
    Then I find the text Facial Hair Styles: The Anchor Beard
    And I close the browser
    
		 
