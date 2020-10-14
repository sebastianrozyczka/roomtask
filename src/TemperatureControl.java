public class TemperatureControl {
    public static void main(String[] args) {
        Room room = new Room(20, 20, true);

        System.out.println(room.showInfoAboutRoom());
        System.out.println(room.showInfoAboutCoolingStatus());
        System.out.println(room.showInfoAboutRoom());
        System.out.println(room.showInfoAboutCoolingStatus());
        System.out.println(room.showInfoAboutRoom());
        System.out.println(room.showInfoAboutCoolingStatus());
    }
}
