package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannerDownButton channerDownButton;
    private ChannerUpButton channerUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    /*
        AllArgsConstructor를 정의하세요.
     */

    public RemoteController(PowerButton powerButton, ChannerDownButton channerDownButton, ChannerUpButton channerUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channerDownButton = channerDownButton;
        this.channerUpButton = channerUpButton;
        this.volumeDownButton = volumeDownButton;
        this.channerUpButton = volumeUpButton;
    }

    // 메서드 정의
    //PowerButton의 매서드 구현
    public void onPressedPowerButton(){
        powerButton.onPressed();        // 필드로 powerButton 객체를 지니고 있기 때문에
                                        // PowerButton 클래스에서 정의했던 메서드를 호출 가능
    }


    // ChannerDownButton의 메서드 구현
    public void onPressedChannerDownButton(){
        channerDownButton.onPressed();
    }
    public void onDownChannerDownButton(){
        channerDownButton.onDown();
    }

    // ChannerUpButton의 메서드 구현
    public void onPressedChannerUpButton(){
        channerUpButton.onPressed();
    }

    public void onUpChannerUpButton(){
        channerUpButton.onUp();
    }



    // VolumeDownButton의 메서드 구현
    public void onPressedVolumeDownButton(){

    }

    public void onDownVolumeDownButton(){

    }

    // VolumeUpButton의 메서드 구현
    public void onPressedVolumeUpButton(){

    }

    public void onUpVolumeDownButton(){

    }




}
