// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallChatMessage.proto

package info.xiaomo.server.shared.protocol.hall.chat;

public final class HallChatMessage {
  private HallChatMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChatResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChatResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MailListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MailListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyMailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyMailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ModifyMailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ModifyMailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MailInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025HallChatMessage.proto\032\017MessageId.proto" +
      "\"b\n\013ChatRequest\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\033" +
      "\n\010chatType\030\002 \001(\0162\t.ChatType\022\022\n\nreceiverI" +
      "d\030\003 \001(\003\022\013\n\003msg\030\004 \001(\t\"\211\001\n\014ChatResponse\022\025\n" +
      "\005msgId\030\001 \001(\0162\006.MsgId\022\020\n\010senderId\030\002 \001(\003\022\022" +
      "\n\nsenderHead\030\003 \001(\t\022\022\n\nsenderNick\030\004 \001(\t\022\033" +
      "\n\010chatType\030\005 \001(\0162\t.ChatType\022\013\n\003msg\030\006 \001(\t" +
      "\"(\n\017MailListRequest\022\025\n\005msgId\030\001 \001(\0162\006.Msg" +
      "Id\"C\n\020MailListResponse\022\025\n\005msgId\030\001 \001(\0162\006." +
      "MsgId\022\030\n\005mails\030\002 \003(\0132\t.MailInfo\"I\n\021Modif" +
      "yMailRequest\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\016\n\006m" +
      "ailId\030\002 \001(\003\022\r\n\005state\030\003 \001(\005\";\n\022ModifyMail" +
      "Response\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\016\n\006resul" +
      "t\030\002 \001(\005\"k\n\010MailInfo\022\n\n\002id\030\001 \001(\003\022\020\n\010sende" +
      "rId\030\002 \001(\003\022\r\n\005title\030\003 \001(\t\022\017\n\007content\030\004 \001(" +
      "\t\022\r\n\005state\030\005 \001(\005\022\022\n\ncreateTime\030\006 \001(\003*A\n\010" +
      "ChatType\022\t\n\005Error\020\000\022\013\n\007PRIVATE\020\001\022\t\n\005GUIL" +
      "D\020\002\022\t\n\005WORLD\020\003\022\007\n\003PMD\020\004B0\n,info.xiaomo.s" +
      "erver.shared.protocol.hall.chatP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor(),
        });
    internal_static_ChatRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatRequest_descriptor,
        new java.lang.String[] { "MsgId", "ChatType", "ReceiverId", "Msg", });
    internal_static_ChatResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ChatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChatResponse_descriptor,
        new java.lang.String[] { "MsgId", "SenderId", "SenderHead", "SenderNick", "ChatType", "Msg", });
    internal_static_MailListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MailListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MailListRequest_descriptor,
        new java.lang.String[] { "MsgId", });
    internal_static_MailListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MailListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MailListResponse_descriptor,
        new java.lang.String[] { "MsgId", "Mails", });
    internal_static_ModifyMailRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ModifyMailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyMailRequest_descriptor,
        new java.lang.String[] { "MsgId", "MailId", "State", });
    internal_static_ModifyMailResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ModifyMailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ModifyMailResponse_descriptor,
        new java.lang.String[] { "MsgId", "Result", });
    internal_static_MailInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_MailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MailInfo_descriptor,
        new java.lang.String[] { "Id", "SenderId", "Title", "Content", "State", "CreateTime", });
    info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}