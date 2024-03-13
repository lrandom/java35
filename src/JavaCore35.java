import models.Human;

public class JavaCore35 {
    public static void main(String[] args) {
        //Human luan = new Human();
        //luan.age = 20;
        Button button = new Button();
        button.addClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ABC");
            }
        });


    }
}
