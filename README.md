# Simple CRUD API to manipulate a database

A simple API developed using Java and Spring Boot to manipulate a mysql database

# Technologies used

![image](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![image](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

## Environment variables

`DB_URL`

`DB_USER`

`DB_PASSWD`

## ENDPOINTS

POST
```
- add student:
http://localhost:8080/students/add

- body example:

{
	"name": "Kauan",
	"email": "kauan@email.com",
	"course": "CCO"
}
```

GET
```
- get all students:
http://localhost:8080/students/get-all

- get students by id:
http://localhost:8080/students/get-by-id/<id>
```

PUT
```
- update student:
http://localhost:8080/students/update/<id>

- body example:

{
	"name": "Paulo",
	"email": "paulo@email.com",
	"course": "ADS"
}
```

DELETE
```
- delete by id:
http://localhost:8080/students/delete-by-id/<id>

-delete all:
http://localhost:8080/students/delete-all
```


## Author

- [@KauanCavazani](https://www.github.com/KauanCavazani)
