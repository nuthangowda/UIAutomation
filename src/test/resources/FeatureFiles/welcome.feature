Feature: Welcome screen
  @Regression
  Scenario: Click on notification get that text and get into bot.
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    And validate the text post notification click "Hello and welcome to IRA agent"

  @Regression
  Scenario: Enter greetings message & validate the response.
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    When click on get started button
    Then enter greetings message say "Hello"
    And validate the greetings message response "Hi there, what can I help you with today?"

  @Regression
  Scenario: Validate the redirection on post click on Download link.
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    When click on get started button
    Then click on download motor policy link
    And validate the text message "Please click on the below button to download copy of your motor policy."
    Then click on download link
    And validate the title of the webpage "Motor, Health, Travel and Home Insurance Online"
