// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallPacketMessage.proto

package info.xiaomo.server.shared.protocol.hall.packet;

/**
 * <pre>
 *背包物品
 * </pre>
 *
 * Protobuf type {@code PacketItem}
 */
public final class PacketItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PacketItem)
    PacketItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PacketItem.newBuilder() to construct.
  private PacketItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PacketItem() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PacketItem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PacketItem(
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

            configId_ = input.readInt32();
            break;
          }
          case 24: {

            num_ = input.readInt32();
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
    return info.xiaomo.server.shared.protocol.hall.packet.HallPacketMessage.internal_static_PacketItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.packet.HallPacketMessage.internal_static_PacketItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.packet.PacketItem.class, info.xiaomo.server.shared.protocol.hall.packet.PacketItem.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   *唯一Id
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CONFIGID_FIELD_NUMBER = 2;
  private int configId_;
  /**
   * <pre>
   *配置Id
   * </pre>
   *
   * <code>int32 configId = 2;</code>
   * @return The configId.
   */
  @java.lang.Override
  public int getConfigId() {
    return configId_;
  }

  public static final int NUM_FIELD_NUMBER = 3;
  private int num_;
  /**
   * <pre>
   *数量
   * </pre>
   *
   * <code>int32 num = 3;</code>
   * @return The num.
   */
  @java.lang.Override
  public int getNum() {
    return num_;
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
    if (configId_ != 0) {
      output.writeInt32(2, configId_);
    }
    if (num_ != 0) {
      output.writeInt32(3, num_);
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
    if (configId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, configId_);
    }
    if (num_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, num_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.packet.PacketItem)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.packet.PacketItem other = (info.xiaomo.server.shared.protocol.hall.packet.PacketItem) obj;

    if (getId()
        != other.getId()) return false;
    if (getConfigId()
        != other.getConfigId()) return false;
    if (getNum()
        != other.getNum()) return false;
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
    hash = (37 * hash) + CONFIGID_FIELD_NUMBER;
    hash = (53 * hash) + getConfigId();
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + getNum();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.packet.PacketItem prototype) {
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
   *背包物品
   * </pre>
   *
   * Protobuf type {@code PacketItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PacketItem)
      info.xiaomo.server.shared.protocol.hall.packet.PacketItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.packet.HallPacketMessage.internal_static_PacketItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.packet.HallPacketMessage.internal_static_PacketItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.packet.PacketItem.class, info.xiaomo.server.shared.protocol.hall.packet.PacketItem.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.hall.packet.PacketItem.newBuilder()
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

      configId_ = 0;

      num_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.packet.HallPacketMessage.internal_static_PacketItem_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.packet.PacketItem getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.packet.PacketItem.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.packet.PacketItem build() {
      info.xiaomo.server.shared.protocol.hall.packet.PacketItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.packet.PacketItem buildPartial() {
      info.xiaomo.server.shared.protocol.hall.packet.PacketItem result = new info.xiaomo.server.shared.protocol.hall.packet.PacketItem(this);
      result.id_ = id_;
      result.configId_ = configId_;
      result.num_ = num_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.packet.PacketItem) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.packet.PacketItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.packet.PacketItem other) {
      if (other == info.xiaomo.server.shared.protocol.hall.packet.PacketItem.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getConfigId() != 0) {
        setConfigId(other.getConfigId());
      }
      if (other.getNum() != 0) {
        setNum(other.getNum());
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
      info.xiaomo.server.shared.protocol.hall.packet.PacketItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.packet.PacketItem) e.getUnfinishedMessage();
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
     *唯一Id
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
     *唯一Id
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
     *唯一Id
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

    private int configId_ ;
    /**
     * <pre>
     *配置Id
     * </pre>
     *
     * <code>int32 configId = 2;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }
    /**
     * <pre>
     *配置Id
     * </pre>
     *
     * <code>int32 configId = 2;</code>
     * @param value The configId to set.
     * @return This builder for chaining.
     */
    public Builder setConfigId(int value) {
      
      configId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *配置Id
     * </pre>
     *
     * <code>int32 configId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfigId() {
      
      configId_ = 0;
      onChanged();
      return this;
    }

    private int num_ ;
    /**
     * <pre>
     *数量
     * </pre>
     *
     * <code>int32 num = 3;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
    }
    /**
     * <pre>
     *数量
     * </pre>
     *
     * <code>int32 num = 3;</code>
     * @param value The num to set.
     * @return This builder for chaining.
     */
    public Builder setNum(int value) {
      
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *数量
     * </pre>
     *
     * <code>int32 num = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNum() {
      
      num_ = 0;
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


    // @@protoc_insertion_point(builder_scope:PacketItem)
  }

  // @@protoc_insertion_point(class_scope:PacketItem)
  private static final info.xiaomo.server.shared.protocol.hall.packet.PacketItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.packet.PacketItem();
  }

  public static info.xiaomo.server.shared.protocol.hall.packet.PacketItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PacketItem>
      PARSER = new com.google.protobuf.AbstractParser<PacketItem>() {
    @java.lang.Override
    public PacketItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PacketItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PacketItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PacketItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.packet.PacketItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

