# Museum Software System

## Project Overview
We are developing a website for the imaginary museum of a small imaginary town. The museum has ten rooms to display artwork and a storage room. Five of the ten rooms are large rooms and can fit 300 artworks, and the remaining five are smaller rooms that can only fit 200 artworks. The storage room of the museum is very large and can store an almost unlimited number of artworks.

The museum is managed by its owner who gets their own user account. The museum also has several employees, each of which gets their own account. Museum visitors can choose to create an account as well. Through their account the owner can manage and decide on numerous things related to the museum: opening hours, employee schedules, visitor fees, rental fees, hiring/firing employees, etc. Employees, on the other hand, can use their accounts to decide which artwork goes into which room and whether an artwork is on display (in a room) or in storage. The manager can do all the tasks that an employee can. Using a visitor account, a visitor can purchase museum passes, browse all artwork the museum owns, and request to take an item on loan. If a visitor wants to take an item on loan, they must pay a fee and this must be approved by an employee. However, not all items are available for loan.

## Instructions to run the website
Our application can be run by running the MuseumSoftwareSystemApplication.java class, which can be found under src/main/java/ca.mcgill.ecse321.MuseumSoftwareSystem. It is deployed locally on port 8090 of the computer of the person running it. Once it is running, it can be accessed through the web by accessing the URL http://localhost:8090/, and then all the endpoints which were implemented can be accessed by appending their name/parameters to this base URL (see RESTful Service Endpoints).

It is possible to build the application by running the command gradlew build on the command line, which also runs all the tests which were implemented (repository, unit (service) and integration tests).

Once the backend application is running, running the frontend can be done by running the command npm run serve from the command line once in the frontend directory. Note: It is important to run npm install in the frontend directory before attempting to launch the frontend so as to resolve any uninstalled dependencies.

The frontend is deployed on localhost port 8081, whereas the backend is deployed on localhost port 8090.
