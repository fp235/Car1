import javax.swing.JOptionPane;

public class CarDriver {

	public static void main(String [] args) {
		String car1Color, car2Color, car3Color, car4Color,
		       rCar1HorsePower, rCar2HorsePower, rCar3HorsePower,
		       rCar1EngineSize, rCar2EngineSize, rCar3EngineSize;
		double car1HorsePower, car2HorsePower, car3HorsePower, car4HorsePower,
		       car1EngineSize, car2EngineSize, car3EngineSize, car4EngineSize;
		car1Color = JOptionPane.showInputDialog(null, "Car 1 Color:");
		rCar1HorsePower = JOptionPane.showInputDialog(null, "Car 1 Horse Power:");
		rCar1EngineSize = JOptionPane.showInputDialog(null, "Car 1 Engine Size:");
		car2Color = JOptionPane.showInputDialog(null, "Car 2 Color:");
		rCar2HorsePower = JOptionPane.showInputDialog(null, "Car 2 Horse Power:");
		rCar2EngineSize = JOptionPane.showInputDialog(null, "Car 2 Engine Size:");
		car3Color = JOptionPane.showInputDialog(null, "Car 3 Color:");
		rCar3HorsePower = JOptionPane.showInputDialog(null, "Car 3 Horse Power:");
		rCar3EngineSize = JOptionPane.showInputDialog(null, "Car 3 Engine Size:");
		car1HorsePower = Double.parseDouble(rCar1HorsePower);
		car1EngineSize = Double.parseDouble(rCar1EngineSize);
		car2HorsePower = Double.parseDouble(rCar2HorsePower);
		car2EngineSize = Double.parseDouble(rCar2EngineSize);
		car3HorsePower = Double.parseDouble(rCar3HorsePower);
		car3EngineSize = Double.parseDouble(rCar3EngineSize);
		car4Color = car1Color;
		car4HorsePower = car1HorsePower;
		car4EngineSize = car1EngineSize;
		Car car1 = new Car(car1Color, car1HorsePower, car1EngineSize);
		Car car2 = new Car(car2Color, car2HorsePower, car2EngineSize);
		Car car3 = new Car(car3Color, car3HorsePower, car3EngineSize);
		Car car4 = new Car(car4Color, car4HorsePower, car4EngineSize);
		JOptionPane.showMessageDialog(null, "Car 1 Specifications: " + car1 +
									  "\nCar 2 Specifications: " + car2 +
									  "\nCar 3 Specifications: " + car3 +
									  "\nCar 4 Specifications: " + car4 +
									  "\nCar 1 = Car 2?        " + car1.equals(car2) +
									  "\nCar 1 = Car 3?        " + car1.equals(car3) +
									  "\nCar 1 = Car 4?        " + car1.equals(car4) +
									  "\nNumber of Cars:       " + Car.getCount());
		
	}
	     }
