Feature: YouTube Automation

  @YouTube
  Scenario: youTube Search
    Given User Opens youtube
    And   Search Prashant Dhawan
    Then  User Plays the latest Video
    And   User Search for Automation Videos
    Then  User Navigate to gmail