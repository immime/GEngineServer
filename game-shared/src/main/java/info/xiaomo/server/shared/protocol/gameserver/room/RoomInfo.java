// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

/**
 * <pre>
 *房间机器信息
 * </pre>
 *
 * Protobuf type {@code RoomInfo}
 */
public final class RoomInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RoomInfo)
    RoomInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomInfo.newBuilder() to construct.
  private RoomInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoomInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 16: {

            rank_ = input.readInt32();
            break;
          }
          case 24: {

            type_ = input.readInt32();
            break;
          }
          case 32: {

            cumulativeGold_ = input.readInt64();
            break;
          }
          case 40: {

            state_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.class, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   *房间编号
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int RANK_FIELD_NUMBER = 2;
  private int rank_;
  /**
   * <pre>
   *级别
   * </pre>
   *
   * <code>int32 rank = 2;</code>
   * @return The rank.
   */
  @java.lang.Override
  public int getRank() {
    return rank_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <pre>
   *房间类型
   * </pre>
   *
   * <code>int32 type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int CUMULATIVEGOLD_FIELD_NUMBER = 4;
  private long cumulativeGold_;
  /**
   * <pre>
   *累积奖
   * </pre>
   *
   * <code>int64 cumulativeGold = 4;</code>
   * @return The cumulativeGold.
   */
  @java.lang.Override
  public long getCumulativeGold() {
    return cumulativeGold_;
  }

  public static final int STATE_FIELD_NUMBER = 5;
  private long state_;
  /**
   * <pre>
   *房间状态（二进制位标识）4096冰冻，8192鱼潮，16384 BOSS
   * </pre>
   *
   * <code>int64 state = 5;</code>
   * @return The state.
   */
  @java.lang.Override
  public long getState() {
    return state_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (rank_ != 0) {
      output.writeInt32(2, rank_);
    }
    if (type_ != 0) {
      output.writeInt32(3, type_);
    }
    if (cumulativeGold_ != 0L) {
      output.writeInt64(4, cumulativeGold_);
    }
    if (state_ != 0L) {
      output.writeInt64(5, state_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (rank_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, rank_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, type_);
    }
    if (cumulativeGold_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, cumulativeGold_);
    }
    if (state_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, state_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo other = (info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo) obj;

    if (getId()
        != other.getId()) return false;
    if (getRank()
        != other.getRank()) return false;
    if (getType()
        != other.getType()) return false;
    if (getCumulativeGold()
        != other.getCumulativeGold()) return false;
    if (getState()
        != other.getState()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + RANK_FIELD_NUMBER;
    hash = (53 * hash) + getRank();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + CUMULATIVEGOLD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCumulativeGold());
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getState());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *房间机器信息
   * </pre>
   *
   * Protobuf type {@code RoomInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RoomInfo)
      info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.class, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.gameserver.handler.RoomInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      rank_ = 0;

      type_ = 0;

      cumulativeGold_ = 0L;

      state_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomInfo_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo build() {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo result = new info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo(this);
      result.id_ = id_;
      result.rank_ = rank_;
      result.type_ = type_;
      result.cumulativeGold_ = cumulativeGold_;
      result.state_ = state_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getRank() != 0) {
        setRank(other.getRank());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getCumulativeGold() != 0L) {
        setCumulativeGold(other.getCumulativeGold());
      }
      if (other.getState() != 0L) {
        setState(other.getState());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     *房间编号
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     *房间编号
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *房间编号
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int rank_ ;
    /**
     * <pre>
     *级别
     * </pre>
     *
     * <code>int32 rank = 2;</code>
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }
    /**
     * <pre>
     *级别
     * </pre>
     *
     * <code>int32 rank = 2;</code>
     * @param value The rank to set.
     * @return This builder for chaining.
     */
    public Builder setRank(int value) {
      
      rank_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *级别
     * </pre>
     *
     * <code>int32 rank = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRank() {
      
      rank_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     *房间类型
     * </pre>
     *
     * <code>int32 type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     *房间类型
     * </pre>
     *
     * <code>int32 type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *房间类型
     * </pre>
     *
     * <code>int32 type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long cumulativeGold_ ;
    /**
     * <pre>
     *累积奖
     * </pre>
     *
     * <code>int64 cumulativeGold = 4;</code>
     * @return The cumulativeGold.
     */
    @java.lang.Override
    public long getCumulativeGold() {
      return cumulativeGold_;
    }
    /**
     * <pre>
     *累积奖
     * </pre>
     *
     * <code>int64 cumulativeGold = 4;</code>
     * @param value The cumulativeGold to set.
     * @return This builder for chaining.
     */
    public Builder setCumulativeGold(long value) {
      
      cumulativeGold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *累积奖
     * </pre>
     *
     * <code>int64 cumulativeGold = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCumulativeGold() {
      
      cumulativeGold_ = 0L;
      onChanged();
      return this;
    }

    private long state_ ;
    /**
     * <pre>
     *房间状态（二进制位标识）4096冰冻，8192鱼潮，16384 BOSS
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @return The state.
     */
    @java.lang.Override
    public long getState() {
      return state_;
    }
    /**
     * <pre>
     *房间状态（二进制位标识）4096冰冻，8192鱼潮，16384 BOSS
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(long value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *房间状态（二进制位标识）4096冰冻，8192鱼潮，16384 BOSS
     * </pre>
     *
     * <code>int64 state = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RoomInfo)
  }

  // @@protoc_insertion_point(class_scope:RoomInfo)
  private static final info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomInfo>
      PARSER = new com.google.protobuf.AbstractParser<RoomInfo>() {
    @java.lang.Override
    public RoomInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
