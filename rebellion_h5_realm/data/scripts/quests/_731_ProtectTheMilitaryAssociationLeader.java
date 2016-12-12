package quests;

import l2r.gameserver.data.xml.holder.EventHolder;
import l2r.gameserver.model.entity.events.EventType;
import l2r.gameserver.model.entity.events.impl.DominionSiegeRunnerEvent;
import l2r.gameserver.model.quest.Quest;
import l2r.gameserver.scripts.ScriptFile;

/**
 * @author VISTALL
 * @date 8:17/10.06.2011
 */
public class _731_ProtectTheMilitaryAssociationLeader extends Quest implements ScriptFile
{
	public _731_ProtectTheMilitaryAssociationLeader()
	{
		super(PARTY_NONE);
		DominionSiegeRunnerEvent runnerEvent = EventHolder.getInstance().getEvent(EventType.MAIN_EVENT, 1);
		runnerEvent.addBreakQuest(this);
	}

	@Override
	public void onLoad()
	{

	}

	@Override
	public void onReload()
	{

	}

	@Override
	public void onShutdown()
	{

	}
	
	@Override
	public boolean isUnderLimit()
	{
		return true;
	}
}