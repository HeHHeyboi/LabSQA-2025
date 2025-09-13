*** Settings ***
Documentation  A test for use Robot
Library  SeleniumLibrary

*** Variables ***
${CHROME_BROWSER_PATH}  C:${/}Program Files${/}BraveSoftware${/}Brave-Browser${/}Application${/}brave.exe
${CHROME_DIRVER_PATH}  ${CURDIR}${/}chromedriver${/}chromedriver-win64${/}chromedriver.exe
${URL}  http://google.com
${BROWSER}  Chrome
${DELAY}  5 seconds

*** Test Cases ***
Open Browser
	Open Browser  ${URL}  ${BROWSER}
	Set Selenium Speed  ${DELAY}
	Close Browser
