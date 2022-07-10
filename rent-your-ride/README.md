This project is simplified app, that has the following functionalities:

    - user registration (uses Template Method - Behavioral Pattern)
    - option to pick a scooter (uses Decorator - Structural Pattern)
    - check zone (uses Factory Method - Creational Pattern)
    - check if parking is correct (uses Strategy - Behavioral Pattern)

Description:

    User can have 3 levels (Bronze, Silver or Gold), each level
    has different ratio used for price calculation.
    Level is obtained by enetering code.

    User can choose one of 3 types of scooters (Basic, Advanced and Super).
    Each type has different ratio used for price calculation.

    There are 3 zones (areas of driving), each of them also have a special ratio,
    which is used for calculation.

    When user finishes a ride, scooter has to be correctly parked.

    If scooter is parked correctly, app obtains information about driven kilometers
    and calculates price = total km * price per km * user ratio * zone ratio
