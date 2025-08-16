# Calm Bubbles

NeoForge 1.21.1 mod disabling the push/pull effects of vanilla bubble columns.

- **Minecraft**: 1.21.1  
- **Loader**: NeoForge 21.1.x  
- **License**: Apache-2.0

## What it does
Cancels `BubbleColumnBlock#entityInside`, so bubble columns keep their visuals but no longer push or pull any entity (players, mobs, items, boats).

## Install
Drop the JAR in your `mods/` folder (client or server). No config required.

## Changelog
See [Releases](../../releases).

---

## A note from the author
This is my **very first Minecraft mod**. I’ve got many ideas and ambitions ahead—this is where it starts.  
I’ll do my best to keep Calm Bubbles up to date, adapt it when needed, and keep shipping my other projects as they grow. Thanks for trying it out!

## Optional Feature Plans (roadmap)
- **Server config toggles**: `disablePush=true/false`, `disablePull=true/false`.
- **Runtime switch**: gamerule or command (e.g. `/calmbubbles toggle`).
- **Per-entity rules**: allow/deny lists (players only, exclude items/boats, etc.).
- **Side control**: option to make it server-only vs. require clients.
- **Data/JSON config**: simple file under `serverconfig/` for easy ops management.
- **Tiny API hook**: event/callback for other mods to override behavior when needed.

## Contributing
Issues and PRs welcome. Please keep the scope minimal and performance-friendly.

## License
Apache-2.0 © andaraBB — see `LICENSE`.
