// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

public interface ApplyAthleticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ApplyAthleticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.MsgId getMsgId();

  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>int32 result = 2;</code>
   * @return The result.
   */
  int getResult();

  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @return A list containing the roleId.
   */
  java.util.List<java.lang.Long> getRoleIdList();
  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @return The count of roleId.
   */
  int getRoleIdCount();
  /**
   * <pre>
   *报名的玩家ID
   * </pre>
   *
   * <code>repeated int64 roleId = 3;</code>
   * @param index The index of the element to return.
   * @return The roleId at the given index.
   */
  long getRoleId(int index);
}