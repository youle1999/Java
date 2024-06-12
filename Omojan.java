import java.util.Random;

class Omojan {
    public static void main(String[] args) {
        // 言葉は適当に複数書いてください
        String[] words = {
            "ブルータス", "お前もか", "サイは", "投げられた", "社員は", "悪くありません", 
            "女王の", "教室", "ラスト", "クリスマス", "伝説の", "教師", "救命病棟", 
            "24時", "冗談", "じゃない", "プロポーズ", "大作戦", "時効", "警察", 
            "華麗なる", "一族", "ビッグ", "マネー", "忍者", "サイヤー専用", "サイク", 
            "のびたの", "恐怖", "星に", "憧れ", "ラヂオ"
        };

        Random rand = new Random();
        int index1 = rand.nextInt(words.length);
        int index2 = rand.nextInt(words.length);
        
        System.out.println(words[index2] + " " + words[index1]);
    }
}
