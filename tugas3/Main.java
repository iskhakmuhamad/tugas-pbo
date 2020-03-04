package tugas3;

import tugas3.attack.ArrowAttact;
import tugas3.attack.SwordAttack;
import tugas3.defense.ArmorDefense;
import tugas3.defense.ShiledDefense;
import tugas3.fly.PlaneFly;
import tugas3.fly.RocketFly;
import tugas3.fly.WingsFly;
import tugas3.sound.NormalSound;
import tugas3.sound.ToaSound;


public class Main {
  public static void main(String[] args) {
    Duck superDuck = new Duck(new RocketFly(), new ToaSound(), new ArrowAttact(), new ShiledDefense());
    System.out.println("Super Duck Behaviour : ");
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();

    System.out.println();
    System.out.println("Noob Duck Behaviour : ");
    Duck noobDuck = new Duck(new WingsFly(), new NormalSound(), new SwordAttack(), new ArmorDefense());
    noobDuck.fly();
    noobDuck.sound();
    noobDuck.attack();
    noobDuck.defense();

    System.out.println();
    System.out.println("Super Duck change Fly Behaviour : ");
    superDuck.setBehaviourFly(new PlaneFly());
    superDuck.fly();
    superDuck.sound();
    superDuck.attack();
    superDuck.defense();
  }
}