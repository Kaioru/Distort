Distort
=======
Distort is an implementation built on top of Retort, a base command framework to make command frameworks (quite a mouthful, I know.).

It is built with the purpose of easily creating commands (with the use of builders, annotations etc).

At the current point, JavaCord and JDA (discord.jar is on its way) is not fully supported. However, base work for the libraries are finished but require further touching up.

# Usage - Discord.jar
## Adding the Listener
```java
CommandRegistry registry = new CommandRegistry();
DistortDjarListener listener = new DistortDjarListener(registry);

// You can register commands to the registry similar to the Discord4J way..
// But with DJarCommand instead of D4JCommand

DiscordAPI api = new DiscordAPI("email", "pass").login();
api.getEventManager().registerListener(listener);
```

# Usage - Discord4J
## As a required external module
Just download the required version of Distort (with dependencies!) and place it in the modules folder.
## As a internal module
First, add Distort as a dependency to your project with the JitPack link provided at the top.

Second, enable the module as such
```java
IDiscordClient#getModuleLoader().loadModule(new DistortD4JModule());
```
And you're set!
## Creating commands
Store the module in a variable! (and load it ofcourse!)
```java
module = new DistortD4JModule();
IDiscordClient#getModuleLoader().loadModule(module);
```
### Changing command prefix
The default prefix for Distort is '.'
You can change it by using
```java
module.getListener.setPrefix("String here!");
```
### With the Command Builder
```java
CommandRegistry reg = module.getRegistry();
reg.registerCommand(new D4JCommandBuilder("ping")
    .build((args, msg) -> {
        msg.reply("pong!");
    }));
```

### With Command Reference
```java
class Commands {
    @ReferencedCommand
    public D4JCommand getCommand() {
        return new D4JCommand() {

            @Override
            public String getName() {
                return "referenced";
            }

            @Override
            public String getDesc() {
                return "Oh look a referenced command";
            }

            @Override
            public void execute(LinkedList<String> args, IMessage msg) throws Exception {
                msg.reply("hello!");
            }

        };
    }
}
```
```java
CommandRegistry reg = module.getRegistry();
new D4JCommandAnnotator().registerReferences(reg, new Commands());
```
### Did we mention theres nested Commands?
```java
CommandRegistry reg = module.getRegistry();
reg.registerCommand(new D4JCommandBuilder("test")
    .command(new D4JCommandBuilder("nested")
            .build((args, msg) -> {
                msg.reply("Hello from the inside!");
            }))
    .build((args, msg) -> {
        msg.reply(args.toString());
    }));
```
