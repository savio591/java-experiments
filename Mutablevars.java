class Mutablevars {

    public static String showFullName() {
        String name = "Aàpo"; // Mutable variable
        name = "Savio"; // Changed name variable

        final String lastName = "Castelo"; // Immutable variavle, "final" at start
        String fullName;

        fullName = name + " " + lastName; // concat
        return fullName;
    }

    public static void main(String[] args) {
        System.out.println(showFullName());
    }

};
