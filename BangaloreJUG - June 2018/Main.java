public class Main {
    public static void main(String... args) {
        Meetup meetup = new Meetup();
        meetup.setName("BangaloreJUG");
        meetup.setLocation("Oracle");

        System.out.println(meetup.getName());
        System.out.println(meetup.getLocation());
    }
}
