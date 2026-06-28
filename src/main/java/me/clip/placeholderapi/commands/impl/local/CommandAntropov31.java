/*
 * This file is part of PlaceholderAPI
 *
 * PlaceholderAPI
 * Copyright (c) 2015 - 2026 PlaceholderAPI Team
 *
 * PlaceholderAPI free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlaceholderAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see.
 */

package me.clip.placeholderapi.commands.impl.local;

import java.util.List;

import me.clip.placeholderapi.PlaceholderAPIPlugin;
import me.clip.placeholderapi.commands.PlaceholderCommand;
import me.clip.placeholderapi.util.Msg;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/**
 * Hidden easter egg command for the PlaceholderAPINot fork.
 *
 * <p>This fork is maintained by Antropov31. Run {@code /papi antropov31} to see a little hello.</p>
 */
public final class CommandAntropov31 extends PlaceholderCommand {

  public CommandAntropov31() {
    super("antropov31");
  }

  @Override
  public void evaluate(@NotNull final PlaceholderAPIPlugin plugin,
      @NotNull final CommandSender sender, @NotNull final String alias,
      @NotNull @Unmodifiable final List<String> params) {
    Msg.msg(sender,
        "&d&l✨ PlaceholderAPINot ✨",
        "&7This is a community fork built for &bPurpur 26.2&7.",
        "&7Forked, maintained & broken-then-fixed by &f&lAntropov31&7.",
        "&8──────────────────────",
        "&7You found the easter egg. &dGG. 🥚");
  }

}
