// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface CreditPointsTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.CreditPointsType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 引用关联关系
   * </pre>
   *
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 预扣积分
   * </pre>
   *
   * <code>int32 Points = 2;</code>
   */
  int getPoints();

  /**
   * <pre>
   * 预抵现金
   * </pre>
   *
   * <code>double CashAmount = 3;</code>
   */
  double getCashAmount();

  /**
   * <pre>
   * 活动ID
   * </pre>
   *
   * <code>int64 ActivityID = 4;</code>
   */
  long getActivityID();
}