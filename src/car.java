public class car {
    private String brand = "Volvo";
    private  String model = "v70";
    private  String color ="Red";
    private int doors = 4;
    private boolean isConvertible = false;

    public car(String brand, String model, String color, int doors, boolean isConvertible) {
        this.brand = brand ;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.isConvertible = isConvertible;
    }


    public void describCar(){
        System.out.println(doors + " -Door"+ color+ " "+ brand +" " + model + (isConvertible ? "Convertble":""));
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setBrand(String brand) {
        if (brand== null)brand = "Unknow";
        String lowcaseBrand = brand.toLowerCase();
        switch (lowcaseBrand){
            case " volvo", "porsche", "bmw " ->this.brand = brand;
            default -> this.brand = "Unkowan";
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }
}
