public class Pyramid {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++){
            for (int n = 5 - line; n > 0; n--){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}

//      x     
//     xxx
//    xxxxx
//   xxxxxxx
//  xxxxxxxxx
// xxxxxxxxxxx