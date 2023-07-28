db = connect( 'mongodb://localhost/javalicence' );

db.questions.deleteMany({})

db.questions.insertMany([
  {
    question: "If class has not overridden hash and equals can it be placed in hashset or hashmap?",
    subject: "basics",
    goodAnswer: "yes",
    badAnswers: ["no"],
    difficulty: "easy",
    explanation: "All classes inherit hash and equals from Object (or parent classes that implemented these methods) so calculation of hash wouldn't be a problem, but if hash and equals are not overridden then any method or class based on hash my return unexpected behaviour"
  },
  {
    question: "Which annotation is NOT in @SpringBootApplication definition",
    subject: "spring",
    goodAnswer: "@ControllerAdvice",
    badAnswers: ["@Configuration", "@EnableAutoConfiguration", "@ComponentScan"],
    difficulty: "easy",
    explanation: "@SpringBootApplication is annotated with @EnableAutoConfiguration and @ComponentScan and @SpringBootConfiguration which is annotated with @Component"
  },
  {
    question: "Is Map an interface in Java Collection API?",
    subject: "collections",
    goodAnswer: "yes",
    badAnswers: ["no"],
    difficulty: "easy",
    explanation: "Technically Map<K,V> is not part of Java Collection API, because it doesn't extend Collection<E> interface"
  },
  {
    question: "When element is added to an ArrayList is it stored as shallow or deep copy?",
    subject: "collections",
    goodAnswer: "shallow",
    badAnswers: ["deep"],
    difficulty: "easy",
    explanation: "All elements added to standard implementations of Collection API are stored as shallow copies"
  },
  {
    question: "Which type of accessor should constructor of Singleton use?",
    subject: "basics",
    goodAnswer: "private",
    badAnswers: ["public, protected, any"],
    difficulty: "easy",
    explanation: "To ensure that there is only one instance of singleton then it is necessary to block any user from creating new instances which is why constructor must be private"
  }
]);