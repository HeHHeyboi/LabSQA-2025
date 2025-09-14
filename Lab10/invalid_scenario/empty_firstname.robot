*** Settings ***
Documentation  Register without First name
Library  SeleniumLibrary
Suite Teardown    Close All Browsers

*** Variables ***
${CHROME_BROWSER_PATH}  ${CURDIR}${/}chrome-win64${/}chrome.exe
${CHROME_DIRVER_PATH}  ${CURDIR}${/}chromedriver${/}chromedriver-win64${/}chromedriver.exe
${URL}  http://localhost:8080/Lab10
${BROWSER}  Chrome
${DELAY}  1 seconds
${EXPECTED_MSG}  Please enter your first name!!

&{U1}  lastname=sodsai  organization=CS KKU  email=somsri@kkumail.com  phone=081-001-1234

*** Test Cases ***
Open Register web
	Set Selenium Speed  ${DELAY}
	Open Browser  ${URL}  ${BROWSER}

Register without First name
	Set Selenium Speed  0s
	FOR  ${key}  ${value}  IN  &{U1}
		Input Text  ${key}  ${value}  true
	END
	Set Selenium Speed  1s
	Submit Form  myform
	Set Selenium Speed  0s
	Element Text Should Be  errors  ${EXPECTED_MSG}
	Close Browser
