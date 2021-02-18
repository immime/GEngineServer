// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package info.xiaomo.server.shared.protocol.server;

/**
 * <pre>
 *服务器事件
 * </pre>
 *
 * Protobuf type {@code ServerEventRequest}
 */
public final class ServerEventRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServerEventRequest)
    ServerEventRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ServerEventRequest.newBuilder() to construct.
  private ServerEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerEventRequest() {
    msgId_ = 0;
    ids_ = emptyLongList();
    info_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ServerEventRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ServerEventRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 16: {

            type_ = input.readInt32();
            break;
          }
          case 24: {

            serverId_ = input.readInt32();
            break;
          }
          case 32: {

            id_ = input.readInt64();
            break;
          }
          case 40: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              ids_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            ids_.addLong(input.readInt64());
            break;
          }
          case 42: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              ids_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ids_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            info_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        ids_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.server.ServerEventRequest.class, info.xiaomo.server.shared.protocol.server.ServerEventRequest.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   *事件类型  1踢玩家
   * </pre>
   *
   * <code>int32 type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int SERVERID_FIELD_NUMBER = 3;
  private int serverId_;
  /**
   * <pre>
   *int参数
   * </pre>
   *
   * <code>int32 serverId = 3;</code>
   * @return The serverId.
   */
  @java.lang.Override
  public int getServerId() {
    return serverId_;
  }

  public static final int ID_FIELD_NUMBER = 4;
  private long id_;
  /**
   * <pre>
   *long参数
   * </pre>
   *
   * <code>int64 id = 4;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int IDS_FIELD_NUMBER = 5;
  private com.google.protobuf.Internal.LongList ids_;
  /**
   * <pre>
   *Id列表
   * </pre>
   *
   * <code>repeated int64 ids = 5;</code>
   * @return A list containing the ids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getIdsList() {
    return ids_;
  }
  /**
   * <pre>
   *Id列表
   * </pre>
   *
   * <code>repeated int64 ids = 5;</code>
   * @return The count of ids.
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <pre>
   *Id列表
   * </pre>
   *
   * <code>repeated int64 ids = 5;</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  public long getIds(int index) {
    return ids_.getLong(index);
  }
  private int idsMemoizedSerializedSize = -1;

  public static final int INFO_FIELD_NUMBER = 6;
  private volatile java.lang.Object info_;
  /**
   * <pre>
   *其他额外信息
   * </pre>
   *
   * <code>string info = 6;</code>
   * @return The info.
   */
  @java.lang.Override
  public java.lang.String getInfo() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      info_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *其他额外信息
   * </pre>
   *
   * <code>string info = 6;</code>
   * @return The bytes for info.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInfoBytes() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      info_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    getSerializedSize();
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      output.writeEnum(1, msgId_);
    }
    if (type_ != 0) {
      output.writeInt32(2, type_);
    }
    if (serverId_ != 0) {
      output.writeInt32(3, serverId_);
    }
    if (id_ != 0L) {
      output.writeInt64(4, id_);
    }
    if (getIdsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(idsMemoizedSerializedSize);
    }
    for (int i = 0; i < ids_.size(); i++) {
      output.writeInt64NoTag(ids_.getLong(i));
    }
    if (!getInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, info_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, msgId_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, type_);
    }
    if (serverId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, serverId_);
    }
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, id_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(ids_.getLong(i));
      }
      size += dataSize;
      if (!getIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idsMemoizedSerializedSize = dataSize;
    }
    if (!getInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, info_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.server.ServerEventRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.server.ServerEventRequest other = (info.xiaomo.server.shared.protocol.server.ServerEventRequest) obj;

    if (msgId_ != other.msgId_) return false;
    if (getType()
        != other.getType()) return false;
    if (getServerId()
        != other.getServerId()) return false;
    if (getId()
        != other.getId()) return false;
    if (!getIdsList()
        .equals(other.getIdsList())) return false;
    if (!getInfo()
        .equals(other.getInfo())) return false;
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
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + msgId_;
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + SERVERID_FIELD_NUMBER;
    hash = (53 * hash) + getServerId();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (37 * hash) + INFO_FIELD_NUMBER;
    hash = (53 * hash) + getInfo().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.server.ServerEventRequest prototype) {
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
   *服务器事件
   * </pre>
   *
   * Protobuf type {@code ServerEventRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServerEventRequest)
      info.xiaomo.server.shared.protocol.server.ServerEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.server.ServerEventRequest.class, info.xiaomo.server.shared.protocol.server.ServerEventRequest.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.handler.ServerEventRequest.newBuilder()
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
      msgId_ = 0;

      type_ = 0;

      serverId_ = 0;

      id_ = 0L;

      ids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      info_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.server.ServerMessage.internal_static_ServerEventRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerEventRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.server.ServerEventRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerEventRequest build() {
      info.xiaomo.server.shared.protocol.server.ServerEventRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.server.ServerEventRequest buildPartial() {
      info.xiaomo.server.shared.protocol.server.ServerEventRequest result = new info.xiaomo.server.shared.protocol.server.ServerEventRequest(this);
      int from_bitField0_ = bitField0_;
      result.msgId_ = msgId_;
      result.type_ = type_;
      result.serverId_ = serverId_;
      result.id_ = id_;
      if (((bitField0_ & 0x00000001) != 0)) {
        ids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
      result.info_ = info_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.server.ServerEventRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.server.ServerEventRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.server.ServerEventRequest other) {
      if (other == info.xiaomo.server.shared.protocol.server.ServerEventRequest.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getServerId() != 0) {
        setServerId(other.getServerId());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
      }
      if (!other.getInfo().isEmpty()) {
        info_ = other.info_;
        onChanged();
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
      info.xiaomo.server.shared.protocol.server.ServerEventRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.server.ServerEventRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int msgId_ = 0;
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @param value The enum numeric value on the wire for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdValue(int value) {
      
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
      return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(info.xiaomo.server.shared.protocol.msg.MsgId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      msgId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.MsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     *事件类型  1踢玩家
     * </pre>
     *
     * <code>int32 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }
    /**
     * <pre>
     *事件类型  1踢玩家
     * </pre>
     *
     * <code>int32 type = 2;</code>
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
     *事件类型  1踢玩家
     * </pre>
     *
     * <code>int32 type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int serverId_ ;
    /**
     * <pre>
     *int参数
     * </pre>
     *
     * <code>int32 serverId = 3;</code>
     * @return The serverId.
     */
    @java.lang.Override
    public int getServerId() {
      return serverId_;
    }
    /**
     * <pre>
     *int参数
     * </pre>
     *
     * <code>int32 serverId = 3;</code>
     * @param value The serverId to set.
     * @return This builder for chaining.
     */
    public Builder setServerId(int value) {
      
      serverId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *int参数
     * </pre>
     *
     * <code>int32 serverId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearServerId() {
      
      serverId_ = 0;
      onChanged();
      return this;
    }

    private long id_ ;
    /**
     * <pre>
     *long参数
     * </pre>
     *
     * <code>int64 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     *long参数
     * </pre>
     *
     * <code>int64 id = 4;</code>
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
     *long参数
     * </pre>
     *
     * <code>int64 id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList ids_ = emptyLongList();
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ids_ = mutableCopy(ids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @return A list containing the ids.
     */
    public java.util.List<java.lang.Long>
        getIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ids_) : ids_;
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @return The count of ids.
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @param index The index of the element to return.
     * @return The ids at the given index.
     */
    public long getIds(int index) {
      return ids_.getLong(index);
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @param index The index to set the value at.
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        int index, long value) {
      ensureIdsIsMutable();
      ids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @param value The ids to add.
     * @return This builder for chaining.
     */
    public Builder addIds(long value) {
      ensureIdsIsMutable();
      ids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @param values The ids to add.
     * @return This builder for chaining.
     */
    public Builder addAllIds(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *Id列表
     * </pre>
     *
     * <code>repeated int64 ids = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      ids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object info_ = "";
    /**
     * <pre>
     *其他额外信息
     * </pre>
     *
     * <code>string info = 6;</code>
     * @return The info.
     */
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *其他额外信息
     * </pre>
     *
     * <code>string info = 6;</code>
     * @return The bytes for info.
     */
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *其他额外信息
     * </pre>
     *
     * <code>string info = 6;</code>
     * @param value The info to set.
     * @return This builder for chaining.
     */
    public Builder setInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      info_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *其他额外信息
     * </pre>
     *
     * <code>string info = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearInfo() {
      
      info_ = getDefaultInstance().getInfo();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *其他额外信息
     * </pre>
     *
     * <code>string info = 6;</code>
     * @param value The bytes for info to set.
     * @return This builder for chaining.
     */
    public Builder setInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      info_ = value;
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


    // @@protoc_insertion_point(builder_scope:ServerEventRequest)
  }

  // @@protoc_insertion_point(class_scope:ServerEventRequest)
  private static final info.xiaomo.server.shared.protocol.server.ServerEventRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.server.ServerEventRequest();
  }

  public static info.xiaomo.server.shared.protocol.server.ServerEventRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerEventRequest>
      PARSER = new com.google.protobuf.AbstractParser<ServerEventRequest>() {
    @java.lang.Override
    public ServerEventRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerEventRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.server.ServerEventRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

