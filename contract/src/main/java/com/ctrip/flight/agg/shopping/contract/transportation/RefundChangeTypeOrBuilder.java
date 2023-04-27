// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface RefundChangeTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.RefundChangeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 是否可退票,1:不允许,2:允许,3:有条件
   * </pre>
   *
   * <code>int32 RefundType = 1;</code>
   */
  int getRefundType();

  /**
   * <pre>
   * 是否可更改,1:不允许,2:允许,3:有条件
   * </pre>
   *
   * <code>int32 ChangeType = 2;</code>
   */
  int getChangeType();

  /**
   * <pre>
   * 是否可签转,1:不允许,2:允许,3:有条件
   * </pre>
   *
   * <code>int32 EndorseType = 3;</code>
   */
  int getEndorseType();

  /**
   * <pre>
   * 最小退票费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinRefundFee = 4;</code>
   */
  boolean hasMinRefundFee();
  /**
   * <pre>
   * 最小退票费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinRefundFee = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DoubleType getMinRefundFee();
  /**
   * <pre>
   * 最小退票费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinRefundFee = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DoubleTypeOrBuilder getMinRefundFeeOrBuilder();

  /**
   * <pre>
   * 最小改期费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinChangeFee = 5;</code>
   */
  boolean hasMinChangeFee();
  /**
   * <pre>
   * 最小改期费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinChangeFee = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DoubleType getMinChangeFee();
  /**
   * <pre>
   * 最小改期费，-1 和 null 表示费用待确认; 请注意区分0和null
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.DoubleType MinChangeFee = 5;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.DoubleTypeOrBuilder getMinChangeFeeOrBuilder();

  /**
   * <pre>
   * 退改签相关类型信息,例如 NotSingleRefund:合并支付不可单退
   * </pre>
   *
   * <code>repeated string RefundChangeAttribute = 6;</code>
   */
  java.util.List<java.lang.String>
      getRefundChangeAttributeList();
  /**
   * <pre>
   * 退改签相关类型信息,例如 NotSingleRefund:合并支付不可单退
   * </pre>
   *
   * <code>repeated string RefundChangeAttribute = 6;</code>
   */
  int getRefundChangeAttributeCount();
  /**
   * <pre>
   * 退改签相关类型信息,例如 NotSingleRefund:合并支付不可单退
   * </pre>
   *
   * <code>repeated string RefundChangeAttribute = 6;</code>
   */
  java.lang.String getRefundChangeAttribute(int index);
  /**
   * <pre>
   * 退改签相关类型信息,例如 NotSingleRefund:合并支付不可单退
   * </pre>
   *
   * <code>repeated string RefundChangeAttribute = 6;</code>
   */
  com.google.protobuf.ByteString
      getRefundChangeAttributeBytes(int index);
}