class Developer {
    void role() {
        System.out.println("Developer writes code");
    }
}

class JavaDeveloper extends Developer {
    void language() {
        System.out.println("Java Developer works with Java");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        jd.role();
        jd.language();
    }
}
