package Chapter02.list50;

/*
Многочисленные метки вариантов. Написать фрагмент кода для примера
выражения switch JDK 12 с многочисленными метками вариантов case.
 */
public class Task56 {

    static class Player {}
    enum PlayerTypes{TENNIS, FOOTBALL, GOLF, VOLLEYBALL}
    static class Team extends Player { }
    static class Individual extends Player { }

    private static Player createPlayer1(PlayerTypes playerType) {
        switch (playerType) {
            case TENNIS, GOLF:
                return new Individual();
            case FOOTBALL, VOLLEYBALL:
                return new Team();
            default:
                throw new IllegalArgumentException ("Недопустимый тип игрока: " + playerType);
        }
    }
    private static Player createPlayer2(PlayerTypes playerTypes) {
            return switch (playerTypes) {
                case TENNIS, GOLF -> new Individual();
                case FOOTBALL, VOLLEYBALL -> new Team();
            };
        }
}
