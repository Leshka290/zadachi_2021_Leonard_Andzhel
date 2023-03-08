package Chapter03.list70;

import java.io.Serializable;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

/*
Имплементация шахматных часов. Написать программу, которая
имплементирует шахматные часы.
 */
public class Task77 {

     static class ChessClock extends Clock implements Serializable {

         public enum Player {
            LEFT,
            RIGHT
        }

         private static final long serialVersionUID = 1L;
         private Instant instantStart;
         private Instant instantLeft;
         private Instant instantRight;
         private long timeLeft;
         private long timeRight;
         private Player player;

         public ChessClock(Player player) {
             this.player = player;
         }

         public Instant gameStart() {
             if (this.instantStart == null) {
                 this.timeLeft = 0;
                 this.timeRight = 0;
                 this.instantStart = Instant.now();
                 this.instantLeft = instantStart;
                 this.instantRight = instantStart;
                 return instantStart;
             }
             throw new IllegalStateException("Игра уже началась. Остановите ее и попробуйте еще раз.");
         }

         public Instant gameEnd() {
             if (this.instantStart != null) {
                 instantStart = null;
                 return Instant.now();
             }
             throw new IllegalStateException("Игра еще не началась.");
         }

         @Override
         public ZoneId getZone() {
             return ZoneOffset.UTC;
         }
         @Override
         public Clock withZone(ZoneId zone) {

         throw new UnsupportedOperationException("Класс ChessClock работает только в часовом поясе UTC");
     }

    @Override
    public Instant instant() {
        if (this.instantStart != null) {
            if (player == Player.LEFT) {
                player = Player.RIGHT;
                long secondsLeft = Instant.now().getEpochSecond() - instantRight.getEpochSecond();
                instantLeft = instantLeft.plusSeconds(secondsLeft - timeLeft);
                timeLeft = secondsLeft;
                return instantLeft;
            } else {
                player = Player.LEFT;
                long secondsRight = Instant.now().getEpochSecond() - instantLeft.getEpochSecond();
                instantRight = instantRight.plusSeconds(secondsRight - timeRight);
                timeRight = secondsRight;
                return instantRight;
            }
        }
            throw new IllegalStateException("Игра еще не началась.");
        }
    }

    ChessClock chessClock = new ChessClock(ChessClock.Player.LEFT);
    Instant start = chessClock.gameStart();
}
