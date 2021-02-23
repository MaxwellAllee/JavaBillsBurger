package com.company;

public class DeluxeBurger extends Hamburger {
  public DeluxeBurger() {
    super("Deluxe", "Sausage & Bacon", 14.10, "White");
    super.addHamburgerAddition1("Chips", 2.50);
    super.addHamburgerAddition2("Drinks", 2.50);
  }
  @Override
  public void addHamburgerAddition1(String addTopping, double addPrice) {
    System.out.println("Cannot not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition2(String addTopping, double addPrice) {
    System.out.println("Cannot not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition3(String addTopping, double addPrice) {
    System.out.println("Cannot not add additional items to a deluxe burger");
  }

  @Override
  public void addHamburgerAddition4(String addTopping, double addPrice) {
    System.out.println("Cannot not add additional items to a deluxe burger");
  }
}
// For the second class, DeluxeBurger, there are no additional member
//variables, and the constructor accepts no parameters. Instead, the constructor creates a deluxe burger with all
//the fixings and chips and a drink for a base price of $19.10. The constructor can be configured in any way, as
//long as chips and drink are added for the total price just mentioned. In this class, the four(4) methods defined
//in the Hamburger class for including additional toppings must each be overridden so that a message is printed
//stating that no additional items can be added to a deluxe burger.And for the third class, HealthyBurger, there
//will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and
//healthyExtra2Price. The names are type String and the prices are type double. The constructor for this class accepts
//two(2) parameters for meat and price. Those are set in the constructor along with an appropriate name for the type
//of burger. Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and
//price for the addition, allowing for up to two(2) addons to the basic healthy burger. And finally the
//itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to
//the type of burger along with any addons. The method also returns the total price of the healthy burger of type
//double.