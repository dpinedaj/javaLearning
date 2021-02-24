package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");


        //variables
        int aNumber = 2;
        int anotherNumber = 40;
        int sum = aNumber + anotherNumber; // sum = 42
        System.out.println(sum);

        // primitive types

        int aInteger = 30; // integers = 4 bytes
        long aBigInteger = 52234123412342134L; // long = 8 bytes
        float aSmallDecimal = 2.3f; // float = 4 bytes
        double aBigDecimal = 3.14; // double precision = 8 bytes
        double nStarsInTheUniverse = 1.1e21; // 1.1 * 10^21
        double hydrogenRadius = 5.3e-11; // 5.3 * 10^-11
        char aCharacter = 'a'; //
        boolean aTruthValue = true;

        // string
        String aString = "Hello world!";

        // expressions
        // math operations
        int mutiplyInt = 2 * 3;
        int divideInt = 7 / 3;
        int remainderInt = 7 % 3;

        // incrementing and decrementing
        aNumber++; // aNumber will became 3 --> Returns 2
        ++aNumber; // aNumber will became 4 --> Returns 4

        aNumber--; //

        // math operators on decimals
        double aDoubleSum = 2.3 + 4.5;
        double divideDouble = 7.0 / 3; // 2.333333333

        //character operations
        char aLetter = 'a';
        aLetter++; // ASCII code, aLetter becomes 'b'

        // Special characters
        char aQuote = '\''; // escapae sequence
        char doubleQuote = '\"'; // double "
        char newLine = '\n'; // new line
        char aTab = '\t'; // tab
        char backslash = '\\';

        // boolean operations
        boolean numberIsTooBig = aNumber > 100;
        boolean isLetterMyFavorite = aLetter == 't';
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 0);
        boolean smallOrEven = (aNumber < 10) || (aNumber % 2 != 0);
        boolean negate = !smallOrEven;

        // string operations
        String concatenation = "I love " + "Java!";

        // instructions
        aNumber = aNumber + 6;
        aNumber += 2;
        // old variables don't update automatically
        System.out.println(sum); // 42

        // control statements
        int age = 28;
        if (age < 30) {
            System.out.println("You're just getting started!");
        } else {
            System.out.println("Perfect time to start learning Java!");
            age += 1;
            System.out.println("Your age has become: " + age);
        }

        // chain if-else structures
        int temperature = 22;
        if (temperature < 20) {
            System.out.println("Quite chill outside, maybe take a jacket.");
        } else if (temperature < 25) {
            System.out.println("Very pleasant outside, take a walk.");
        } else {
            System.out.println("It's getting hot, maybe take some water.");
        }

        // while loops
        System.out.println("Watch me count to 10!");
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // do-while loops -execute, then test condition
        counter = 1;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);

        // for loops
        for (
                counter = 1; // starting instruction
                counter <= 10; // continuation condition
                counter++
        ) {
            System.out.println(counter);
        }

        /*
            For struycture operation (pseudo-code)

            execute starting instruction;
            as long as (continuation condition) {
                run contents;
                instruction to execute after the contents
                
         */


        // reference types
        Person alice = new Person(25, "Alice");
        Person bob = new Person(24, "Bob");

        System.out.println(
                alice.username + " says to " + bob.username
                        + ": happy birthday for turning " + bob.age + "!"
        );

        // Alice's birthday
        alice.celebrateBirthday();

        // Bob's birthday
        bob.celebrateBirthday();

        String alicesParty = alice.throwParty(20, "my house");
        System.out.println(alicesParty);

        // all reference types (classes) can have methods
        String aTestString = "I love Java!";
        System.out.println(aTestString.length());
        System.out.println(aTestString.startsWith("I love"));
        System.out.println(aTestString.substring(7, 11));

        // arrays
        Person charlie = new Person(34, "Charlie");

        //a million other people
        Person[] peopleCelebratingToday = new Person[3];
        peopleCelebratingToday[0] = alice;
        peopleCelebratingToday[1] = bob;
        peopleCelebratingToday[2] = charlie;

        // repeat over an array
        int personIndex = 0;
        while (personIndex < 3) {
            Person currentPerson = peopleCelebratingToday[personIndex];
            currentPerson.celebrateBirthday();
            personIndex++;
        }
        // same thing a for loop
        for (personIndex = 0; personIndex < 3;personIndex++) {
            Person currentPerson = peopleCelebratingToday[personIndex];
            currentPerson.celebrateBirthday();
        }

        // foreach loop
        for (Person person : peopleCelebratingToday) {
            person.celebrateBirthday();
        }

        // static members and methods
        boolean canFly = Person.canFly;
        String programLanguage = Person.getFavoriteProgrammingLanguage();
    }


}

class Person {
    // Class attribute members
    String username;
    int age;

    //private attributes (access modifiers: private, public, protected, no modifier
    private String secret = "nobody needs to know this";

    // Constructor to initialize fields
    public Person(int a, String b) {
        age = a;
        username = b;
    }

    void celebrateBirthday() {
        this.age++;
        System.out.println(
                this.username
                        + " says: It's my birthday, I just turned "
                        + this.age
        );
    }

    String throwParty(int nPeople, String favoritePlace) {
        return this.username + " says: I'm gonig to throw a party at "
                + favoritePlace + " and I'm going to invite " + nPeople
                + " people!";
    }

    static boolean canFly = false;

    static String getFavoriteProgrammingLanguage() {
        return "Java";
    }
}
