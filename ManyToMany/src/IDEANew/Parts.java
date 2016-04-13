package IDEANew;


import javax.persistence.*;

//import javax.persistence.Table;

/**
 * Created by Olga Pavlova on 4/12/2016.
 */
@Entity
@IdClass(PartsPK.class)
@Table(name = "PARTS", schema = "SYSTEM_LOBS", catalog = "PUBLIC")
public class Parts {
    private int blockCount;
    private int blockOffset;
    private long partOffset;
    private long partLength;
    private long partBytes;
    private long lobId;

    @Basic
    @Column(name = "BLOCK_COUNT", nullable = false)
    public int getBlockCount() {
        return blockCount;
    }

    public void setBlockCount(int blockCount) {
        this.blockCount = blockCount;
    }

    @Id
    @Column(name = "BLOCK_OFFSET", nullable = false)
    public int getBlockOffset() {
        return blockOffset;
    }

    public void setBlockOffset(int blockOffset) {
        this.blockOffset = blockOffset;
    }

    @Basic
    @Column(name = "PART_OFFSET", nullable = false)
    public long getPartOffset() {
        return partOffset;
    }

    public void setPartOffset(long partOffset) {
        this.partOffset = partOffset;
    }

    @Basic
    @Column(name = "PART_LENGTH", nullable = false)
    public long getPartLength() {
        return partLength;
    }

    public void setPartLength(long partLength) {
        this.partLength = partLength;
    }

    @Basic
    @Column(name = "PART_BYTES", nullable = false)
    public long getPartBytes() {
        return partBytes;
    }

    public void setPartBytes(long partBytes) {
        this.partBytes = partBytes;
    }

    @Id
    @Column(name = "LOB_ID", nullable = false)
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

        Parts parts = (Parts) o;

        if (blockCount != parts.blockCount) return false;
        if (blockOffset != parts.blockOffset) return false;
        if (partOffset != parts.partOffset) return false;
        if (partLength != parts.partLength) return false;
        if (partBytes != parts.partBytes) return false;
        if (lobId != parts.lobId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = blockCount;
        result = 31 * result + blockOffset;
        result = 31 * result + (int) (partOffset ^ (partOffset >>> 32));
        result = 31 * result + (int) (partLength ^ (partLength >>> 32));
        result = 31 * result + (int) (partBytes ^ (partBytes >>> 32));
        result = 31 * result + (int) (lobId ^ (lobId >>> 32));
        return result;
    }
}
