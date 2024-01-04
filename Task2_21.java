package study;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
* 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
* 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
*
* 問①〜問③まであります。
* 問②に関しては、コメントを記述して下さい。
*
*/
public class Task2_21 {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① 定数をすべて使って、String型のListを記述して下さい。
        List<String> shohinList = new LinkedList<>();
        shohinList.add(SHOP_SHOHIN_00);
        shohinList.add(SHOP_SHOHIN_01);
        shohinList.add(SHOP_SHOHIN_02);
        shohinList.add(SHOP_SHOHIN_03);



        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述して下さい。
        /*
        * [キーを牛乳で指定，値を180として取得]
        *
        */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述して下さい。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        for (String shohin : shohinList) {
            System.out.println(shohin + "は" + shopMap.get(shohin) + "円です！");
        }
    }
}