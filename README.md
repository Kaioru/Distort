Distort
=======
Distort is a command framework for Discord built with Retort.

## Installing
### Maven
```xml
<repositories>
  <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
    <groupId>co.kaioru</groupId>
    <artifactId>distort</artifactId>
    <version>-SNAPSHOT</version>
</dependency>
```

## Usage
### Discord4J
#### Before creating commands..
Remember to register a message listener to handle your commands..
```java
IDiscordClient client = new ClientBuilder()
    .withToken("...")
    .login();
IListener<MessageReceivedEvent> listener = event -> {
    String content = event.getMessage().getContent();

    if (content.startsWith(".") && event.getAuthor() != client.getOurUser()) {
        String input = content.substring(1, content.length());
        registry.process(event.getMessage(), input);
    }
};

client.getDispatcher().registerListener(listener);
```
##### Using the Command Builder
The easiest and most verbose way of creating commands.
Also, does not use reflections at all when executing commands, therefore the fastest.
```java
D4JCommandRegistry registry = new D4JCommandRegistry();

registry.registerCommand(new D4JCommandBuilder("ping")
    .build(context -> {
        context.getMessage().reply("pong!");
        return null;
    }));
```
##### Using Annotations
```java
public class Application {

  public static void main(String[] args) {
    D4JCommandRegistry registry = new D4JCommandRegistry();
    registry.registerCommands(new D4JAnnotationBuilder()
        .withObject(new Application())
        .build());
  }
  
  @Command("ping")
  public void pingCommand(D4JContext context) {
    context.getMessage().reply("pong!");
  }

}
```
##### Using Annotations + Reflections
```java
public class Application {

  public static void main(String[] args) {
    D4JCommandRegistry registry = new D4JCommandRegistry();
    registry.registerCommands(new D4JAnnotationBuilder()
        .withAdapter(new D4JReflectionBuilder()
            .build())
        .withObject(new Application())
        .build());
  }
  
  @Reflect
  @Command("echo")
  public void echoCommand(D4JContext context, String text) {
    context.getMessage().reply(text);
  }

}
```
##### Or, extending the base command class
This method also does not use reflections.
```java
public class PingCommand extends D4JCommand {

    public PingCommand() {
        super("ping");
    }

    @Override
    public void executeAfter(D4JContext context) {
        context.getMessage().reply("pong!");
    }

}
```
```java
D4JCommandRegistry registry = new D4JCommandRegistry();
registry.registerCommand(new PingCommand());
```
