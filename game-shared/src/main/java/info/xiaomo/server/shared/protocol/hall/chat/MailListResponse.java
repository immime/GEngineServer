// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallChatMessage.proto

package info.xiaomo.server.shared.protocol.hall.chat;

/**
 * <pre>
 *请求邮件列表
 * </pre>
 *
 * Protobuf type {@code MailListResponse}
 */
public final class MailListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MailListResponse)
    MailListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MailListResponse.newBuilder() to construct.
  private MailListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MailListResponse() {
    msgId_ = 0;
    mails_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MailListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MailListResponse(
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
              mails_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.hall.chat.MailInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            mails_.add(
                input.readMessage(info.xiaomo.server.shared.protocol.hall.chat.MailInfo.parser(), extensionRegistry));
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
        mails_ = java.util.Collections.unmodifiableList(mails_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_MailListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_MailListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.class, info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.Builder.class);
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

  public static final int MAILS_FIELD_NUMBER = 2;
  private java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo> mails_;
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  @java.lang.Override
  public java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo> getMailsList() {
    return mails_;
  }
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder> 
      getMailsOrBuilderList() {
    return mails_;
  }
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  @java.lang.Override
  public int getMailsCount() {
    return mails_.size();
  }
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.chat.MailInfo getMails(int index) {
    return mails_.get(index);
  }
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder getMailsOrBuilder(
      int index) {
    return mails_.get(index);
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
    for (int i = 0; i < mails_.size(); i++) {
      output.writeMessage(2, mails_.get(i));
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
    for (int i = 0; i < mails_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, mails_.get(i));
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.chat.MailListResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.chat.MailListResponse other = (info.xiaomo.server.shared.protocol.hall.chat.MailListResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (!getMailsList()
        .equals(other.getMailsList())) return false;
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
    if (getMailsCount() > 0) {
      hash = (37 * hash) + MAILS_FIELD_NUMBER;
      hash = (53 * hash) + getMailsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.chat.MailListResponse prototype) {
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
   *请求邮件列表
   * </pre>
   *
   * Protobuf type {@code MailListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MailListResponse)
      info.xiaomo.server.shared.protocol.hall.chat.MailListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_MailListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_MailListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.class, info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.Builder.class);
    }

    // Construct using info.xiaomo.handler.shared.protocol.hall.chat.MailListResponse.newBuilder()
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
        getMailsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      if (mailsBuilder_ == null) {
        mails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mailsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_MailListResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.MailListResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.MailListResponse build() {
      info.xiaomo.server.shared.protocol.hall.chat.MailListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.MailListResponse buildPartial() {
      info.xiaomo.server.shared.protocol.hall.chat.MailListResponse result = new info.xiaomo.server.shared.protocol.hall.chat.MailListResponse(this);
      int from_bitField0_ = bitField0_;
      result.msgId_ = msgId_;
      if (mailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mails_ = java.util.Collections.unmodifiableList(mails_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mails_ = mails_;
      } else {
        result.mails_ = mailsBuilder_.build();
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.chat.MailListResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.chat.MailListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.chat.MailListResponse other) {
      if (other == info.xiaomo.server.shared.protocol.hall.chat.MailListResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (mailsBuilder_ == null) {
        if (!other.mails_.isEmpty()) {
          if (mails_.isEmpty()) {
            mails_ = other.mails_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMailsIsMutable();
            mails_.addAll(other.mails_);
          }
          onChanged();
        }
      } else {
        if (!other.mails_.isEmpty()) {
          if (mailsBuilder_.isEmpty()) {
            mailsBuilder_.dispose();
            mailsBuilder_ = null;
            mails_ = other.mails_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mailsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMailsFieldBuilder() : null;
          } else {
            mailsBuilder_.addAllMessages(other.mails_);
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
      info.xiaomo.server.shared.protocol.hall.chat.MailListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.chat.MailListResponse) e.getUnfinishedMessage();
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

    private java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo> mails_ =
      java.util.Collections.emptyList();
    private void ensureMailsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mails_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.hall.chat.MailInfo>(mails_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.chat.MailInfo, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder, info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder> mailsBuilder_;

    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo> getMailsList() {
      if (mailsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mails_);
      } else {
        return mailsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public int getMailsCount() {
      if (mailsBuilder_ == null) {
        return mails_.size();
      } else {
        return mailsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.chat.MailInfo getMails(int index) {
      if (mailsBuilder_ == null) {
        return mails_.get(index);
      } else {
        return mailsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder setMails(
        int index, info.xiaomo.server.shared.protocol.hall.chat.MailInfo value) {
      if (mailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMailsIsMutable();
        mails_.set(index, value);
        onChanged();
      } else {
        mailsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder setMails(
        int index, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder builderForValue) {
      if (mailsBuilder_ == null) {
        ensureMailsIsMutable();
        mails_.set(index, builderForValue.build());
        onChanged();
      } else {
        mailsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder addMails(info.xiaomo.server.shared.protocol.hall.chat.MailInfo value) {
      if (mailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMailsIsMutable();
        mails_.add(value);
        onChanged();
      } else {
        mailsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder addMails(
        int index, info.xiaomo.server.shared.protocol.hall.chat.MailInfo value) {
      if (mailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMailsIsMutable();
        mails_.add(index, value);
        onChanged();
      } else {
        mailsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder addMails(
        info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder builderForValue) {
      if (mailsBuilder_ == null) {
        ensureMailsIsMutable();
        mails_.add(builderForValue.build());
        onChanged();
      } else {
        mailsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder addMails(
        int index, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder builderForValue) {
      if (mailsBuilder_ == null) {
        ensureMailsIsMutable();
        mails_.add(index, builderForValue.build());
        onChanged();
      } else {
        mailsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder addAllMails(
        java.lang.Iterable<? extends info.xiaomo.server.shared.protocol.hall.chat.MailInfo> values) {
      if (mailsBuilder_ == null) {
        ensureMailsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mails_);
        onChanged();
      } else {
        mailsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder clearMails() {
      if (mailsBuilder_ == null) {
        mails_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mailsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public Builder removeMails(int index) {
      if (mailsBuilder_ == null) {
        ensureMailsIsMutable();
        mails_.remove(index);
        onChanged();
      } else {
        mailsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder getMailsBuilder(
        int index) {
      return getMailsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder getMailsOrBuilder(
        int index) {
      if (mailsBuilder_ == null) {
        return mails_.get(index);  } else {
        return mailsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public java.util.List<? extends info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder> 
         getMailsOrBuilderList() {
      if (mailsBuilder_ != null) {
        return mailsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mails_);
      }
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder addMailsBuilder() {
      return getMailsFieldBuilder().addBuilder(
          info.xiaomo.server.shared.protocol.hall.chat.MailInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder addMailsBuilder(
        int index) {
      return getMailsFieldBuilder().addBuilder(
          index, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *邮件列表
     * </pre>
     *
     * <code>repeated .MailInfo mails = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder> 
         getMailsBuilderList() {
      return getMailsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.chat.MailInfo, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder, info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder> 
        getMailsFieldBuilder() {
      if (mailsBuilder_ == null) {
        mailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            info.xiaomo.server.shared.protocol.hall.chat.MailInfo, info.xiaomo.server.shared.protocol.hall.chat.MailInfo.Builder, info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder>(
                mails_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mails_ = null;
      }
      return mailsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:MailListResponse)
  }

  // @@protoc_insertion_point(class_scope:MailListResponse)
  private static final info.xiaomo.server.shared.protocol.hall.chat.MailListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.chat.MailListResponse();
  }

  public static info.xiaomo.server.shared.protocol.hall.chat.MailListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MailListResponse>
      PARSER = new com.google.protobuf.AbstractParser<MailListResponse>() {
    @java.lang.Override
    public MailListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MailListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MailListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MailListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.chat.MailListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

