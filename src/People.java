 interface Restaurant {
    public default void menu(){
        System.out.println("Staters 1.Chilli Chicken, 2.Tandoori,3.butter nan with panner masala,4,crispy corn");
        System.out.println("Meals 1.Chicken biryani,2.Mutton biryani,3.Egg biryani,4.Veg biryani");
    }
    public default void bill(){
        System.out.println("the amount to be paid is:2,000");
    }
    interface Server{

        public default void serve() {
            System.out.println("Food is Served");
        }
        public default void takeorder(){
            System.out.println("TakeOrder Staters 1.Chilli Chicken, 2.Tandoori");
            System.out.println("TakeOrder Meals 1.Chicken biryani");
        }
    }
    class People implements Restaurant,Server{
        public void giveorder() {
            System.out.println("Given order Staters 1, 2");
            System.out.println("Given order Meals 1");
            }
            public void payedbill () {
                System.out.println("the bill paid by the people : 2,000");
            }
    }
         public static void main(String args[]){
            People p=new People();
            p.menu();
            p.takeorder();
            p.giveorder();
            p.serve();
            p.bill();
            p.payedbill();
        }

    }

