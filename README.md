![Screenshot 2025-01-30 224529](https://github.com/user-attachments/assets/7cab89a5-d375-437c-823b-11b7d4e3631d)
1) What does your Java program do?
  I have created a Spring Boot application called Students, which manages student details.
  It allows adding, updating, deleting, and fetching student records.
  I used PostgreSQL as the database to store student details.
2) What does each Docker image do?
  I used two Docker images:
  PostgreSQL Image (postgres) → Runs the database for storing student records.
  Spring Boot Application Image (student-app) → Runs the Spring Boot application and connects to PostgreSQL.
3) APIs exposed and details of the APIs
  GET /students → Fetch all students
  POST /students → Add a new student
  GET /student/{id} → Get student details by ID
  DELETE /students/{id} → Delete a student by ID
