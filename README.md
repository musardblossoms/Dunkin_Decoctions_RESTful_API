# Dunkin_Decoctions_RESTful_API

Notes:
API for buying potions.
Create an API that interacts with the Potion object.
Be able to save the object. - H2
Potions should have an object and associated picture.

1/17/2024 January 17th: 
Austin & Alfredo & Nan got H2 working locally and the tables populated.

1/19/2024 January 18th:
fastfreddy - Implemented endpoint for providing data access to users.

Brief overview of each component recently added :

    - Entities:
        * Purpose:     Represent the data model for the application. Each entity corresponds to a table in the database,
                       with fields representing the columns.
        * Explanation: These are Java classes annotated with JPA annotations (@Entity, @Table, @Colum, etc.) to map them
                       to the corresponding database tables and columns.
    - Repository:
        * Purpose:     Provide an abstraction over the data access layer. Repositories handle CRUD operations and database
                       interactions for specific entities.
        * Explanation: This is an interface that extends 'JpaRepository', providing methods to perform operations like
                       finding, saving, and deleting.
    - Service:
        * Purpose:     Encapsulate the business logic of your application, acting as an intermediary between the controller 
                       and repository layers.
        * Explanation: The HealthPotionService interface defines business operations related to health potions, and 
                       HealthPotionServiceImpl provides the implementation. This layer uses the HealthPotionRepository 
                       to interact with the database and implements additional logic as required.
    - Controller:
        * Purpose:     Handle incoming HTTP requests, interact with the service layer, and return responses to the client.
        * Explanation: This is a Spring MVC controller class annotated with @RestController and @RequestMapping. It 
                       defines API endpoints for operations like retrieving all health potions, finding potions by name.
                       The controller uses 'HealthPotionService' to perform operations and manage the request-response 
                       lifecycle.