package com.company;

public class HealthyBurger extends Hamburger {
  private String healthyExtra1Name;
  private double healthyExtra1Price;
  private String healthyExtra2Name;
  private double healthyExtra2Price;

  public HealthyBurger(String meat, double price) {
    super("Healthy", meat, price, "Brown rye");
  }
 public void addHealthyAddition1(String toppingName, double toppingPrice){
    this.healthyExtra1Name = toppingName;
    this.healthyExtra1Price =toppingPrice;
 }
 public void addHealthyAddition2(String toppingName, double toppingPrice){
    this.healthyExtra2Name = toppingName;
    this.healthyExtra2Price =toppingPrice;
 }

}
 //And for the third class, HealthyBurger, there
//will be four(4) additional member variables called healthyExtra1Name, healthyExtra1Price, healthyExtra2Name, and
//healthyExtra2Price. The names are type String and the prices are type double. The constructor for this class accepts
//two(2) parameters for meat and price. Those are set in the constructor along with an appropriate name for the type
//of burger. Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and
//price for the addition, allowing for up to two(2) addons to the basic healthy burger. And finally the
//itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to
//the type of burger along with any addons. The method also returns the total price of the healthy burger of type
//double.