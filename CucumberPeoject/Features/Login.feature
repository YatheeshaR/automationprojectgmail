Feature: Login

Scenario: Sucessfull Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"
	And User enters Email as "someonessomethingkp@gmail.com" 
	And Click on Next
	And User enters Password as "KpVpKMp@22"
	And Click on Next2
	Then The Home Button should be avaliable
	And close the browser
	
	
#Scenario Outline: Login Data Driven
#	Given User Launch Chrome browser
#	When User opens URL "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin"
#	And User enters Email as <email> 
#	And Click on Next
#	And User enters Password as <password>
#	And Click on Next2
#	Then The Home Button should be avaliable
#	And close the browser
#	
#	Examples:
#	|email|password|
#	|"admin123@gmail.com"|"qwe124"|
#	|"someonessomethingkp@gmail.com"|"KpVpKMp@22"|
#	|"admin123@gmail.com"|"KpVpKMp@22"|
#	|"someonessomethingkp@gmail.com"|"qwe124"|
#	