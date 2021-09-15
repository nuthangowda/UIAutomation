Feature: Menu Options
@Regression
  Scenario Outline: Type "Test Bot" fill the form and submit the details
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    When click on get started button
    Then type "Test Bot" and click on enter
    Then fill the form and submit the details "<name>" "<address>"
    And validate post submitting the form "Submitted successfully"
    Examples:
      |name|address|
      |abc|test 123|

@Regression
  Scenario: Type "New Test" click on "Google" and close the webview
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    When click on get started button
    Then enter "New Test" and click on enter
    Then click on Google and close the webview

@Regression
  Scenario: Type "New Test" click on "Call" and close the webview
    Given I navigate to Home page "https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up"
    When click on notification get that text and get into bot
    When click on get started button
    Then enter "New Test" and click on enter
    Then click on call and close the popup window
