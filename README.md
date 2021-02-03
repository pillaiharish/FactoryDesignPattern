# FactoryDesignPattern
JAVA Factory Design Pattern implementation
It contains all the contents regarding Factory Design Pattern using JAVA. The example is that of calculating the price per minute of various mobile network service providers.
The objects are instantiated dynamically and used whenever required using factory design pattern. There are 3 basic networks-- ABC PQR XYZ. CellularPlan is an abstract class 
thatcontains the protected variable rate with return type double, abstract getRate method and non-abstract processBill method which will return the total cost of bill.
SelectNetworkFactory is the file which creates factory objects. The main function is in PhoneBill which will ask user to input the network and the minutes of service.
