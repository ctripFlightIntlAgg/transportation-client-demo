// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.response.proto

package com.ctrip.flight.agg.shopping.contract.transportation.response;

public interface MembershipChallengeTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.response.MembershipChallengeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 政策ID
   * </pre>
   *
   * <code>int64 PolicyID = 1;</code>
   */
  long getPolicyID();

  /**
   * <pre>
   * 挑战赛报名开始时间, 格式yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ActivityEffectTime = 2;</code>
   */
  java.lang.String getActivityEffectTime();
  /**
   * <pre>
   * 挑战赛报名开始时间, 格式yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ActivityEffectTime = 2;</code>
   */
  com.google.protobuf.ByteString
      getActivityEffectTimeBytes();

  /**
   * <pre>
   * 挑战赛报名截止时间, 格式yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ActivityExpireTime = 3;</code>
   */
  java.lang.String getActivityExpireTime();
  /**
   * <pre>
   * 挑战赛报名截止时间, 格式yyyy-MM-dd HH:mm:ss
   * </pre>
   *
   * <code>string ActivityExpireTime = 3;</code>
   */
  com.google.protobuf.ByteString
      getActivityExpireTimeBytes();

  /**
   * <pre>
   * 活动信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType Activity = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType> 
      getActivityList();
  /**
   * <pre>
   * 活动信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType Activity = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType getActivity(int index);
  /**
   * <pre>
   * 活动信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType Activity = 4;</code>
   */
  int getActivityCount();
  /**
   * <pre>
   * 活动信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType Activity = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityTypeOrBuilder> 
      getActivityOrBuilderList();
  /**
   * <pre>
   * 活动信息列表
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityType Activity = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.response.ActivityTypeOrBuilder getActivityOrBuilder(
      int index);
}