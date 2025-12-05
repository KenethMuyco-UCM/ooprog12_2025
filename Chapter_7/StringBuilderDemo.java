public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder nameString = new StringBuilder("Barbara");
        StringBuilder addressString = new StringBuilder("6111 Hickory Nut Grove Road");


        System.out.println("StringBuilder 1 nameString: " + nameString);
        System.out.println("Capacity of nameString is: " + nameString.capacity());

        System.out.println("StringBuilder 2 addressString: " + addressString);
        System.out.println("Capacity of addressString is: " + addressString.capacity());


        nameString.setLength(20);
        System.out.println("Length set to 20 for StringBuilder 1. " + nameString);

        addressString.setLength(20);
        System.out.println("Length set to 20 for StringBuilder 2. " + addressString);


        addressString.replace(0, addressString.length(), "address is 6111 Hickory Nut Gro");
        System.out.println("Length set to 20 for StringBuilder 2. " + addressString);
    }
}
