*** Settings ***
Documentation  Register without Organization
Library  SeleniumLibrary

*** Variables ***
${CHROME_BROWSER_PATH}  ${CURDIR}${/}chrome-win64${/}chrome.exe
${CHROME_DIRVER_PATH}  ${CURDIR}${/}chromedriver${/}chromedriver-win64${/}chromedriver.exe
${URL}  http://localhost:8080/Lab10
${BROWSER}  Chrome
${DELAY}  3 seconds

&{U1}  firstname=Somsri  lastname=sodsai  email=somsri@kkumail.com  phone=081-001-1234

*** Test Cases ***
Open Register web
	Set Selenium Speed  ${DELAY}
	Open Browser  ${URL}  ${BROWSER}

Register without Organization
	Set Selenium Speed  0s
	FOR  ${key}  ${value}  IN  &{U1}
		Input Text  ${key}  ${value}  true
	END
	Set Selenium Speed  1s
	Submit Form  myform
	${title} =  Get Title
	Log To Console  ${title}
	Title Should be  Success
