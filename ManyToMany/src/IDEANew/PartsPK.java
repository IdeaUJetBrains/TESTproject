package IDEANew;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class PartsPK implements Serializable {
    private int blockOffset;
    private long lobId;

    @Column(name = "BLOCK_OFFSET", nullable = false)
    @Id
    public int getBlockOffset() {
        return blockOffset;
    }

    public void setBlockOffset(int blockOffset) {
        this.blockOffset = blockOffset;
    }

    @Column(name = "LOB_ID", nullable = false)
    @Id
    public long getLobId() {
        return lobId;
    }

    public void setLobId(long lobId) {
        this.lobId = lobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartsPK partsPK = (PartsPK) o;

        if (blockOffset != partsPK.blockOffset) return false;
        if (lobId != partsPK.lobId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blockOffset;
        result = 31 * result + (int) (lobId ^ (lobId >>> 32));
        return result;
    }
}
