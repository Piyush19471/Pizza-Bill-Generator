public class Pizza {
    private int price ;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int bagPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToppingsAdded=false;
    private boolean isTakeAwayAdded=false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }
    public void addExtraChees(){
        isExtraCheeseAdded=true;
        this.price+=extraCheesePrice;

    }
    public void addExtraToppings(){
        isExtraToppingsAdded =true;
        this.price+=extraToppingsPrice;
    }
    public void takeAway(){
        isTakeAwayAdded=true;
        this.price+=bagPackPrice;
    }
    public void getBill(){
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            System.out.println("Extra cheese: "+extraCheesePrice);
        } if (isExtraToppingsAdded) {
            System.out.println("Extra toppings: "+extraToppingsPrice);
        } if (isTakeAwayAdded) {
            System.out.println("Opted for take away: "+bagPackPrice);
        }
        System.out.println("Total price of Pizza: "+this.price);
    }
}
