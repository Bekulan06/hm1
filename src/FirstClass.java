public class FirstClass {
   private enum first{
        A
    }
    private int level;
    private String name;

    public void setLevel(int level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirstClass(int level, String name) {
        this.level = level;
        this.name = name;
    }
}
