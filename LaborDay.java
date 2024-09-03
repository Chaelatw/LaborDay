package laborday;

public class LaborDay {
    public static void main(String[] args) {

                /*
                                     Distance 	  = Fee
									0 -  5 miles  = $2
									6 - 15 miles  = $5
									16 - 25 miles = $10
									26 - 50	miles = $15
									More than 50 miles = $20
                 */
        int distance = 50;
        int fee = 20;
        String productName = "Milk";


        if (distance > 50) {
            fee = 20;
            System.out.println(productName);
            System.out.println(fee + "dollars");
            System.out.println(distance + "miles");

            } else if ((distance >= 6) && (distance <= 15)) {
                fee = 15;
                System.out.println(productName);
                System.out.println(fee + "dollars");
                System.out.println(distance + "miles");


                } else if ((distance >= 16) && (distance <= 25)) {
                    fee = 10;
                    System.out.println(productName);
                    System.out.println(fee + "dollars");
                    System.out.println(distance + "miles");


                    } else if ((distance >= 26) && (distance <= 50)) {
                        fee = 15;
                        System.out.println(productName);
                        System.out.println(fee + "dollars");
                        System.out.println(distance + "miles");
                        {


                        }

                    }
                }
            }



