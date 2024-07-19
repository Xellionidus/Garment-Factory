public class GarmentSimulator {
     public static void main(String[] args) {
            // Testing the Professional Garment Factory
            testGarmentFactory(new ProfessionalGarmentFactory());

            // Testing the Casual Garment Factory
            testGarmentFactory(new CasualGarmentFactory());

            // Testing the Party Garment Factory
            testGarmentFactory(new PartyGarmentFactory());
        }

        // Option to test a Garment Factory
        public static void testGarmentFactory(GarmentFactory factory) {
            // Creating products using the factory
            Top top = factory.createTop();
            Pants pants = factory.createPants();
            Shoes shoes = factory.createShoes();

            // Wearing the created products
            top.wear();
            pants.wear();
            shoes.wear();
            System.out.println("-----");
        }
    }
