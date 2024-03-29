// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface CashBackTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.CashBackType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 RefNum = 1;</code>
   */
  int getRefNum();

  /**
   * <pre>
   * 类型, 1: 普通返现, 2: 溢价返现（高返政策返现), 3: 任我游礼品卡, 4: 任我行礼品卡, 5:里程。国际机票的返现金类型是2。
   * </pre>
   *
   * <code>int32 Type = 2;</code>
   */
  int getType();

  /**
   * <pre>
   * 金额
   * </pre>
   *
   * <code>double Amount = 3;</code>
   */
  double getAmount();
}
