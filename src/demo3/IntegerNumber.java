package demo3;

public class IntegerNumber extends MyNumber {
    int value;

    @Override
    public MyNumber add(MyNumber other) {
        IntegerNumber total =  new IntegerNumber(); // tạo ra 1 object để tính tổng
        IntegerNumber o = (IntegerNumber) other; // ép kiểu tham số về dạng số nghuyên
        total.value = this.value + o.value; // tính toorng
        return total; // trả về kết quả
    }

    @Override
    public MyNumber subtract(MyNumber other) {
        IntegerNumber total =  new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value - o.value;
        return total;
    }

    @Override
    public MyNumber multiply(MyNumber other) {
        IntegerNumber total =  new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value * o.value;
        return total;
    }

    @Override
    public MyNumber divide(MyNumber other) {
        IntegerNumber total =  new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value / o.value;
        return total;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
