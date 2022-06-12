# TAXER


>The **TAXER** project allows you to order public transport service from different cabs, to see the information about the runs made by the drivers and also to see the information about the order made.
<hr>

### VISUAL

![OPERATION OF THE APP](/img/imgOne.jpg "OPERATION OF THE APP")

[img1]:/img/imgTwo.jpg "OPERATION OF THE APP"
![OPERATION OF THE APP][img1]

![OPERATION OF THE APP](/img/imgThree.jpg "OPERATION OF THE APP")

![OPERATION OF THE APP](/img/imgFour.jpg "OPERATION OF THE APP")

![OPERATION OF THE APP](/img/imgFive.jpg "OPERATION OF THE APP")
<hr>

### EXPLANATION OF THE PROJECT

>It was decided to divide the classes into different packages depending on which MVC architecture pattern it belongs to.
>- MODEL PACKAGE: all the classes where we create the objects with their own attributes and their getters/setters methods.
>>- SIMULATOR CLASS: which is responsible for simulating the passage of time of the race, in which when the iteration of the list is divisible by 5 this helps to obtain a cab already available.
>- DB PACKAGE: this helps us to simulate a small database inside our app where it stores the information of the classes DRIVERS and TAXIS.
>- TEST PACKAGE: This is where we carry out different tests of the different methods, in this way we check their correct operation, besides being able to solve different errors that may occur.
>- UTILS PACKAGE:
>>- CLASS COLOR: this class of the UTILS package is in charge of storing the different colors which we can use to style the output messages.
>>- PRINTER CLASS: this class is in charge of printing predetermined messages inside the output.
>>- PRINTSTYLE CLASS: it is in charge of styling the messages.
>>- REGULAREXPRESSION CLASS: this class is in charge of helping to validate the answers entered by the user.
>>- CLASS VALIDATOR: this class helps to validate the input of the fields where the user enters his information.
>>- VALUESREQUEST CLASS: helps to validate that the values entered are correctly entered.
>- VIEW PACKAGE: the classes of this package are in charge of printing the necessary information of each object created in the model package.
>>- PRINTABLE CLASS: child class of the printer class of the utils package, it helps to print the required information of the view classes, besides implementing the use of colors and styles for the messages.
>- CONTROLLER PACKAGE:
>>- CONTROLLABLE INTERFACE: this interface contains the generalInformation() method which is repeated in different classes, in this way we implement the Open/Closed principle, since this method will perform different actions.
>>- CLIENTCONTROLLER CLASS: this is in charge of connecting between the model and the view of the Client class, besides obtaining the necessary information from the client, it also implements the generalInformation() method to return all the necessary information.
>>- RACECONTROLLER CLASS: this is in charge of connecting to the Race view and model, in addition to obtain the necessary information regarding the race performed, and display such information to the user when running the app.
>>- TAXICONTROLLER CLASS: this class is in charge of joining the model and view of the cab, besides showing the information of the race and implements the generalInformation() method.
>>- TAXERRIDECONTROLLER CLASS: this is in charge of obtaining all the necessary information about the race to be performed, as well as displaying it.
>>- TAXERCONTROLLER CLASS: this is in charge of providing all the logic of the operation of the app, in addition to gather it in a method which will help to initialize the app.
>- MAIN CLASS: this one is simply in charge of initializing the app.
<hr>

### DIFFICULTIES

* Show all the runs made, because we needed to change the code a little bit.
* We could not implement the database, with problems regarding the use of the driver to make the connection.

<hr>

### EXTRAS

* Validation of the answers entered.
* Styles and colors.
* Database simulation through ArrayList.

<hr>

### AUTHORS

* Santiago Caballero Manzaneda
* Jorge Ignacio Heredia Bazoalto
* Karina Aguirre Janco
* Cristian Sebastian Barra Zurita
* Denis Jorge Gandarillas Delgado

