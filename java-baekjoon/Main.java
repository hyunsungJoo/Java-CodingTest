class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        draw();  // 이게 핵심!
        System.out.println("Super Object");
    }
}

class SubObject extends SuperObject {
    public void paint() {
        super.draw();  // SuperObject의 draw() 호출
    }

    public void draw() {
        System.out.println("Sub Object");
    }
}

public class Main {
    public static void main(String[] args) {
        SuperObject a = new SubObject();
        a.paint();
    }
}
