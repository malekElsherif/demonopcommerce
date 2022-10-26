@smoke
  Feature: F08_Wishlist|user could click on wishlist button ❤ products and has been added to user wishlist
    Scenario: user could click on wishlist button on this product HTC One M8 Android L 5.0 Lollipop
      When user could click on wishlist button
      Then user will see success message

    Scenario: product HTC One M8 Android L 5.0 Lollipop added to user wishlist
     When user could click on wishlist button
     Then product added to user wishlist