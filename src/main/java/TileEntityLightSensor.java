package net.minecraft.src;

public class TileEntityLightSensor extends TileEntity {
	@Override
    public void updateEntity() {
        if (this.worldObj != null && !this.worldObj.isRemote) {
            this.blockType = this.getBlockType();
            if (this.blockType != null && this.blockType instanceof BlockLightSensor) {
                ((BlockLightSensor)this.blockType).updateSensorOutput(this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
    }
}
