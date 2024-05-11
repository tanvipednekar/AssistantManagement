# 🤖 Assistant REST API Endpoints 🚀

This README gives a brief overview of the REST API endpoints that have been mentioned in the AssistantController.

## Endpoints

### 1. Add Assistant
- **URL:** `http://localhost:8080/assistant`
- **Method:** POST
- **Status Codes:** 
    - ✅ 201 Created: Successful creation of the assistant.

![👋 Add Assistant Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20174729.png?raw=true)

### 2. Get Assistant by ID
- **URL:** `http://localhost:8080/assistant/{id}`
- **Method:** GET
- **Status Codes:** 
    - ✅ 200 OK: Successful retrieval of the assistant.

![🔍 Get Assistant by ID Endpoint](https://private-user-images.githubusercontent.com/140900337/329245745-0d3ec52e-97a4-4f23-a88f-17b74dc06ce2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzQ1LTBkM2VjNTJlLTk3YTQtNGYyMy1hODhmLTE3Yjc0ZGMwNmNlMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00ZDM5MzRiNGU1OGJiM2NlYzcxOWE4MDlhZDY3MmYwYTExZWI2YzY3MDQ0N2YyODhiNjAyMzA3ZWFmZjhmMDM5JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.YqSWJ2kdQhNbjvkzoKQituH_Di1dzU4xeFtDQvBdHl0)

### 3. Update Assistant
- **URL:** `http://localhost:8080/assistant/{id}`
- **Method:** PUT
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful update of the assistant.

![✏️ Update Assistant Endpoint](https://private-user-images.githubusercontent.com/140900337/329245718-c49d996e-c136-4dfd-817b-3e598de5619c.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzE4LWM0OWQ5OTZlLWMxMzYtNGRmZC04MTdiLTNlNTk4ZGU1NjE5Yy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xZTFmNmEwNTNjYTFhN2Y0MjMwYTJhZTUxMzU0Y2E3NTBjZWZlM2ZkNjI1YzBmODBlNjI5ZThjYmM1NGQ0MGQ2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.wZEHOgeeKQg4MXd6i979D4Ygm5k-AQ-aSBWWUBsx3Rc)

### 4. Increment Salary
- **URL:** `http://localhost:8080/assistant/{id}/increment`
- **Method:** PUT
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful salary increment.

![💵 Increment Salary Endpoint](https://private-user-images.githubusercontent.com/140900337/329245766-08c7153d-eda4-4b13-b584-3476e3ff528b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzY2LTA4YzcxNTNkLWVkYTQtNGIxMy1iNTg0LTM0NzZlM2ZmNTI4Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT01MDhiM2I2ZDg4NTNmNWE0YjJiNjhlYmQ1YjhhNTk4YzI1OTVmMDFjOTI5MGU1ODMzNjliMzNiN2YyMzQ1ODQ0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.kZNOhfnQ8pauoWSQarTUrLgZHdRiujLJTGjNJtRPXbc)

### 5. Get All Assistants
- **URL:** `http://localhost:8080/assistant`
- **Method:** GET
- **Status Codes:** 
    - ✅ 200 OK: Successful retrieval of assistants.

[![📋 Get All Assistants Endpoint](https://private-user-images.githubusercontent.com/140900337/329245735-30c9462d-55c6-4d99-b948-b06f4bdf16d1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzM1LTMwYzk0NjJkLTU1YzYtNGQ5OS1iOTQ4LWIwNmY0YmRmMTZkMS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNjkyYzZhOTNkNjgxYTM1NDQ0MmY2OTNjZjA1MzQ1ZWYxNDBmOGYyMjRhOTE1ZTE4ZGU1NWZhMzgzZWQ3NThhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.vCSIpMGe1Hmd65wdWlJqH2w7-JN28SN6F9dZopCoMk4)

### 6. Delete Assistant by ID
- **URL:** `http://localhost:8080/assistant/{id}`
- **Method:** DELETE
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of the assistant.

[![🗑️ Delete Assistant by ID Endpoint](https://private-user-images.githubusercontent.com/140900337/329245761-642aa8b9-ec98-4f09-b54d-dff408ba6c2f.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzYxLTY0MmFhOGI5LWVjOTgtNGYwOS1iNTRkLWRmZjQwOGJhNmMyZi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00MDMyMzhiZTRmOWZjYzE1MDllM2E5ZTk0ZDRlMmEzNzM4OTk3MGZjZjM5MzVlOTkxYzY3MTM1YzlmNDcxN2E4JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.n0Dw7IRaE4oWTGezeEL8X_egpKo7yXyKJzVlO97WHKk)

### 7. Delete All Assistants
- **URL:** `http://localhost:8080/assistant`
- **Method:** DELETE
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of all assistants.

[![🗑️ Delete All Assistants Endpoint](https://private-user-images.githubusercontent.com/140900337/329245755-902c90b8-c913-4548-a666-9f1b0b9ab928.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTUyNTgzNDIsIm5iZiI6MTcxNTI1ODA0MiwicGF0aCI6Ii8xNDA5MDAzMzcvMzI5MjQ1NzU1LTkwMmM5MGI4LWM5MTMtNDU0OC1hNjY2LTlmMWIwYjlhYjkyOC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTA5JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUwOVQxMjM0MDJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMWZkZTJlNTRjMmFkMzQ4YWQxMzU2ZDA0MTUyOWM1NzE3Y2JmNzY3NTBkOWJiMTk3NDMwMzA4OGZhMTcwMzZmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.bh5kBhrptsUkR8OTSLcKpcHvFwhm_OSeudWCuDiJoRQ)
