package net.minecraft.network;

import net.minecraft.util.IThreadListener;

public class PacketThreadUtil
{
    public static <T extends INetHandler> void checkThreadAndEnqueue(final Packet<T> Packett, final T Thingy, IThreadListener ITL) throws ThreadQuickExitException
    {
        if (!ITL.isCallingFromMinecraftThread())
        {
            ITL.addScheduledTask(new Runnable()
            {
                public void run()
                {
                    Packett.processPacket(Thingy);
                }
            });
            throw ThreadQuickExitException.INSTANCE;
        }
    }
}
