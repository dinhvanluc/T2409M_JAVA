package demo8;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook() {
            @Override
            public void insertPhone(String name, String phone) {

            }

            @Override
            public void removePhone(String name) {

            }
        };
        pb.insertPhone("Lực", "0123456789");
        pb.insertPhone("Công", "0987654321");
        pb.insertPhone("Lực", "0123456789"); // đã có rồi, không thêm
        pb.insertPhone("Lực", "0111111111"); // thêm mới

        pb.searchPhone("Lực");

        pb.updatePhone("Công", "0999999999");
        pb.searchPhone("Công");

        pb.removePhone("Lực");
        pb.searchPhone("Lực");

        pb.insertPhone("Nam", "0333333333");
        pb.insertPhone("Nam", "0444444444");
        pb.sort();
        pb.printAll();
    }
}
