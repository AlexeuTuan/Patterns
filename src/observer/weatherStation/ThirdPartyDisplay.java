package observer.weatherStation;

import observer.Observer;

public class ThirdPartyDisplay implements DisplayElement, Observer {
    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
