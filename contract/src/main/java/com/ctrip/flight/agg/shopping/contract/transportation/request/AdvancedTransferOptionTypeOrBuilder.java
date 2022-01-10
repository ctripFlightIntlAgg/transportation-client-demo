// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.request.proto

package com.ctrip.flight.agg.shopping.contract.transportation.request;

public interface AdvancedTransferOptionTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.request.AdvancedTransferOptionType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 0:不限制  1：直飞  2：中转
   * </pre>
   *
   * <code>int32 TransferType = 1;</code>
   */
  int getTransferType();

  /**
   * <pre>
   * 只支持一个中转时长范围,如a-b，表示中转时长在[a,b]分钟内；不填表示时长不限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType TransferTimeRange = 3;</code>
   */
  boolean hasTransferTimeRange();
  /**
   * <pre>
   * 只支持一个中转时长范围,如a-b，表示中转时长在[a,b]分钟内；不填表示时长不限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType TransferTimeRange = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType getTransferTimeRange();
  /**
   * <pre>
   * 只支持一个中转时长范围,如a-b，表示中转时长在[a,b]分钟内；不填表示时长不限
   * </pre>
   *
   * <code>.com.ctrip.flight.agg.shopping.contract.transportation.IntRangeType TransferTimeRange = 3;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.IntRangeTypeOrBuilder getTransferTimeRangeOrBuilder();

  /**
   * <pre>
   *表示行程包含这个中转点；不填表示中转点不限.
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType TransferLocation = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType> 
      getTransferLocationList();
  /**
   * <pre>
   *表示行程包含这个中转点；不填表示中转点不限.
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType TransferLocation = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType getTransferLocation(int index);
  /**
   * <pre>
   *表示行程包含这个中转点；不填表示中转点不限.
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType TransferLocation = 4;</code>
   */
  int getTransferLocationCount();
  /**
   * <pre>
   *表示行程包含这个中转点；不填表示中转点不限.
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType TransferLocation = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder> 
      getTransferLocationOrBuilderList();
  /**
   * <pre>
   *表示行程包含这个中转点；不填表示中转点不限.
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.request.LocationType TransferLocation = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.request.LocationTypeOrBuilder getTransferLocationOrBuilder(
      int index);
}
