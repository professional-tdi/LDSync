# LDSync
Sync Vault ranks to discord roles



## Usage
LDSync is a super easy plugin to use, first get the jar from the releases tab or build it yourself locally.

Note: LDSync is tested for 1.17.x but may work on other verisons.

### Config.yml
```yaml
bot-token: "token-here"
discord-server-id: "discord-server-id-here"
remove-higher-roles-on-sync: true
logo: "&cLD&bSYNC &7"
```

LDSync is very customizable by even changing the name or "logo" in chat.
#### What does each value mean?
`bot-token` is the discord bots token which can be found [here](https://discord.com/developers/applications).

`discord-server-id` is the server id of your discord, a tutorial to get that can be found [here](https://support.discord.com/hc/en-us/articles/206346498-Where-can-I-find-my-User-Server-Message-ID-).

`remove-higher-roles-on-sync` This value is `true` by default, what it means is that if you sync someone with a role lower than the one they currently have in discord, it will remove that higher role in discord and then add the lower one. This can be false if you want.

`logo` Obviously, the logo that appears in chat. Change it to whatever you want! 

### Permissions
The base command is `/ldsync` which requires the premission node `ldsync.use`

### Commands
After changing the config, reload the plugin and the bot with `/ldsync reload`

Syncing players is done with `/ldsync sync <minecraft-player> <discord-username>` 

**Example:** `/ldsync sync Ntdi Ntdi#0002`

*Discord names are CaSe-SeNsItIvE*

### Support
If you still need help feel free to create an issue on this github page.

## Enjoy!
