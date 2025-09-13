*** Settings ***
Documentation  A test for use Robot
Library  SeleniumLibrary

*** Variables ***
${CHROME_BROWSER_PATH}  ${CURDIR}${/}chrome-win64${/}chrome.exe
${CHROME_DIRVER_PATH}  ${CURDIRK}${/}chromedriver${/}chromedriver-win64${/}chromedriver.exe
${URL}  http://google.com
${BROWSER}  Chrome
${DELAY}  5 seconds
${TEMP_PROFILE}  ${EXECDIR}${/}tmp-chrome-profile

*** Test Cases ***
Open Browser
	Open Browser  ${URL}  ${BROWSER}
	Close Browser
	Set Selenium Speed  ${DELAY}

