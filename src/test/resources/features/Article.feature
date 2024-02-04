Feature: Get articles
  User needed get the list of Article

  Scenario Template: Send request for getting articles

    Given Get Articles "<url>" Request
    Then Response code is "<status>"
    Examples:
      | url          | status |
      |articles.json | 200    |
      |              | 404    |
      |wrong .json   | 404    |
