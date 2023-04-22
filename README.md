# PostTask
Steps for run the project 
1- run the sql files to create mysql schima 
2- add your dataSource(username and password and url) to the resources/application.Properties file 
3- run the project by command (mvn Spring-boot:run)
4- you should create user in database like 
 "userId": 1,
 "userEmail": "ali@gmail.com",
 "userName": "ali"

5- you can test post method by this body :
{
        "user": {
            "userId": 1,
            "userEmail": "ali@gmail.com",
            "userName": "ali"
        },
        "body": "new post body",
        "tittle": "sport",
        "id": 3
}


note:look to the ERD diagram.png  

