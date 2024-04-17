//In the below java program bulb class inherits the class
//Therefore, we can say that bulb is having an Is-A relatinship
//with the class device Hence bulb is a divice

class Device {

    private String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}

public class BulbIsARela extends Device {
    public static void main(String[] args) {
        Device obj = new BulbIsARela();

        obj.setDeviceName("Ultra TechBulb");
        System.out.println(obj.getDeviceName());

    }

}
