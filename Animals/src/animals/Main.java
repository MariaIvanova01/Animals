package animals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        while (true){
            String typeAnimal = scan.nextLine();

            if (typeAnimal.equals("Beast!")){
                break;
            }

            String[] animalInfo = scan.nextLine().split(" ");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try{
                System.out.println(typeAnimal);
                switch (typeAnimal){
                    case "Cat":
                        Cat cat = new Cat(name,age,gender);
                        System.out.print(cat);
                        System.out.println(cat.produceSound());
                        break;
                    case "Dog":
                        Dog dog = new Dog(name,age,gender);
                        System.out.print(dog);
                        System.out.println(dog.produceSound());
                        break;
                    case "Frog":
                        Frog frog = new Frog(name,age,gender);
                        System.out.print(frog);
                        System.out.print(frog.produceSound());
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name,age);
                        System.out.print(tomcat);
                        System.out.println(tomcat.produceSound());
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name,age);
                        System.out.print(kitten);
                        System.out.println(kitten.produceSound());
                        break;
                }

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
