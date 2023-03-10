public class testFile {
    public int id;
    public String name;

    public testFile(int id, String name) {
        this.id = id;
        this.name = name;

    public int roll;
    public String result;

    public testFile(int roll, String result) {
        this.roll = roll;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
