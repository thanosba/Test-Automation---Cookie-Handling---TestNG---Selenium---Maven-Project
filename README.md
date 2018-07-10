# Test-Automation---Cookie-Handling---TestNG---Selenium---Maven-Project-Github Site

Why Handle Cookies in Selenium? 

Each cookie is associated with a name, value, domain, path, expiry, and the status of whether it is secure or not. In order to validate a client, a server parses all of these values in a cookie.  When Testing a web application using selenium web driver, you may need to create, update or delete a cookie.

Interacting with cookies:

driver.manage().getCookies();   // Return The List of all Cookies

driver.manage().getCookieNamed(arg0);  //Return specific cookie according to name

driver.manage().addCookie(arg0);   //Create and add the cookie

driver.manage().deleteCookie(arg0);  // Delete specific cookie

driver.manage().deleteCookieNamed(arg0); // Delete specific cookie according Name

driver.manage().deleteAllCookies();  // Delete all cookies
