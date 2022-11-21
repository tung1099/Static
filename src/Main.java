public class Main {

    public static int id = 100;
    private String name = "DT";
    private int mId;

    public Main() {
        mId = ++id;
    }

    public Main(String name, int mId) {
        this.name = name;
        this.mId = mId;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Main.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public static void main(String[] args) {

       Main s1 = new Main();
       Main s2 = new Main();

        System.out.println(s1.getName() + s1.getmId());
        System.out.println(s2.getName() + s2.getmId());
    }
}