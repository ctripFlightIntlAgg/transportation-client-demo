// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com.ctrip.flight.agg.shopping.contract.transportation.proto

package com.ctrip.flight.agg.shopping.contract.transportation;

public interface InterchangeTypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ctrip.flight.agg.shopping.contract.transportation.InterchangeType)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 程号，从1开始
   * </pre>
   *
   * <code>int32 JourneyNo = 1;</code>
   */
  int getJourneyNo();

  /**
   * <pre>
   * 每一程内的段号，从1开始
   * </pre>
   *
   * <code>int32 SegmentNo = 2;</code>
   */
  int getSegmentNo();

  /**
   * <pre>
   * 换乘信息是在段前还是段后， 1：段前， 2：段后
   * </pre>
   *
   * <code>int32 Position = 3;</code>
   */
  int getPosition();

  /**
   * <pre>
   * 换乘的格式化信息, List表示不同的换乘路线
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType InterchangeRoute = 4;</code>
   */
  java.util.List<com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType> 
      getInterchangeRouteList();
  /**
   * <pre>
   * 换乘的格式化信息, List表示不同的换乘路线
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType InterchangeRoute = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType getInterchangeRoute(int index);
  /**
   * <pre>
   * 换乘的格式化信息, List表示不同的换乘路线
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType InterchangeRoute = 4;</code>
   */
  int getInterchangeRouteCount();
  /**
   * <pre>
   * 换乘的格式化信息, List表示不同的换乘路线
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType InterchangeRoute = 4;</code>
   */
  java.util.List<? extends com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteTypeOrBuilder> 
      getInterchangeRouteOrBuilderList();
  /**
   * <pre>
   * 换乘的格式化信息, List表示不同的换乘路线
   * </pre>
   *
   * <code>repeated .com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteType InterchangeRoute = 4;</code>
   */
  com.ctrip.flight.agg.shopping.contract.transportation.InterchangeRouteTypeOrBuilder getInterchangeRouteOrBuilder(
      int index);

  /**
   * <pre>
   * 换乘的非格式化信息，索引号
   * </pre>
   *
   * <code>int32 TextRemarkRef = 5;</code>
   */
  int getTextRemarkRef();

  /**
   * <pre>
   * CheckIn的描述信息, 索引号
   * </pre>
   *
   * <code>int32 CheckInRemarkRef = 6;</code>
   */
  int getCheckInRemarkRef();
}
