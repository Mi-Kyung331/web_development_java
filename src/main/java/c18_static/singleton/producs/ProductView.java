package c18_static.singleton.producs;

public class ProductView {

    //싱글톤 패턴으로 작성하시오.
    private static ProductView instance = null;

    private ProductView() {
        System.out.println("ProductView 객체가 생성되었습니다.");
    }

    public static ProductView getInstance() {
        if (instance == null) {
            instance = new ProductView();
        }
        return instance;
    }




    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인 화면");
    }
    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 메인 화면");
    }





}
