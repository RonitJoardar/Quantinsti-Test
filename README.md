# Quantinsti Test
##Import the project
1.Once the Project has been Cloned/Downloaded from git go to Eclipe
2.Click on File>>Import>>Existing Maven Project>>Select Quantinsti Selenium Assignment from your stored directory and click on finish
3.The project should be visible in the Project explorer

##Change Chromedriver path in config file
1. Before running the project change the chromedriver path in config.properties
2. In the projec go to src>>main>>resource>>config.properties and open the file
3. The config file will have a variable named ChromePath
4. Change the driver path with the path of driver from you machine, here I have mentioned the formats for MAC and Windows please follow the same file path format depending on your Operating System.

##Running the Project -UI
1. To Run the project Right click on the pom.xml file>>Click on Run As>>Maven install
2. This might take a few minutes in the first attempt as maven will be updating its plugins
3. Post which you will see that the tests start to Run
4. On Test completion you can see the reports

##Running the Project - Terminal
1. To Run the project from terminal go the the project folder using cd <path to the project folder in your computer>
2. Once you the in the folder execute 'mvn install  -DdefaultSuiteFiles="./pom.xml,"' without the single quotes.

##Reports
1. HTML report generated by cucumber will be present in test-output folder.
2. Name of the file is index.html
3. Other descriptive reports will be present in the target folder in .html and .pdf formats


##Screenshots
1.Screenshots will be present under the folder QuaninstiSeleniumAssignment>>Screenshots.


