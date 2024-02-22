class CarDetails{
  String model, color;
  public CarDetails(String model, String color){
    this.model = model;
    this.color = color;
  }

  public String getModel(){
    return model;
  }

  public String getColor(){
    return color;
  }

  public void setModel(String model){
    this.model = model;
  }

  public void setColor(String color){
    this.color = color;
  }

  public void display(){
    System.out.println("Car Name: " + model + "\nCar Color: " + color);
  }
}

public class CarModel {
  public static void main(String[] args) {
    CarDetails car = new CarDetails();
    car.setModel("Lamborghini");
    car.setcolor("White");

    car.display();    
  }
}
