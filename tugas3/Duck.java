package tugas3;


import tugas3.attack.BehaviourAttack;
import tugas3.defense.BehaviourDefense;
import tugas3.fly.BehaviourFly;
import tugas3.sound.BehaviourSound;

public class Duck {

  private BehaviourFly behaviourFly;
  private BehaviourSound behaviourSound;
  private BehaviourAttack behaviourAttack;
  private BehaviourDefense behaviourDefense;

  public Duck(BehaviourFly behaviourFly, BehaviourSound behaviourSound, BehaviourAttack behaviourAttack,
      BehaviourDefense behaviourDefense) {
    this.behaviourFly = behaviourFly;
    this.behaviourSound = behaviourSound;
    this.behaviourAttack = behaviourAttack;
    this.behaviourDefense = behaviourDefense;
  }

  public void setBehaviourFly(BehaviourFly behaviourFly) {
    this.behaviourFly = behaviourFly;
  }

  public void setBehaviourSound(BehaviourSound behaviourSound) {
    this.behaviourSound = behaviourSound;
  }

  public void setBehaviourAttack(BehaviourAttack behaviourAttack) {
    this.behaviourAttack = behaviourAttack;
  }

  public void setBehaviourDefense(BehaviourDefense behaviourDefense) {
    this.behaviourDefense = behaviourDefense;
  }

  public void fly() {
    behaviourFly.fly();
  }

  public void sound() {
    behaviourSound.sound();
  }

  public void attack() {
    behaviourAttack.attack();
  }

  public void defense() {
    behaviourDefense.defense();
  }
}