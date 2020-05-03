package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 sehingga i = 1
        System.out.println(i);
        i++;                    //karena i tadinya sudah bernilai 1 maka sekarang ditambahkan lagi 1 maka i = 2
        System.out.println(i);
        i=i+1;                  //i=i+1 sama saja dengan i++ maka hasilnya i = 3
        System.out.println(i);

    }
}
