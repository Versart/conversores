public class Value {

    private String bid;


    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Value{" +
                "objectValue='" + bid + '\'' +
                '}';
    }
}
