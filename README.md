# Mono-Lib for 1.20.1

### planned fixes

> [Forge build.gradle](forge/build.gradle)

- Danger Close does not support old constructor method for Forge
- Stackable Stew and Soup needed String getGameDirectory from platform service, should use Path instead
- Overclocked Watches needed String getGameDirectory from platform service, should use Path instead
- New Shield Variants needed String getGameDirectory from platform service, should use Path instead
- More Bows and Arrows needed String getGameDirectory from platform service, should use Path instead
- Dis-Enchanting Table needed String getGameDirectory from platform service, should use Path instead
- Peaceful Hunger was built against Forge 47.3.32+, instead of a lower requirement for higher compatibility
- Ender pack needs curios 5.11.1+1.20.1 or higher
- Mob Drops Recipes: Overworld, rotten_flesh recipe error