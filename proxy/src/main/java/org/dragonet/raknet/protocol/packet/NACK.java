package org.dragonet.raknet.protocol.packet;

import org.dragonet.raknet.protocol.AcknowledgePacket;
import org.dragonet.raknet.protocol.Packet;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class NACK extends AcknowledgePacket {

    public static final byte ID = (byte) 0xa0;

    @Override
    public byte getID() {
        return ID;
    }

    public static final class Factory implements PacketFactory {

        @Override
        public Packet create() {
            return new NACK();
        }

    }
}