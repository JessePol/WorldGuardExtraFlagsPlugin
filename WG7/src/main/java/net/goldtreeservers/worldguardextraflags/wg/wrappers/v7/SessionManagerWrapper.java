package net.goldtreeservers.worldguardextraflags.wg.wrappers.v7;

import org.bukkit.entity.Player;

import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import com.sk89q.worldguard.session.Session;
import com.sk89q.worldguard.session.SessionManager;
import com.sk89q.worldguard.session.handler.Handler;
import com.sk89q.worldguard.session.handler.Handler.Factory;

import net.goldtreeservers.worldguardextraflags.wg.wrappers.AbstractSessionManagerWrapper;

public class SessionManagerWrapper extends AbstractSessionManagerWrapper
{
	public SessionManagerWrapper(SessionManager sessionManager)
	{
		super(sessionManager);
	}

	@Override
	public Session get(Player player)
	{
		return this.sessionManager.get(WorldGuardPlugin.inst().wrapPlayer(player));
	}

	@Override
	public Session getIfPresent(Player player)
	{
		return this.sessionManager.getIfPresent(WorldGuardPlugin.inst().wrapPlayer(player));
	}

	@Override
	public void registerHandler(Factory<? extends Handler> factory)
	{
		this.sessionManager.registerHandler(factory, null);
	}
}
