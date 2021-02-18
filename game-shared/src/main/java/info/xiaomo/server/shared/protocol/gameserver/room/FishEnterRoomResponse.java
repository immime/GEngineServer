// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

/**
 * <pre>
 *鱼进入房间
 * </pre>
 *
 * Protobuf type {@code FishEnterRoomResponse}
 */
public final class FishEnterRoomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FishEnterRoomResponse)
    FishEnterRoomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FishEnterRoomResponse.newBuilder() to construct.
  private FishEnterRoomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FishEnterRoomResponse() {
    msgId_ = 0;
    fishInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FishEnterRoomResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FishEnterRoomResponse(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fishInfo_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            fishInfo_.add(
                input.readMessage(info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.parser(), extensionRegistry));
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
        fishInfo_ = java.util.Collections.unmodifiableList(fishInfo_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_FishEnterRoomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_FishEnterRoomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.class, info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
  }

  public static final int FISHINFO_FIELD_NUMBER = 2;
  private java.util.List<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo> fishInfo_;
  /**
   * <pre>
   *进入的鱼群
   * </pre>
   *
   * <code>repeated .FishInfo fishInfo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo> getFishInfoList() {
    return fishInfo_;
  }
  /**
   * <pre>
   *进入的鱼群
   * </pre>
   *
   * <code>repeated .FishInfo fishInfo = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder> 
      getFishInfoOrBuilderList() {
    return fishInfo_;
  }
  /**
   * <pre>
   *进入的鱼群
   * </pre>
   *
   * <code>repeated .FishInfo fishInfo = 2;</code>
   */
  @java.lang.Override
  public int getFishInfoCount() {
    return fishInfo_.size();
  }
  /**
   * <pre>
   *进入的鱼群
   * </pre>
   *
   * <code>repeated .FishInfo fishInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.FishInfo getFishInfo(int index) {
    return fishInfo_.get(index);
  }
  /**
   * <pre>
   *进入的鱼群
   * </pre>
   *
   * <code>repeated .FishInfo fishInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder getFishInfoOrBuilder(
      int index) {
    return fishInfo_.get(index);
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
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      output.writeEnum(1, msgId_);
    }
    for (int i = 0; i < fishInfo_.size(); i++) {
      output.writeMessage(2, fishInfo_.get(i));
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
    for (int i = 0; i < fishInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, fishInfo_.get(i));
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse other = (info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (!getFishInfoList()
        .equals(other.getFishInfoList())) return false;
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
    if (getFishInfoCount() > 0) {
      hash = (37 * hash) + FISHINFO_FIELD_NUMBER;
      hash = (53 * hash) + getFishInfoList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse prototype) {
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
   *鱼进入房间
   * </pre>
   *
   * Protobuf type {@code FishEnterRoomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FishEnterRoomResponse)
      info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_FishEnterRoomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_FishEnterRoomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.class, info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.gameserver.handler.FishEnterRoomResponse.newBuilder()
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
        getFishInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      if (fishInfoBuilder_ == null) {
        fishInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fishInfoBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_FishEnterRoomResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse build() {
      info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse result = new info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse(this);
      int from_bitField0_ = bitField0_;
      result.msgId_ = msgId_;
      if (fishInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fishInfo_ = java.util.Collections.unmodifiableList(fishInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fishInfo_ = fishInfo_;
      } else {
        result.fishInfo_ = fishInfoBuilder_.build();
      }
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
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (fishInfoBuilder_ == null) {
        if (!other.fishInfo_.isEmpty()) {
          if (fishInfo_.isEmpty()) {
            fishInfo_ = other.fishInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFishInfoIsMutable();
            fishInfo_.addAll(other.fishInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.fishInfo_.isEmpty()) {
          if (fishInfoBuilder_.isEmpty()) {
            fishInfoBuilder_.dispose();
            fishInfoBuilder_ = null;
            fishInfo_ = other.fishInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fishInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFishInfoFieldBuilder() : null;
          } else {
            fishInfoBuilder_.addAllMessages(other.fishInfo_);
          }
        }
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
      info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse) e.getUnfinishedMessage();
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
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
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
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo> fishInfo_ =
      java.util.Collections.emptyList();
    private void ensureFishInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fishInfo_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo>(fishInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.gameserver.room.FishInfo, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder> fishInfoBuilder_;

    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo> getFishInfoList() {
      if (fishInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fishInfo_);
      } else {
        return fishInfoBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public int getFishInfoCount() {
      if (fishInfoBuilder_ == null) {
        return fishInfo_.size();
      } else {
        return fishInfoBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.FishInfo getFishInfo(int index) {
      if (fishInfoBuilder_ == null) {
        return fishInfo_.get(index);
      } else {
        return fishInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder setFishInfo(
        int index, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo value) {
      if (fishInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFishInfoIsMutable();
        fishInfo_.set(index, value);
        onChanged();
      } else {
        fishInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder setFishInfo(
        int index, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder builderForValue) {
      if (fishInfoBuilder_ == null) {
        ensureFishInfoIsMutable();
        fishInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        fishInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder addFishInfo(info.xiaomo.server.shared.protocol.gameserver.room.FishInfo value) {
      if (fishInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFishInfoIsMutable();
        fishInfo_.add(value);
        onChanged();
      } else {
        fishInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder addFishInfo(
        int index, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo value) {
      if (fishInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFishInfoIsMutable();
        fishInfo_.add(index, value);
        onChanged();
      } else {
        fishInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder addFishInfo(
        info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder builderForValue) {
      if (fishInfoBuilder_ == null) {
        ensureFishInfoIsMutable();
        fishInfo_.add(builderForValue.build());
        onChanged();
      } else {
        fishInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder addFishInfo(
        int index, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder builderForValue) {
      if (fishInfoBuilder_ == null) {
        ensureFishInfoIsMutable();
        fishInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        fishInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder addAllFishInfo(
        java.lang.Iterable<? extends info.xiaomo.server.shared.protocol.gameserver.room.FishInfo> values) {
      if (fishInfoBuilder_ == null) {
        ensureFishInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fishInfo_);
        onChanged();
      } else {
        fishInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder clearFishInfo() {
      if (fishInfoBuilder_ == null) {
        fishInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fishInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public Builder removeFishInfo(int index) {
      if (fishInfoBuilder_ == null) {
        ensureFishInfoIsMutable();
        fishInfo_.remove(index);
        onChanged();
      } else {
        fishInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder getFishInfoBuilder(
        int index) {
      return getFishInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder getFishInfoOrBuilder(
        int index) {
      if (fishInfoBuilder_ == null) {
        return fishInfo_.get(index);  } else {
        return fishInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public java.util.List<? extends info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder> 
         getFishInfoOrBuilderList() {
      if (fishInfoBuilder_ != null) {
        return fishInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fishInfo_);
      }
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder addFishInfoBuilder() {
      return getFishInfoFieldBuilder().addBuilder(
          info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder addFishInfoBuilder(
        int index) {
      return getFishInfoFieldBuilder().addBuilder(
          index, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *进入的鱼群
     * </pre>
     *
     * <code>repeated .FishInfo fishInfo = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder> 
         getFishInfoBuilderList() {
      return getFishInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.gameserver.room.FishInfo, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder> 
        getFishInfoFieldBuilder() {
      if (fishInfoBuilder_ == null) {
        fishInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            info.xiaomo.server.shared.protocol.gameserver.room.FishInfo, info.xiaomo.server.shared.protocol.gameserver.room.FishInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.FishInfoOrBuilder>(
                fishInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fishInfo_ = null;
      }
      return fishInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:FishEnterRoomResponse)
  }

  // @@protoc_insertion_point(class_scope:FishEnterRoomResponse)
  private static final info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FishEnterRoomResponse>
      PARSER = new com.google.protobuf.AbstractParser<FishEnterRoomResponse>() {
    @java.lang.Override
    public FishEnterRoomResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FishEnterRoomResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FishEnterRoomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FishEnterRoomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.FishEnterRoomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

