@HomePage
  Feature: Home and Login Pages
      @Home
    Scenario: Check Home Page Loaded
      Given   User on Home Page
      Then    User should see Home Page container

      @Ticket
    Scenario Outline: User enters Ticket informations
      Given User on Home Page
      When  User clicks Otobus button
      When  User enters Kalkis noktasi "<departurePoint>" city
      And   User enters Varis noktasi "<arrivePoint>" city
      And   User clicks Yarin button
      And   User clicks Otobus Bileti Bul button
      Then  User should see filtered Tickets

      Examples:
      |departurePoint|arrivePoint|
      |     alanya         |ankara              |
      |     sivas          |yozgat              |


      @Wrong
    Scenario Outline:Wrong Email and Wrong Password on Login Page
      Given User on Home Page
      When  User click Uye Girisi button
      Then  User see Login Page opens
      When  User enters "<wrongEmail>" email
      Then  Should see "<loginEmailError>" email error message
      When  User enters "<wrongPassword>" password
      When  User clicks Giris Yap button
      Then Should see "<loginPasswordError>" password error message


      Examples:
      |wrongEmail                       |loginEmailError|wrongPassword                    |   loginPasswordError       |
      |wrongMail.com                  |Geçersiz E-mail adresi|12345                             |    Şifreniz en az 6 karakter olmalıdır  |


      @Empty
    Scenario Outline: Empty Login Page
      Given User on Home Page
      When  User click Uye Girisi button
      Then  User see Login Page opens
      When  User clicks Giris Yap button
      Then  User should see "<emptyEmailError>" empty mail error message
      And   User should see "<emptyPasswordError>" empty pasword error message

      Examples:
        |emptyEmailError|emptyPasswordError|
        |E-mail adresi boş bırakılamaz| Şifre boş bırakılamaz   |


