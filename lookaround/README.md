# LOOKAROUND

A custom client-side Minecraft Fabric mod by Hyper378.

## Target
- Minecraft Java 26.3
- Fabric Loader 0.20.1
- Fabric API 0.166.0+26.3
- Java 25
- Fabric Loom 1.19-SNAPSHOT

## Current starter build
- Registers the LOOKAROUND controls category.
- Adds an F6 toggle keybind.
- Confirms the key press in the action bar.

## Planned freecam behaviour
- Detach the camera from the player.
- Keep the real player at their original position.
- Move the camera independently with WASD, Space and Shift.
- Fly through blocks within loaded/rendered chunks.
- Restore the normal player camera when F6 is pressed again.

**Important:** This is the initial project scaffold, not the finished freecam yet. The detached-camera controller and movement are the next implementation step. Do not install this starter build expecting freecam movement.

## Build
Use JDK 25 and Gradle 9.7.1 or newer.

From the project folder:
```powershell
gradle build
```

The built mod JAR will be in `build/libs/`.

## GitHub
Create a repository named `lookaround`, then upload the contents of this folder (not the outer ZIP folder).
