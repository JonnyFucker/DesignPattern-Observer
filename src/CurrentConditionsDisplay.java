/**
 * Created by tomek on 26.01.16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject waterData;

    public CurrentConditionsDisplay(Subject waterData) {
        this.waterData = waterData;
        waterData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
