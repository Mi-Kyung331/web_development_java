package c14_abstraction.interfaces;

public class RemoteController {
    // 필드 선언
    private PowerButton powerButton;
    private ChannerDownButton channerDownButton;
    private ChannerUpButton channerUpButton;
    // 추가된 필드
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;  // 이 필드들을 추가하는 순간에 AllArgsConstructor가 아니게 된다.
    // 그렇기 때문에 밑에 있는 생성자를 수정할 필요가 있다.

    /*
        AllArgsConstructor를 정의하세요.
     */

    public RemoteController(PowerButton powerButton, ChannerDownButton channerDownButton, ChannerUpButton channerUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channerDownButton = channerDownButton;
        this.channerUpButton = channerUpButton;
        // 소괄호 내의 매개변수를 수정했기 때문에 이하의 코드가 필요함
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
        // 마찬가지로 이걸 완성하는 순간 Main단계에서 오류가 발생함 > 아까전에는 Main이 AllArgs를 만족했으나 이젠 아님
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
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton(){
        volumeDownButton.onDown();
    }

    // VolumeUpButton의 메서드 구현
    public void onPressedVolumeUpButton(){
        volumeUpButton.onPressed();
    }

    public void onUpVolumeDownButton(){
        volumeUpButton.onUp();
    }




}
