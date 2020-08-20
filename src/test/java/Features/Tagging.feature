Feature: Application Login              




@Reg
Scenario: Home page default login
Given User is at landing page
When User login into application with username "8237545620" and password "@fruit4bird@"
Then Home page is displayed
And Cards are displayed

@Smoke
Scenario: Home page default login
Given User is at landing page
When User login into application with username "9881081436" and password "payment2.0"
Then Home page is displayed
And Cards are displayed


@Sanity
Scenario: Home page Registertation
Given User is at landing page
When User submit following details
| Firstname | Lastname | PhoneNumb  | MailID          | UserID      | Password  | CPassword |
| Shekhar   | kul      | 9765301400 | gbhdh@gmail.com | coolshekhar | 123456789 | 123456789 |
| Shivani   | puj      | 1555541400 | sfddh@gmail.com | cdslshekhar | 444444444 | 444444444 |
Then Home page is displayed
And Cards are displayed

