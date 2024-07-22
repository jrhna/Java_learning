package tech.oop.constructor;


    public  class Clone {
        //Khi đã dùng setter và getter thì thuộc tính nên để private
        // khi ta gán giá trị trong kiểu dữ liệu tham chiếu,
        // bản chất ta gán giá trị vùng bộ nhớ lưu trữ.
        // Có nghĩa lúc này array và mang đang ánh xạ chung một đối tượng trong bộ nhớ.
        //Cách xử lý là tạo một bộ nhớ khác và copy giá trị đó vào.
        // Ta sẽ dùng phương thức clone(), đây là phương thức hỗ trợ của Java,
        // nó sẽ tạo một bản sao rồi trả bản sao đó cho đối tượng được gán.
        private int [] arr;
        public void setArray(int [] arr){
            this.arr=arr;
        }
        public void setArrayClone(int [] arr) {
            this.arr=arr.clone();

        }
        public int[] getArray() {
            return this.arr.clone();
        }

        public void displayArray (){
            for (int a: this.arr){
                System.out.println(a + " ");
            }
            System.out.println();
        }
    }

