[![](https://jitpack.io/v/ReflxctionDev/SimpleHypixelAPI.svg)](https://jitpack.io/#ReflxctionDev/SimpleHypixelAPI)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
# SimpleHypixelAPI
**SimpleHypixelAPI** is an asynchronous, fast Hypixel API wrapper, designed to allow easier and faster access to the Hypixel API.

The library is designed in to be fully abstract, hence updating the library ensures consistency and cross-compatibility. (Unless, of course, Hypixel changes anything in their API)
    
# Usage
**NOTE**: Due to the asynchronous nature of the library, when the application shuts down, a call must be made to the static **HypixelAPI#shutdown()** to close the client that sends the requests. Leaving it opened could take extra resources.

* Creating a constant object of the HypixelAPI accessor:
```java
public static final HypixelAPI API = HypixelAPI.create("API key here");
```

* Magically, access any exposed data from the API

**Player data:**
General data, such as the network level, karma, social media, and so on, can be accessed through **HypixelPlayer**
```java
HypixelPlayer player = API.getPlayer(UUID.fromString("player UUID here (recommended)"));
// OR
HypixelPlayer player = API.getPlayer("player name");
System.out.println("Karma: " + player.getKarma());
System.out.println("Discord: " + player.getSocialMedia().getLinks().get(SocialMediaType.DISCORD));
```

**Player statistics:**
All game statistics can be accessed from **HypixelPlayer#getStatistics()**, and a game-specific statistic can be accessed using its own method, for example **statistics#getBedwarsStatistics()**, **statistics#getMegaWallsStatistics()**, etc.
```java
HypixelPlayer player = API.getPlayer(UUID.fromString("player UUID here (recommended)"));
// OR
HypixelPlayer player = API.getPlayer("player name");
SkywarsStatistics skywars = player.getStatistics().getSkywarsStatistics();
System.out.println("Kills: " + skywars.getKills());
System.out.println("Deaths: " + skywars.getDeaths());
```
And in case the desired field is not accessible through the API, it can be accessed from
**GameStatistics#get(GameType gameType, String key, Type type)**. For example:
```java
int kills = statistics.get(GameType.SKYWARS, "kills", int.class);
```

More examples on other elements the API exposes can be found in the [examples branch](https://github.com/ReflxctionDev/SimpleHypixelAPI/tree/examples).
