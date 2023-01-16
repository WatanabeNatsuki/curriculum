/**
 * バブルソート
 * チェックテスト-Java３章
 *
 */
public class Main{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */int[] data = {3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        // int型の配列dataの要素数分、{}内の出力の処理を実行する。出力時はiを同列(print)に並べる。
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        
        //隣の要素との並べ替えを一通り行う回数（１度の並べ替えでは完璧ではない為）
        for (int i = 0; i < data.length-1; i++) {
            // 隣の要素との並べ替えを行う回数
            for (int j = data.length; j > i; j--) {
                
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                
                // 隣り合う要素がその要素よりも小さければポジションを入れ替える(の逆をした。理由はint i=0でdata[i-1]をするとint[0]の時マイナスの値になってしまうから)
                // https://www3.cuc.ac.jp/~miyata/classes/prg1/11/bubsort.html（参考資料）
                
                if(data[i] > data[i+1]){
                //  boxにdata[i]を入れておいて
                  int box = data[i];
                //  data[i]にはdata[i+1]を入れて
                  data[i] = data[i+1];
                //  data[i+1]にはdata[i]を入れる。つまり値を入れ替える。
                  data[i+1] = box;
                }
            }
        }
       
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}