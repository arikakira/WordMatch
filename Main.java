public class Main {
    public static void main(String[] args) {
        WordMatch game1 = new WordMatch("mississippi");     // test case 1
        System.out.println(game1.scoreGuess("i"));
        System.out.println(game1.scoreGuess("iss"));
        System.out.println(game1.scoreGuess("issipp"));
        System.out.println(game1.scoreGuess("mississippi"));

        WordMatch game2 = new WordMatch("aaaabb");      // test case 2
        System.out.println(game2.scoreGuess("a"));
        System.out.println(game2.scoreGuess("aa"));
        System.out.println(game2.scoreGuess("aaa"));
        System.out.println(game2.scoreGuess("aabb"));
        System.out.println(game2.scoreGuess("c"));

        
    }
}
