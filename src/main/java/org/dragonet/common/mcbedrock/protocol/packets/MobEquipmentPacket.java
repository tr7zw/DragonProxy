package org.dragonet.common.mcbedrock.protocol.packets;

import org.dragonet.common.mcbedrock.protocol.PEPacket;
import org.dragonet.common.mcbedrock.protocol.ProtocolInfo;
import org.dragonet.common.mcbedrock.protocol.type.Slot;

/**
 * Created on 2017/10/22.
 */
public class MobEquipmentPacket extends PEPacket {

    public long rtid;
    public Slot item;
    public int inventorySlot;
    public int hotbarSlot;
    public int windowId;

    @Override
    public int pid() {
        return ProtocolInfo.MOB_EQUIPMENT_PACKET;
    }

    @Override
    public void encodePayload() {
        putUnsignedVarLong(rtid);
        putSlot(item);
        putByte((byte) (inventorySlot & 0xFF));
        putByte((byte) (hotbarSlot & 0xFF));
        putByte((byte) (windowId & 0xFF));
    }

    @Override
    public void decodePayload() {
        rtid = getUnsignedVarLong();
        item = getSlot();
        inventorySlot = getByte();
        hotbarSlot = getByte();
        windowId = getByte();
    }
}
