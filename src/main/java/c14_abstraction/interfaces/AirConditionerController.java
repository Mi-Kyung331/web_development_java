package c14_abstraction.interfaces;

public class AirConditionerController {

    // 필드 선언
    private PowerButton powerButton;
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;

    // AllArgsConstructor 정의
    public AirConditionerController(PowerButton powerButton, TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton) {
        this.powerButton = powerButton;
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
    }


    // 메서드 선언
    public void powerButton(){
        powerButton.onPressed();
    }

    // 온도 낮추는 메서드
    public void onPressedTemperatureDownButton(){
        temperatureDownButton.onPressed();
    }
    public void onDownTemperatureDownButton(){
        temperatureDownButton.onDown();
    }

    // 온도 높히는 메서드
    public void onPressedTemperatureUpButton(){
        temperatureUpButton.onPressed();
    }
    public void onUpTemperatureUpButton(){
        temperatureUpButton.onUp();
    }




}
