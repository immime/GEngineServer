// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

public interface FishInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FishInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *唯一ID，多个为鱼群
   * </pre>
   *
   * <code>repeated int64 id = 1;</code>
   * @return A list containing the id.
   */
  java.util.List<java.lang.Long> getIdList();
  /**
   * <pre>
   *唯一ID，多个为鱼群
   * </pre>
   *
   * <code>repeated int64 id = 1;</code>
   * @return The count of id.
   */
  int getIdCount();
  /**
   * <pre>
   *唯一ID，多个为鱼群
   * </pre>
   *
   * <code>repeated int64 id = 1;</code>
   * @param index The index of the element to return.
   * @return The id at the given index.
   */
  long getId(int index);

  /**
   * <pre>
   *鱼配置ID（和id对应，同一鱼群不同的鱼）
   * </pre>
   *
   * <code>repeated int32 configId = 2;</code>
   * @return A list containing the configId.
   */
  java.util.List<java.lang.Integer> getConfigIdList();
  /**
   * <pre>
   *鱼配置ID（和id对应，同一鱼群不同的鱼）
   * </pre>
   *
   * <code>repeated int32 configId = 2;</code>
   * @return The count of configId.
   */
  int getConfigIdCount();
  /**
   * <pre>
   *鱼配置ID（和id对应，同一鱼群不同的鱼）
   * </pre>
   *
   * <code>repeated int32 configId = 2;</code>
   * @param index The index of the element to return.
   * @return The configId at the given index.
   */
  int getConfigId(int index);

  /**
   * <pre>
   *鱼游动的轨迹ID 鱼潮发阵型ID
   * </pre>
   *
   * <code>repeated int32 trackId = 3;</code>
   * @return A list containing the trackId.
   */
  java.util.List<java.lang.Integer> getTrackIdList();
  /**
   * <pre>
   *鱼游动的轨迹ID 鱼潮发阵型ID
   * </pre>
   *
   * <code>repeated int32 trackId = 3;</code>
   * @return The count of trackId.
   */
  int getTrackIdCount();
  /**
   * <pre>
   *鱼游动的轨迹ID 鱼潮发阵型ID
   * </pre>
   *
   * <code>repeated int32 trackId = 3;</code>
   * @param index The index of the element to return.
   * @return The trackId at the given index.
   */
  int getTrackId(int index);

  /**
   * <pre>
   *鱼群阵型 0普通情况 1boss 100阵型id
   * </pre>
   *
   * <code>int32 formation = 4;</code>
   * @return The formation.
   */
  int getFormation();

  /**
   * <pre>
   *出生时间戳
   * </pre>
   *
   * <code>int64 bornTime = 5;</code>
   * @return The bornTime.
   */
  long getBornTime();

  /**
   * <pre>
   *系统时间戳
   * </pre>
   *
   * <code>int64 serverTime = 6;</code>
   * @return The serverTime.
   */
  long getServerTime();

  /**
   * <pre>
   *速度
   * </pre>
   *
   * <code>int32 speed = 7;</code>
   * @return The speed.
   */
  int getSpeed();

  /**
   * <pre>
   *极速
   * </pre>
   *
   * <code>int32 topSpeed = 9;</code>
   * @return The topSpeed.
   */
  int getTopSpeed();

  /**
   * <pre>
   *极速开始时间
   * </pre>
   *
   * <code>int64 topSpeedStartTime = 10;</code>
   * @return The topSpeedStartTime.
   */
  long getTopSpeedStartTime();
}