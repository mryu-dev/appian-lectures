public class EnumerationExample1 {

     public enum Cars{
        MERCEDES(1),
        MITSUBISHI(1),
        MAZDA(3),
        TOYOTA(4),
        FERRARI(5);

         private final int id;
        Cars(int id) { this.id = id;}
        public int getValue() { return id; }
    }

    public void printCarsValues(){

        Cars[] carsArray = Cars.values();

        for (int i=0; i < carsArray.length; i++){

            Cars item = carsArray[i];

            System.out.print(" CAR: " + item.name() );

            System.out.println(" VALUE: " + item.getValue());

        }

    }

    public void printOneCar(){
    	System.out.println(" ------- \n print just one item \n ");
       System.out.println("Car: " + Cars.MAZDA + " Value: " 
        + Cars.MAZDA.getValue());
    } 

    public static void main(String[] args){
         EnumerationExample1 example = new EnumerationExample1();
        example.printCarsValues();
        // print just one item
        example.printOneCar();
    }

}
