public class a19 {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eat();
        b1.drink();
    }  
  }
  
  interface Herbivore {
      void eat();  // Herbivores can eat
  }
  
  interface Carnivorous {
      void drink();  // Carnivores may drink
  }
  
  class Bear implements Herbivore, Carnivorous {
      @Override
      public void eat() {
          System.out.println("Bear is eating");
      }
  
      @Override
      public void drink() {
          System.out.println("Bear is drinking");
      }
  }
  
