# 🤖 Assistant REST API Endpoints 🚀

This README provides a brief overview of the REST API endpoints available in the AssistantController.

## Endpoints

### 1. Add Assistant
- **URL:** `/assistant`
- **Method:** POST
- **Description:** Creates a new assistant.
- **Request Body:** AssistantDto
- **Response:** AssistantDto
- **Status Codes:** 
    - 🎉 201 Created: Successful creation of the assistant.

[![👋 Add Assistant Endpoint](https://example.com/add_assistant.png)](https://example.com/add_assistant.png)

### 2. Get Assistant by ID
- **URL:** `/assistant/{id}`
- **Method:** GET
- **Description:** Retrieves an assistant by ID.
- **Path Variable:** id (Integer)
- **Response:** AssistantDto
- **Status Codes:** 
    - ✅ 200 OK: Successful retrieval of the assistant.

[![🔍 Get Assistant by ID Endpoint](https://drive.google.com/file/d/1cf4L_pGM-d3cowFNn-IiKgwngSMRX73k/view?usp=sharing)

### 3. Update Assistant
- **URL:** `/assistant/{id}`
- **Method:** PUT
- **Description:** Updates an existing assistant.
- **Path Variable:** id (Integer)
- **Request Body:** Updated AssistantDto
- **Response:** AssistantDto
- **Status Codes:** 
    - ✨ 200 OK: Successful update of the assistant.

[![✏️ Update Assistant Endpoint](https://drive.google.com/file/d/1W5Iv7LDK1mMaGlXyKqwVG-BPhns1aoR2/view?usp=sharing)

### 4. Increment Salary
- **URL:** `/assistant/{id}/increment`
- **Method:** PUT
- **Description:** Increments the salary of an assistant.
- **Path Variable:** id (Integer)
- **Request Body:** Map containing "increment" value (Double)
- **Response:** AssistantDto
- **Status Codes:** 
    - 💰 200 OK: Successful salary increment.

[![💵 Increment Salary Endpoint](https://drive.google.com/file/d/162gUsiqm166ej5Dirx8W5edtkrDVSKwA/view?usp=sharing)

### 5. Get All Assistants
- **URL:** `/assistant`
- **Method:** GET
- **Description:** Retrieves all assistants.
- **Response:** List of AssistantDto
- **Status Codes:** 
    - ✅ 200 OK: Successful retrieval of assistants.

[![📋 Get All Assistants Endpoint](https://drive.google.com/file/d/1RUyHkJzUK1rEoHEWEQDRX4yBfXXD4TgZ/view?usp=sharing)

### 6. Delete Assistant by ID
- **URL:** `/assistant/{id}`
- **Method:** DELETE
- **Description:** Deletes an assistant by ID.
- **Path Variable:** id (Integer)
- **Response:** String confirmation message
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of the assistant.

[![🗑️ Delete Assistant by ID Endpoint](https://drive.google.com/file/d/1TVEWfOm81btSG-D2CBMqOSLWinEARLpW/view?usp=sharing)

### 7. Delete All Assistants
- **URL:** `/assistant`
- **Method:** DELETE
- **Description:** Deletes all assistants.
- **Response:** String confirmation message
- **Status Codes:** 
    - ✅ 200 OK: Successful deletion of all assistants.

[![🗑️ Delete All Assistants Endpoint](https://drive.google.com/file/d/1RWNWJDX2a0hgwCTxJAFkKD7C6ElE12qg/view?usp=sharing)
