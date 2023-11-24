Feature: Checking implementation of BinarySearcherApp

  @sorting
  Rule: Input lists are always in sorted order

  Scenario Template:
    Given binary searcher app is initialised with <input>
    When input is accessed
    Then it should match <output>
    Examples:
      | input          | output         |
      | 1,2,3,4,5      | 1,2,3,4,5      |
      | 11,9,7,1,0     | 0,1,7,9,11     |
      | 88,11,00,22,99 | 00,11,22,88,99 |

  @key-exists
  Rule: Searching for an existing key always returns its index and is positive

  Scenario: The lowest existing item is always 1
    Given binary searcher app is initialised with 1,2,3,4,5
    When I search for 1
    Then the position is 1

  Scenario: The highest existing item is always length of items collection.
    Given binary searcher app is initialised with 10,9,12,15
    When I search for 15
    Then the position is 4

  Scenario Template:
    Examples: