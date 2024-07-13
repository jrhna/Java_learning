package tech.array;

public class stringBuilder {
    public static void main(String[] args) {
        // thêm sửa xoá
        String s = " java    learning   builder!!!";
        StringBuilder stringBuild = new StringBuilder(s);
        stringBuild.reverse();
        System.out.println(stringBuild.toString());//stringBuild.toString() là một phương thức chuyển đổi đối tượng stringBuil thành chuỗi
        System.out.println(stringBuild);// stringBuild là một đối tượng của lớp StringBuilder
    }
}
