package Chapter02.list50;


/*
Выражения switch. Предоставить краткий обзор инструкции и выражений
switch В JDK 12.
 */
public class Task55 {

     static class Player {}
    enum PlayerTypes{TENNIS, FOOTBALL}
    static class TennisPlayer extends Player { }
     static class FootballPlayer extends Player { }

    private static Player createPlayer1(PlayerTypes playerType) {
        switch (playerType) {
            case TENNIS:
                return new TennisPlayer();
            case FOOTBALL:
                return new FootballPlayer();
            default:
                throw new IllegalArgumentException ("Недопустимый тип игрока: " + playerType);
        }
    }

    Player createPlayer2(PlayerTypes playerTypes) {
        return switch (playerTypes) {
            case TENNIS -> new TennisPlayer();
            case FOOTBALL -> new  FootballPlayer();
            // default -> throw new IllegalArgumentException("Недопустимый тип игрока:" + "+ playerType");
        };
    }
}