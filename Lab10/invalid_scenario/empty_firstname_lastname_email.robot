# นายธนทัต ภู่แก้ว 663380211-0
*** Settings ***
Documentation  Register without First name, Last name, Email
Library  SeleniumLibrary
Suite Teardown    Close All Browsers

*** Variables ***
${CHROME_BROWSER_PATH}  ${CURDIR}${/}chrome-win64${/}chrome.exe
${CHROME_DIRVER_PATH}  ${CURDIR}${/}chromedriver${/}chromedriver-win64${/}chromedriver.exe
${URL}  http://localhost:8080/Lab10
${BROWSER}  Chrome
${DELAY}  1 seconds
${EXPECTED_MSG1}  Please enter your name!!
${EXPECTED_MSG2}  Please enter your email!!

&{C1}  firstname=  lastname=  organization=CS KKU  email=somsri@kkumail.com  phone=081-001-1234
&{C2}  firstname=Somsri  lastname=sodsai  organization=CS KKU  email=   phone=081-001-1234

*** Test Cases ***
Open Register web
	Set Selenium Speed  ${DELAY}
	Open Browser  ${URL}  ${BROWSER}

Register without First & Last name
	Set Selenium Speed  0s
	FOR  ${key}  ${value}  IN  &{C1}
		Input Text  ${key}  ${value}  true
	END
	Set Selenium Speed  1s
	Submit Form  myform
	Set Selenium Speed  0s
	Element Text Should Be  errors  ${EXPECTED_MSG1}

Register without Email
	Set Selenium Speed  0s
	FOR  ${key}  ${value}  IN  &{C2}
		Input Text  ${key}  ${value}  true
	END
	Set Selenium Speed  1s
	Submit Form  myform
	Set Selenium Speed  0s
	Element Text Should Be  errors  ${EXPECTED_MSG2}
	Close Browser
