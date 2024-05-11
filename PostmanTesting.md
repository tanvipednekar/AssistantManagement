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

![🔍 Get Assistant by ID Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20174822.png?raw=true)

### 3. Update Assistant
- **URL:** `http://localhost:8080/assistant/{id}`
- **Method:** PUT
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful update of the assistant.

![✏️ Update Assistant Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20174925.png?raw=true)

### 4. Increment Salary
- **URL:** `http://localhost:8080/assistant/{id}/increment`
- **Method:** PUT
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful salary increment.

![💵 Increment Salary Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20175016.png?raw=true)

### 5. Get All Assistants
- **URL:** `http://localhost:8080/assistant`
- **Method:** GET
- **Status Codes:** 
    - ✅ 200 OK: Successful retrieval of assistants.

![📋 Get All Assistants Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20174843.png?raw=true)

### 6. Delete Assistant by ID
- **URL:** `http://localhost:8080/assistant/{id}`
- **Method:** DELETE
- **Path Variable:** id (Integer)
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of the assistant.

![🗑️ Delete Assistant by ID Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20175036.png?raw=true)

### 7. Delete All Assistants
- **URL:** `http://localhost:8080/assistant`
- **Method:** DELETE
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of all assistants.

![🗑️ Delete All Assistants Endpoint](https://github.com/tanvipednekar/AssistantManagement/blob/master/PostmanScreenShots/Screenshot%202024-05-09%20175049.png?raw=true)
