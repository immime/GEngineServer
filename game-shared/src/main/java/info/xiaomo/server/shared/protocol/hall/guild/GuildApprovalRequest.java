// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *管理员公会审批（批准加入、踢人、解散...）
 * </pre>
 *
 * Protobuf type {@code GuildApprovalRequest}
 */
public final class GuildApprovalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuildApprovalRequest)
    GuildApprovalRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuildApprovalRequest.newBuilder() to construct.
  private GuildApprovalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuildApprovalRequest() {
    msgId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuildApprovalRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuildApprovalRequest(
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
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 16: {

            roleId_ = input.readInt64();
            break;
          }
          case 24: {

            type_ = input.readInt32();
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
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildApprovalRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildApprovalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.class, info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.Builder.class);
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

  public static final int ROLEID_FIELD_NUMBER = 2;
  private long roleId_;
  /**
   * <pre>
   *被操作的角色
   * </pre>
   *
   * <code>int64 roleId = 2;</code>
   * @return The roleId.
   */
  @java.lang.Override
  public long getRoleId() {
    return roleId_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <pre>
   *操作类型 0批准加入、1踢人、2解散
   * </pre>
   *
   * <code>int32 type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
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
    if (roleId_ != 0L) {
      output.writeInt64(2, roleId_);
    }
    if (type_ != 0) {
      output.writeInt32(3, type_);
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
    if (roleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, roleId_);
    }
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, type_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest other = (info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest) obj;

    if (msgId_ != other.msgId_) return false;
    if (getRoleId()
        != other.getRoleId()) return false;
    if (getType()
        != other.getType()) return false;
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
    hash = (37 * hash) + ROLEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRoleId());
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest prototype) {
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
   *管理员公会审批（批准加入、踢人、解散...）
   * </pre>
   *
   * Protobuf type {@code GuildApprovalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuildApprovalRequest)
      info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildApprovalRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildApprovalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.class, info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.hall.guild.GuildApprovalRequest.newBuilder()
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

      roleId_ = 0L;

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildApprovalRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest build() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest result = new info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest(this);
      result.msgId_ = msgId_;
      result.roleId_ = roleId_;
      result.type_ = type_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.getRoleId() != 0L) {
        setRoleId(other.getRoleId());
      }
      if (other.getType() != 0) {
        setType(other.getType());
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
      info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private long roleId_ ;
    /**
     * <pre>
     *被操作的角色
     * </pre>
     *
     * <code>int64 roleId = 2;</code>
     * @return The roleId.
     */
    @java.lang.Override
    public long getRoleId() {
      return roleId_;
    }
    /**
     * <pre>
     *被操作的角色
     * </pre>
     *
     * <code>int64 roleId = 2;</code>
     * @param value The roleId to set.
     * @return This builder for chaining.
     */
    public Builder setRoleId(long value) {
      
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *被操作的角色
     * </pre>
     *
     * <code>int64 roleId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoleId() {
      
      roleId_ = 0L;
      onChanged();
      return this;
    }

    private int type_ ;
    /**
     * <pre>
     *操作类型 0批准加入、1踢人、2解散
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
     *操作类型 0批准加入、1踢人、2解散
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
     *操作类型 0批准加入、1踢人、2解散
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


    // @@protoc_insertion_point(builder_scope:GuildApprovalRequest)
  }

  // @@protoc_insertion_point(class_scope:GuildApprovalRequest)
  private static final info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GuildApprovalRequest>
      PARSER = new com.google.protobuf.AbstractParser<GuildApprovalRequest>() {
    @java.lang.Override
    public GuildApprovalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuildApprovalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuildApprovalRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuildApprovalRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildApprovalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

