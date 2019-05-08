$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/newtour.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to register to newtour",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenarioOutline({
  "name": "I want to register to newtour",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I open \u003cBrowser\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to url",
  "keyword": "And "
});
formatter.step({
  "name": "I click on register_xpath",
  "keyword": "And "
});
formatter.step({
  "name": "In firstname_xpath I enter \u003cfirst_name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In lastname_xpath I enter \u003clast_name\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In phone_xpath I enter \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In email_xpath I enter \u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In address_xpath I enter \u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In city_xpath I enter \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In state_xpath I enter \u003cstate\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In postal_xpath I enter \u003cpostal_code\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In country_xpath I select",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "India"
      ]
    }
  ]
});
formatter.step({
  "name": "In username_xpath I enter \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In password_xpath I enter \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "In confirmpassword_xpath I enter \u003cconfirm_password\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click on submit_xpath",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "first_name",
        "last_name",
        "phone",
        "email",
        "address",
        "city",
        "state",
        "postal_code",
        "username",
        "password",
        "confirm_password"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first1",
        "last1",
        "8793497934",
        "test1@gmail.com",
        "1st street",
        "Bangalore",
        "Karnataka",
        "45356",
        "user1",
        "pass1",
        "pass1"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first2",
        "last2",
        "7877878342",
        "test2@gmail.com",
        "2nd street",
        "Tumkur",
        "Karnataka",
        "34355",
        "user2",
        "pass2",
        "pass2"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first3",
        "last3",
        "3432423343",
        "test3@gmail.com",
        "3rd street",
        "Bagalkot",
        "Karnataka",
        "45345",
        "user3",
        "pass3",
        "pass3"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first4",
        "last4",
        "1234354677",
        "test4@gmail.com",
        "4th street",
        "Udupi",
        "Karnataka",
        "34534",
        "user4",
        "pass4",
        "pass4"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first5",
        "last5",
        "5645645645",
        "test5@gmail.com",
        "5th street",
        "Mysore",
        "Karnataka",
        "55777",
        "user5",
        "pass5",
        "pass5"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first6",
        "last6",
        "4463363634",
        "test6@gmail.com",
        "6th street",
        "Mandya",
        "Karnataka",
        "86544",
        "user6",
        "pass6",
        "pass6"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first7",
        "last7",
        "6565656456",
        "test7@gmail.com",
        "7th street",
        "Kolar",
        "Karnataka",
        "64545",
        "user7",
        "pass7",
        "pass7"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first8",
        "last8",
        "8542357777",
        "test8@gmail.com",
        "8th street",
        "Hassan",
        "Karnataka",
        "56457",
        "user8",
        "pass8",
        "pass8"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first9",
        "last9",
        "7987777344",
        "test9@gmail.com",
        "9th street",
        "Gulbarga",
        "Karnataka",
        "98354",
        "user9",
        "pass9",
        "pass9"
      ]
    },
    {
      "cells": [
        "Mozilla",
        "first10",
        "last10",
        "9997766223",
        "test10@gmail.com",
        "10th street",
        "Davanagere",
        "Karnataka",
        "33536",
        "user10",
        "pass10",
        "pass10"
      ]
    }
  ]
});
formatter.scenario({
  "name": "I want to register to newtour",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "newtour.browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to url",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_navigate_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_click_on_register_xpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In firstname_xpath I enter first1",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In lastname_xpath I enter last1",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In phone_xpath I enter 8793497934",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In email_xpath I enter test1@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In address_xpath I enter 1st street",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In city_xpath I enter Bangalore",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In state_xpath I enter Karnataka",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In postal_xpath I enter 45356",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In country_xpath I select",
  "rows": [
    {
      "cells": [
        "India"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_select(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In username_xpath I enter user1",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In password_xpath I enter pass1",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In confirmpassword_xpath I enter pass1",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on submit_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_click_on_register_xpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to register to newtour",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "newtour.browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to url",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_navigate_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on register_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_click_on_register_xpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In firstname_xpath I enter first2",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In lastname_xpath I enter last2",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In phone_xpath I enter 7877878342",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In email_xpath I enter test2@gmail.com",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In address_xpath I enter 2nd street",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In city_xpath I enter Tumkur",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In state_xpath I enter Karnataka",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In postal_xpath I enter 34355",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In country_xpath I select",
  "rows": [
    {
      "cells": [
        "India"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_select(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In username_xpath I enter user2",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In password_xpath I enter pass2",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In confirmpassword_xpath I enter pass2",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on submit_xpath",
  "keyword": "And "
});
formatter.match({
  "location": "newtour.i_click_on_register_xpath(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to register to newtour",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@register"
    }
  ]
});
formatter.step({
  "name": "I open Mozilla",
  "keyword": "Given "
});
formatter.match({
  "location": "newtour.browser(String)"
});
