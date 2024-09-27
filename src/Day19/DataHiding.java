package Day19;

class Car {
    private String model;
    private int year;

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public int getYear() {
        return year;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setYear(2022);

        System.out.println("Car model: " + car.getModel());
        System.out.println("Car year: " + car.getYear());
    }
}
