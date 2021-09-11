Feature: automation Store

  Scenario: User visit home page automation site
    Given User wants to shop online
    When User types http://automationpractice.com/index.php
    Then User is on automation practice web site