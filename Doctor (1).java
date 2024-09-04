public class Doctor {
    public static void fly(){
        System.out.println("I am flying");
    }

    public static void sing(){
        System.out.println("I am singing");
    }
    public static class Surgeon extends Doctor {
        void Surgeon_Details() {
            System.out.println("Surgeon  Detail...");
            System.out.println(Department = "Cardio");
        }
    }


}
