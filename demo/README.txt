Spring Boot application that polls a news feed every 5 minutes and stores the changes in a in memory database

Setup:

1. Import the project as an existing maven project in your IDE
2. Run the project as Spring Boot App
3. Login to H2 database:
	- Enter http://localhost:8080/h2-console in your browser
	- Enter the following for:
		JDBC URL: jdbc:h2:mem:test
		User Name: root
		Password: [leave empty]
	- Connect
4. Select the ITEM table. SELECT * FROM ITEM statement will be automatically generated in the console. Run the statement
