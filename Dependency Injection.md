
### What is Dependency Injection?
Dependency Injection is a design pattern that enables a class to retrieve its dependencies
from an external sources rather than creating them itself. In the context of Spring Boot, DI is used to manage
the dependencies between different components in a Spring application.

Example of DI in Spring Boot:

```Java
public class Car {
  private Engine engine;

  public Car(Engine engine) {
    this.engine = engine;
  }
}

public class Engine {
  // engine implementation
}

@Configuration
public class AppConfig {
  @Bean
  public Engine engine() {
    return new Engine();
  }

  @Bean
  public Car car(Engine engine) {
    return new Car(engine);
  }
}

```

In the example above, the Car class depends on an Engine object. Instead of creating the 
Engine object itself, the Car class receives it as a constructor argument. This is an example of
constructor injection.

The AppConfig class is a Spring configuration class that defines @Bean methods for creating the
Engine and Car objects. The engine() method creates an Engine object, and the car() method creates a Car object
and injects the Engine object as a dependency using constructor injection.
