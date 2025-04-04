# Milk_App  
## Farmer Module – Functionality Overview  

This module simulates the core functionalities of a farmer's digital ecosystem, where a farmer can register, make milk collection requests, view their transaction history, and interact with cooperatives and agrovets. It’s designed as part of a larger app where other modules (by other teams) handle IDs, external data, and backend services.  

## Main Functional Flow  

The app starts with the `Main` class, which:  

- Collects basic farmer details from user input: name, phone number, location, and cow count.  
- Instantiates a `Farmer` object using this information.  
- Registers the farmer (simulated by printing a success message).  
- (Optionally) Simulates further interactions such as making collection requests, viewing transactions.  

Unique identifiers like farmer ID, cooperative ID, collection request ID, etc., are not provided by this module. They are assumed to be generated or provided by other parts of the system.  
